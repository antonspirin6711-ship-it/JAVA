package task13;

public class Tester {
    public static void main(String[] args) {
        // 1. Создаем объект, за которым будем наблюдать
        ObservableStringBuilder osb = new ObservableStringBuilder();

        // 2. Создаем нашего слушателя
        OnChangeListener logger = new ConsoleLoggerListener();

        // 3. Подписываем слушателя на события от osb
        osb.addListener(logger);

        // 4. Начинаем выполнять действия, которые будут вызывать оповещения
        System.out.println("Выполняем первое действие...");
        osb.append("Добро пожаловать");

        System.out.println("\nВыполняем второе действие...");
        osb.append(" в мир Java!");

        System.out.println("\nВыполняем третье действие...");
        osb.delete(0, 17);
    }
}
