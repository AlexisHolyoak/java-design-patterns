package facade.two;

public class GeoLookupService {

    public Coordinates getCoordinatesForZipCode(String zipCode) {
        return new Coordinates(43.676422, -116.278025);
    }

    public String getCityForZipCode(String zipCode) {
        return "Boise";
    }

    public String getStateForZipCode(String zipCode) {
        return "Idaho";
    }
}