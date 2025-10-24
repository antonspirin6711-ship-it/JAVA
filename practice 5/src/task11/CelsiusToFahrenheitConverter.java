package task11;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(double celsiusValue) {
        // Формула: F = (C * 9/5) + 32
        return (celsiusValue * 9.0 / 5.0) + 32;
    }
}
