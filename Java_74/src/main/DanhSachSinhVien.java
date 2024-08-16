package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	// 1. Thêm sinh viên vào danh sách.
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2 .In danh sách sinh viên ra màn hình.
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

	// 3. Kiểm tra danh sách có rỗng hay không.
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

	// 4. Lấy ra số lượng sinh viên trong danh sách.
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

	// 5
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	// 6 .Kiem tra sinh vien co ton tai trong danh sach hay khong
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

	// 7 .Xoa 1 sinh vien ra khoi danh sach
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

	// 8 .Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

	// 9.Xuat ra danh sach sinh vien co diem tu cao den thap
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				} else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	// 10. Ghi xuống file
	public void ghiDuLieuXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);

			for (SinhVien sinhVien : danhSach) {
				oos.writeObject(sinhVien);
			}

			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 11 DOc xuong file
	public void docDuLieuTuFile(File f) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			SinhVien sv = null;
			while (true) {
				Object oj = ois.readObject();
				if (oj == null) {
					break;
				}
				if (oj != null) {
					sv = (SinhVien) oj;
					this.danhSach.add(sv);
				}
			}

			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
