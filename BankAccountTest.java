
package XayDungLop;

//import java.util.Scanner;
 
public class BankAccountTest {
    public static void main(String[] args) {
        // TODO code application logic here
        Account ac = new Account(100023, "Namtq", 500000);
        ac.setSoTienTrongTK(2000000);
        ac.soTienTrongTK = 300000;
        System.out.println(ac.toStringAccount());
    }
}
