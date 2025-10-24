package task6_9;

class Journal implements Printable {
    private String name;
    public Journal(String name) { this.name = name; }
    @Override public void print() { System.out.println("Printing journal: " + name); }
}
