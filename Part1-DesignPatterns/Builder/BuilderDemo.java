package Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer comp = new ComputerBuilder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .build();
        System.out.println(comp);
    }
}
