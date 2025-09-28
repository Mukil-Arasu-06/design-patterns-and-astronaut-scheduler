package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Text plain = new PlainText("Hello World");
        Text bold = new BoldDecorator(plain);

        System.out.println("Plain: " + plain.getText());
        System.out.println("Bold: " + bold.getText());
    }
}
