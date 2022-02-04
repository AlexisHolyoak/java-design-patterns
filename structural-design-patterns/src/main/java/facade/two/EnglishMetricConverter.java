package facade.two;

public class EnglishMetricConverter {

    public double farenheitToCelcious(double degrees) {
        return ((degrees - 32) / 9.0) * 5.0;
    }
}