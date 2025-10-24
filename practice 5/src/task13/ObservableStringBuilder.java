package task13;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс-обертка над StringBuilder, реализующий паттерн "Наблюдатель".
 * Он оповещает всех подписчиков (слушателей) при каждом своем изменении.
 */
public class ObservableStringBuilder {
    private StringBuilder stringBuilder;
    private List<OnChangeListener> listeners; // Список подписчиков

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.listeners = new ArrayList<>();
    }

    /**
     * Добавляет нового слушателя (подписчика) в список.
     * @param listener объект, который будет получать уведомления.
     */
    public void addListener(OnChangeListener listener) {
        if (listener != null) {
            this.listeners.add(listener);
        }
    }

    /**
     * Оповещает всех подписчиков о том, что произошло изменение.
     */
    private void notifyListeners() {
        for (OnChangeListener listener : listeners) {
            listener.onChange(this);
        }
    }

    // --- Обертки над методами StringBuilder ---
    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyListeners(); // Оповещаем после изменения
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyListeners(); // Оповещаем после изменения
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
