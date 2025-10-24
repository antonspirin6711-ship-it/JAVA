package task10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Computer> computers = new ArrayList<>();
    public void addComputer(Computer c) { computers.add(c); }
    public void removeComputer(Computer c) { computers.remove(c); }
    public Computer findComputer(Brand brand) {
        for (Computer c : computers) { if (c.brand == brand) return c; }
        return null;
    }
    public void printComputers() {
        for(Computer c : computers) System.out.println(c);
    }
}

