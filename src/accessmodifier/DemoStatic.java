package src.accessmodifier;

public class DemoStatic {
    static int number = 0;
    public static void main(String[] args) {
        Integer number1 = update();
        Integer number2 = update();
        System.out.println(number1);
        System.out.println(number2);
    }

    public static int update() {
       return ++number;
    }
}
