
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 2, 2021);
		Ngay ngay2 = new Ngay(15, 9, 2030);
		Ngay ngay3 = new Ngay(15, 9, 2025);

		TacGia tacGia1 = new TacGia("Tung TiTV", ngay1);

		TacGia tacGia2 = new TacGia("Tung le", ngay2);
		TacGia tacGia3 = new TacGia("peter le", ngay3);

		Sach sach1 = new Sach("Lap trinh C", 5000, 2023, tacGia1);
		Sach sach2 = new Sach("Lap trinh java", 10000, 2029, tacGia2);
		Sach sach3 = new Sach("Lap trinh mang", 55000, 2029, tacGia3);
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();

		System.out.println("So sanh nam xuat ban 1 va 3 " + sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("So sanh nam xuat ban 2 va 3 " + sach2.kiemTraCungNamXuatBan(sach3));
		System.out.println("Sach 1 giam 10%: "+sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 10%: "+sach2.giaSauKhiGiam(10));
		System.out.println("Sach 3 giam 10%: "+sach3.giaSauKhiGiam(50));

	}
}
