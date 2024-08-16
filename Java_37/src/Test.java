
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(19, 7, 2002);
		Ngay ngay2 = new Ngay(17, 2, 2001);
		Ngay ngay3 = new Ngay(19, 7, 2002);

		Lop lop1 = new Lop("DH01", "Khoa Cong Nghe Thong Tin");
		Lop lop2 = new Lop("DH02", "Khoa Khoa Hoc May Tinh");
		Lop lop3 = new Lop("DH03", "Khoa An Ninh Mang");

		SinhVien sv1 = new SinhVien("001", "Tung ITV", ngay1, 9.0, lop1);
		SinhVien sv2 = new SinhVien("002", "Peter Le", ngay2, 4.0, lop2);
		SinhVien sv3 = new SinhVien("003", "Le Tung", ngay3, 6.0, lop3);
		
		System.out.println("Ten khoa: ");
		System.out.println("SV1: "+sv1.layTenKhoa());
		System.out.println("SV2: "+sv2.layTenKhoa());
		System.out.println("SV3: "+sv3.layTenKhoa());
		
		System.out.println("Kiem tra thi dat: ");
		System.out.println("SV1: "+sv1.kiemTraThiDat());
		System.out.println("SV2: "+sv2.kiemTraThiDat());
		System.out.println("SV3: "+sv3.kiemTraThiDat());
		
		System.out.println("Kiem tra cung ngay sinh: ");
		System.out.println("sv1 va sv3: "+sv1.kiemTraCungNgaySinh(sv3));
		System.out.println("sv1 va sv2: "+sv1.kiemTraCungNgaySinh(sv2));
	}
}
