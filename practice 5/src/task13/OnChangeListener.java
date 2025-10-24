package task13;

/**
 * Интерфейс для слушателей (наблюдателей), которые хотят получать
 * уведомления об изменениях в ObservableStringBuilder.
 */
public interface OnChangeListener {
    /**
     * Этот метод будет вызван, когда наблюдаемый объект изменится.
     * @param stringBuilder измененный объект.
     */
    void onChange(ObservableStringBuilder stringBuilder);
}
