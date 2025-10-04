package kethua;
class Diem {
    private int x, y;
    public Diem() { x=0; y=0;}
    public Diem(int x, int y) {
        this.x = x; this.y = y;
    }
    public void setX(int x) { this.x = x; }
    public int getX() { return x; }
    public void hienThiDiem(){
        System.out.print(" Toa do: (" + x + ", " + y + ")");
    }
}
class TuGiac {
    private Diem d1, d2, d3, d4;
    public TuGiac(Diem p1, Diem p2, Diem p3, Diem p4) {
        d1 = p1;
        d2 = p2;
        d3 = p3;
        d4 = p4;
    }
    public TuGiac() {
        d1 = new Diem(0,0);
        d2 = new Diem(0,1);
        d3 = new Diem (1,1);
        d4 = new Diem (1,0);
    }
    public void printTuGiac() {
        d1.hienThiDiem();
        d2.hienThiDiem();
        d3.hienThiDiem();
        d4.hienThiDiem();
        System.out.println();
    }
}

public class DiemTuGiac {
    public static void main(String args[]){
        Diem d1 = new Diem(1, 3);
        Diem d2 = new Diem(4, 7);
        Diem d3 = new Diem(5, 2);
        Diem d4 = new Diem(8, 4);
        TuGiac tg1 = new TuGiac(d1, d2, d3, d4);
        TuGiac tg2 = new TuGiac();
        System.out.print("Cac diem cua tu giac 1: ");
        tg1.printTuGiac();
        System.out.print("Cac diem cua tu giac 2: ");
        tg2.printTuGiac();
    }
}
