import test.Person;
import thuchanh.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài: ");
        double width = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập String: ");
        String demo = scanner.nextLine();
        System.out.println("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        System.out.println(demo);
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}
