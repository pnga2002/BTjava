package buoi3opp;

public class NhanVien {
	private String hoTen;
	int tuoi;
	String gioiTinh;
	String diaChi;
	public NhanVien() {
		
	}
	public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
}