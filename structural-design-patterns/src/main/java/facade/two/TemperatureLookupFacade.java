package facade.two;

public class TemperatureLookupFacade {
    WeatherService weatherService;
    GeoLookupService geoLookupService;
    EnglishMetricConverter converter;

    public TemperatureLookupFacade() {
        weatherService = new WeatherService();
        geoLookupService = new GeoLookupService();
        converter = new EnglishMetricConverter();
    }

    public TemperatureLookupFacade(WeatherService weatherService, GeoLookupService geoLookupService,
            EnglishMetricConverter englishMetricConverter) {
        this.weatherService = weatherService;
        this.geoLookupService = geoLookupService;
        this.converter = englishMetricConverter;
    }

    public LocalTemperature getTemperature(String zipCode) {
        Coordinates coords = geoLookupService.getCoordinatesForZipCode(zipCode);
        String city = geoLookupService.getCityForZipCode(zipCode);
        String state = geoLookupService.getStateForZipCode(zipCode);

        double farenheit = weatherService.GetTempFarenheit(coords.getLatitude(), coords.getLongitude());
        double celcius = converter.farenheitToCelcious(farenheit);

        LocalTemperature localTemperature = new LocalTemperature();
        localTemperature.setFarenheit(farenheit);
        localTemperature.setCelcius(celcius);
        localTemperature.setCity(city);
        localTemperature.setState(state);

        return localTemperature;
    }
}
