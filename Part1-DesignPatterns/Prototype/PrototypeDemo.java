package Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Design Patterns in Java");
        Book b2 = b1.clone();

        System.out.println("Original: " + b1);
        System.out.println("Clone: " + b2);
    }
}
