package Prototype;

public class Book implements Cloneable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public Book clone() {
        return new Book(this.title);
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + "]";
    }
}
