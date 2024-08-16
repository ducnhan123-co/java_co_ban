
public class Test {
	public static void main(String[] args) {
		System.out.println("Kiem tra");
		ConNguoi cn = new ConNguoi("TiTV", 2021);
		cn.an();
		cn.uong();
		cn.ngu();
		System.out.println("Nam sinh : "+cn.getNamSinh());
		HocSinh hs=new HocSinh("TiTV", 2021, "Lop 1", "Truong 1");
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();

	}
}
