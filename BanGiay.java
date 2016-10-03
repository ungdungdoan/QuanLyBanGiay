package AppQLgiay;

public class BanGiay {
	 private String Loai;
	 private String Mau;
	 private String soluong;
	 private String  ma;
	 private String size; 
	 private String gia;
	 
	 
	 
	 public BanGiay() {
		super();
		
	}



	public BanGiay(String loai, String mau, String soluong, String ma, String size, String gia) {
		super();
		Loai = loai;
		Mau = mau;
		this.soluong = soluong;
		this.ma = ma;
		this.size = size;
		this.gia = gia;
	}



	public String getLoai() {
		return Loai;
	}



	public void setLoai(String loai) {
		Loai = loai;
	}



	public String getMau() {
		return Mau;
	}



	public void setMau(String mau) {
		Mau = mau;
	}



	public String getSoluong() {
		return soluong;
	}



	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}



	public String getMa() {
		return ma;
	}



	public void setMa(String ma) {
		this.ma = ma;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public String getGia() {
		return gia;
	}



	public void setGia(String gia) {
		this.gia = gia;
	}
	
	
}
