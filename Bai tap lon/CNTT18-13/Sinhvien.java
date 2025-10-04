package Sinhvien;
import java.util.Scanner; //import thư viên Scanner để nhập

public class Sinhvien {
	private String hoTen;
	private double diem;
	public Sinhvien() {
	  // Constructor không tham số
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	public boolean coDatHocBong() {
		  return diem >= 8.0;
	}

	public void nhapThongTin() {
		  // Sử dụng Scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ và tên: ");
		hoTen = scanner.nextLine();

		System.out.println("Nhập điểm : ");
		diem = scanner.nextDouble();
	}
	
	public void hienThiThongTin() { 
		System.out.println("Điểm trung bình: " + diem);
	}
	
			 
	public static void main(String[] args) {
		Sinhvien sinhVien = new Sinhvien();
		sinhVien.nhapThongTin();
		sinhVien.hienThiThongTin();

		if (sinhVien.coDatHocBong()) {
			System.out.println("Sinh viên " + sinhVien.getHoTen() + " đạt học bổng");
		} else {
			System.out.println("Sinh viên" + sinhVien.getHoTen() + " không đạt học bổng");
		}
	}
}