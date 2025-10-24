package task12;

public class Tester {
    public static void main(String[] args) {
        UndoableStringBuilder usb = new UndoableStringBuilder();

        System.out.println("Начальное состояние: '" + usb + "'");

        usb.append("Hello");
        System.out.println("1. append(\"Hello\"): \t'" + usb + "'");

        usb.append(" World");
        System.out.println("2. append(\" World\"): \t'" + usb + "'");

        usb.delete(5, 11);
        System.out.println("3. delete(5, 11):  \t'" + usb + "'");

        System.out.println("\n--- Начинаем отмену ---");

        usb.undo();
        System.out.println("4. После undo():     \t'" + usb + "'"); // Ожидаем "Hello World"

        usb.undo();
        System.out.println("5. После undo():     \t'" + usb + "'"); // Ожидаем "Hello"

        usb.undo();
        System.out.println("6. После undo():     \t'" + usb + "'"); // Ожидаем "" (пустую строку)

        usb.undo(); // Больше отменять нечего
    }
}
