package collectionframework;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkListStudentNames {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList l = new LinkedList<String>(); 
        Scanner sc = new Scanner (System.in);
        System.out.println("Ap dung LinkedList: ");
        System.out.println("Nhap ten sinh vien, nhap 'quit' de thoat: ");
        String ten = sc.nextLine();
        while (!ten.equals("quit")) {
            l.add(ten);
            ten = sc.nextLine();
        }
        for (int i = 0; i<l.size(); i++) {
            System.out.println (l.get(i));
	}
    }
}