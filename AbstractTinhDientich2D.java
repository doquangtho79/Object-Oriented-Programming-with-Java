
package abstracttinhluong;

abstract class Shape2D { 
    final double PI = 3.14;
    protected String name;
    Shape2D(String n) { name = n; }
    public String getName() { return name; } 
    public abstract float calculateArea();
}
class Circle extends Shape2D { 
    private int radius; 
    Circle(String n, int r){
        super(n);
        radius = r;
    }
    public float calculateArea() {
        float area = (float) (PI * radius * radius); 
        return area;
    }
}

public class TinhDientich2D {
    public static void main(String[] args) {
        Circle h = new Circle("Tron", 20);
        System.out.println("Hinh " + h.name + " co dien tich la: " + h.calculateArea());    
    }
}


