package test;

import java.io.File;
import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0 ;
		do {
			System.out.println("MENU --------");
			System.out.println("Vui lòng lựa chọn chức năng: ");
			System.out.println(
				"1. Thêm sinh viên vào danh sách.\n"	
			   +"2. In danh sách sinh viên ra màn hình .\n"
			   +"3. Kiểm tra danh sách có rỗng hay không.\n"
			   +"4. Lấy ra số lượng sinh viên trong danh sách.\n"
			   +"5. Làm rỗng danh sách sinh viên.\n"
			   +"6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			   +"7. Xoá một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			   +"8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			   +"9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			   +"10 Lưu danh sách sinh viên xuống tập tin.\n"
			   +"11. Đọc danh sách sinh viên từ tập tin.\n"

			   +"0. Thoát khỏi chương trình");
			luaChon=sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhập mã sinh viên: ");String maSinhVien =sc.nextLine();
				System.out.println("Nhập mã Họ Và Tên: ");String hoVaTen =sc.nextLine();
				System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");float diemTrungBinh =sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
			}
			else if(luaChon == 2)
			{
				// 2 In danh sách sinh viên ra màn hình .
				dssv.inDanhSachSinhVien();
			}
			else if(luaChon == 3)
			{
				//3.Kiểm tra danh sách sinh viên có rỗng hay không
				System.out.println("Danh sach rong: "+dssv.kiemTraDanhSachRong());
			}
			else if(luaChon == 4)
			{
				//4
				System.out.println("So luong hien tai: "+dssv.laySoLuongSinhVien());
				
			}
			else if(luaChon == 5)
			{
				//5 Xoa het danh sach sinh vien
				dssv.lamRongDanhSach();
			}
			else if(luaChon == 6)
			{
				System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem tra sinh vien co trong danh sach: "+ dssv.kiemTraTonTai(sv));
			}
			else if(luaChon == 7)
			{
				//7 xoa 1 sinh vien ra danh sach
				System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xoa sinh vien trong danh sach: "+dssv.xoaSinhVien(sv));
			
			}
			else if(luaChon == 8)
			{
				//8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim
				System.out.println("Nhập mã Họ Và Tên: ");String hoVaTen =sc.nextLine();
				System.out.println("Ket qua tim kiem: ");
				dssv.timSinhVien(hoVaTen);
			}
			else if(luaChon == 9)
			{
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}
			else if(luaChon == 10)
			{
				System.out.println("Nhap ten file : ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				dssv.ghiDuLieuXuongFile(f);
			}
			else if(luaChon == 11)
			{
				System.out.println("Nhap ten file : ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				dssv.docDuLieuTuFile(f);
			}
		}while(luaChon!=0); 
		
	}
}
