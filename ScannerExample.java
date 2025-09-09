package javacoban;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
//        System.out.print("Khong xuong dong");
//        System.out.println("Co xuong dong");
//        System.out.printf("Toi co %d $", 100);
        System.out.print("Hay nhap vao so nguyen: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Hay nhap vao mot chuoi: ");
        String s = scanner.next();
        System.out.println("Can bac 2 cua so vua nhap la: " + Math.sqrt(number));
        System.out.println("Chuoi vua nhap la: " + s);
    }
}
