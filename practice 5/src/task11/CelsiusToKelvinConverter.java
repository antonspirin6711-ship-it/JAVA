package task11;

// Ключевое слово "implements" говорит, что этот класс выполняет контракт интерфейса Convertable.
public class CelsiusToKelvinConverter implements Convertable {

    // Мы обязаны реализовать метод convert(), иначе будет ошибка компиляции.
    @Override
    public double convert(double celsiusValue) {
        // Формула: K = C + 273.15
        return celsiusValue + 273.15;
    }
}
