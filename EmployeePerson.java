package kethua;
import java.util.Scanner;
class Person {
    protected String name;
    protected int age; 
    Person (String ten, int tuoi) {
        this.name = ten;
        this.age = tuoi;
    }
    void perDisplay () {
        System.out.println ("Ten = " + name);
        System.out.println ("Tuoi = " + age);
    }
}
class Employee extends Person {
    double salary;
    Employee (String ten, int tuoi, double luong) {
        super(ten, tuoi);
        this.salary = luong;
    }
}
public class EmployeePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ten: ");
        String t = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int x = sc.nextInt();
        System.out.print("Nhap luong: ");
        double y = sc.nextDouble();    
        Employee e = new Employee(t, x, y);
        e.perDisplay();
        System.out.println("Luong = " + e.salary);
    }
}

