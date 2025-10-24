package task11;

public class Tester {
    public static void main(String[] args) {
        double temperatureCelsius = 25.0;

        System.out.println("Исходная температура: " + temperatureCelsius + "°C");

        // 1. Создаем объект нашего конвертера в Кельвины
        Convertable kelvinConverter = new CelsiusToKelvinConverter();

        // 2. Используем его для получения результата
        double temperatureKelvin = kelvinConverter.convert(temperatureCelsius);
        System.out.println("Температура в Кельвинах: " + temperatureKelvin + " K");


        // 3. Создаем объект конвертера в Фаренгейты
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        // 4. Используем его
        double temperatureFahrenheit = fahrenheitConverter.convert(temperatureCelsius);
        System.out.println("Температура в Фаренгейтах: " + temperatureFahrenheit + "°F");
    }
}
