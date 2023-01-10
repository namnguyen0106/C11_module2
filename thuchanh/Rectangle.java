package thuchanh;

public class Rectangle {
    private double width;
    private double height;

    private String name;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Chu vi là: " + this.getPerimeter()
                + ", Diện tích là: " + this.getArea();
    }

//    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
