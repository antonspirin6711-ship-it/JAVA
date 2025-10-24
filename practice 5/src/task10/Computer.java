package task10;

public class Computer {
    Brand brand;
    Processor processor;
    Memory memory;
    Monitor monitor;
    public Computer(Brand b, String p, int r, double m) {
        this.brand = b; this.processor = new Processor(p);
        this.memory = new Memory(r); this.monitor = new Monitor(m);
    }
    @Override public String toString() {
        return "Computer " + brand + ": " + processor.model + ", " + memory.ram + "GB, " + monitor.diagonal + "\"";
    }
}
