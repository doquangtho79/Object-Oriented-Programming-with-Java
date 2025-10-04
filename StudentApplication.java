package XayDungLop;
import java.util.Scanner;
class SinhVien {
    private int id;
    private String name;
    private int GPA;
    public SinhVien(int id, String name, int GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPGA() {
        return GPA;
    }
    public void setPGA(int GPA) {
        this.GPA = GPA;
    }
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("GPA       : " + GPA);
    }
}
public class StudentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập điểm TBC: ");
        int GPA = sc.nextInt();
        SinhVien st = new SinhVien(id, name, GPA);
        System.out.println("\n=== Thông tin sinh viên ===");
        st.display();
        sc.close();
    }
}
