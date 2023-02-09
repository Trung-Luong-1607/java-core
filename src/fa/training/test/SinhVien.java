package fa.training.test;

public class SinhVien {
	private int MaSV;
	private String Ten;
	private int NamSinh;
	private double DiemCsharp;
	
	public SinhVien(int maSV, String ten, int namSinh, double diemCsharp) {
		super();
		MaSV = maSV;
		Ten = ten;
		NamSinh = namSinh;
		DiemCsharp = diemCsharp;
	}
	
	public SinhVien() {
		
	}

	public int getMaSV() {
		return MaSV;
	}

	public void setMaSV(int maSV) {
		MaSV = maSV;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getNamSinh() {
		return NamSinh;
	}

	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}

	public double getDiemCsharp() {
		return DiemCsharp;
	}

	public void setDiemCsharp(double diemCsharp) {
		DiemCsharp = diemCsharp;
	}
	
	public void inThongTin() {
		System.out.println("SinhVien [MaSV=" + MaSV + ", Ten=" + Ten + 
				", NamSinh=" + NamSinh + ", DiemCsharp=" + DiemCsharp + "]");
	}
}
