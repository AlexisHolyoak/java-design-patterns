package facade.two;

public class TemperatureLookupWithoutFacade {

    public static void main(String[] args) {
        String zipCode = "83714";

        GeoLookupService geoLookupService = new GeoLookupService();

        String city = geoLookupService.getCityForZipCode(zipCode);
        String state = geoLookupService.getStateForZipCode(zipCode);
        Coordinates coords = geoLookupService.getCoordinatesForZipCode(zipCode);

        WeatherService weatherService = new WeatherService();
        double farenheit = weatherService.GetTempFarenheit(coords.getLatitude(), coords.getLongitude());

        EnglishMetricConverter englishMetricConverter = new EnglishMetricConverter();
        double celcius = englishMetricConverter.farenheitToCelcious(farenheit);

        System.out.format("The current temperature is %.2fF/%.2fC in %s, %s", farenheit, celcius, city, state);
    }
}
