package task6_9;

class Book implements Printable {
    private String title;
    public Book(String title) { this.title = title; }
    @Override public void print() { System.out.println("Printing book: " + title); }
}
