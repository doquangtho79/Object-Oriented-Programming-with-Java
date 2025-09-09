package javacoban;
import java.util.Scanner;
public class TongChuSoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so N = ");
        int N = scanner.nextInt();
        int sum = 0;
        while (N>0) {
            sum += N%10;
            N /= 10;
        }
        System.out.println("Tong cac chu so la: " + sum);
    }
}
