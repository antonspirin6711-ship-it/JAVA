package task13;

/**
 * Конкретная реализация слушателя.
 * Его задача - просто выводить каждое изменение в консоль.
 */
public class ConsoleLoggerListener implements OnChangeListener {

    @Override
    public void onChange(ObservableStringBuilder stringBuilder) {
        System.out.println("[ЛОГ]: Произошло изменение. Новая строка: '" + stringBuilder.toString() + "'");
    }
}
