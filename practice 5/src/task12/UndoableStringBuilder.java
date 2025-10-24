package task12;

import java.util.Stack;

/**
 * Класс-обертка над StringBuilder, добавляющий возможность отмены (undo).
 * Использует стек для хранения предыдущих состояний строки.
 */
public class UndoableStringBuilder {

    private StringBuilder stringBuilder;
    private Stack<String> history; // Стек для хранения "снимков" состояний

    /**
     * Конструктор по умолчанию.
     */
    public UndoableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.history = new Stack<>();
    }

    /**
     * Отменяет последнюю операцию, восстанавливая предыдущее состояние строки.
     */
    public void undo() {
        if (!history.isEmpty()) {
            // Восстанавливаем строку из последнего "снимка" в стеке
            this.stringBuilder = new StringBuilder(history.pop());
        } else {
            System.out.println("История пуста. Нечего отменять.");
        }
    }

    /**
     * Обертка над методом append().
     * @param str строка для добавления.
     * @return текущий объект UndoableStringBuilder.
     */
    public UndoableStringBuilder append(String str) {
        history.push(stringBuilder.toString()); // Сохраняем состояние ПЕРЕД изменением
        stringBuilder.append(str);
        return this;
    }

    /**
     * Обертка над методом delete().
     * @param start начальный индекс.
     * @param end конечный индекс.
     * @return текущий объект UndoableStringBuilder.
     */
    public UndoableStringBuilder delete(int start, int end) {
        history.push(stringBuilder.toString());
        stringBuilder.delete(start, end);
        return this;
    }

    /**
     * Обертка над методом reverse().
     * @return текущий объект UndoableStringBuilder.
     */
    public UndoableStringBuilder reverse() {
        history.push(stringBuilder.toString());
        stringBuilder.reverse();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
