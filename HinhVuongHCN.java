package kethua;
import java.util.Scanner;
class Retangle {
    protected int a; // Chieu dai
    protected int b; // Chieu rong
    Retangle (int a, int b) {
        this.a = a;
        this.b = b;
    }
    void setLengthWith (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void recDisplay () {
        System.out.println ("Chieu dai HCN = " + a);
        System.out.println ("Chieu rong HCN = " + b);
    }    
}

class Square extends Retangle {
    int c;
    Square (int c) {
        super(c, c);
        this.c = c;
    }
}

public class HinhVuongHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap canh: ");
        int x = sc.nextInt();
        Square hv = new Square(x);
        //hv.setLengthWith (x, x);
        hv.recDisplay();
        System.out.println("Canh hinh vuong la: " + hv.a);
    }
}
