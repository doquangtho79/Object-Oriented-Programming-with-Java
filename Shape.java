package dahinh;
import java.util.Scanner;

interface Shape2D {
    double area();     
    double perimeter(); 
}
class Circle implements Shape2D {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double w = sc.nextDouble();
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double h = sc.nextDouble();

        Shape2D circle = new Circle(r);
        Shape2D rectangle = new Rectangle(w, h);

        System.out.printf("Circle: area = %.2f, perimeter = %.2f%n", 
                          circle.area(), circle.perimeter());
        System.out.printf("Rectangle: area = %.2f, perimeter = %.2f%n", 
                          rectangle.area(), rectangle.perimeter());
    }
}
