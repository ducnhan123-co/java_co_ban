//ngay mau xanh ben trong 
//ngoai mau den ->ben ngoai
public class Ngay {
	private int ngay, thang, nam;

	public Ngay(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;//thang den la cai dua du lieu vao
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
	
	
	
	

}
