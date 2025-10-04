package kethua;
class NhanVien {
    protected String ten;
    final double luongCoBan = 1000;
    public NhanVien(String ten) {
        this.ten = ten;
    }
    public double tinhLuong() {
        return luongCoBan*1.0;
    }
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Lương: " + tinhLuong());
    }
}
class TruongPhong extends NhanVien {
    public TruongPhong(String ten) {
        super(ten);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan * 1.2;
    }
}

class GiamDoc extends NhanVien {
    public GiamDoc(String ten) {
        super(ten);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan * 1.5;
    }
}

public class DaHinhLuongNV_TP_GD {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Nguyen Van A");
        NhanVien tp = new TruongPhong("Nguyen Van B");
        NhanVien gd = new GiamDoc("Nguyen Van C");

        nv.hienThiThongTin();
        System.out.println();
        tp.hienThiThongTin();
        System.out.println();
        gd.hienThiThongTin();
    }
}
