
package javacoban;
import java.util.Scanner;
public class StrDaoNguocChuoi {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();
        StringBuilder str = new StringBuilder(input);
        System.out.println(str.reverse().toString());
    }
}
