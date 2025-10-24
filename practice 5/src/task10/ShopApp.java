package task10;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        Scanner scanner = new Scanner(System.in);
        // Добавим несколько компьютеров для примера
        myShop.addComputer(new Computer(Brand.APPLE, "M2", 16, 14.2));
        myShop.addComputer(new Computer(Brand.DELL, "i7", 32, 15.6));

        System.out.println("All computers:");
        myShop.printComputers();

        System.out.print("\nEnter brand to find (e.g., APPLE): ");
        String brandToFind = scanner.next().toUpperCase();
        Computer found = myShop.findComputer(Brand.valueOf(brandToFind));
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not found.");
        }
    }
}
