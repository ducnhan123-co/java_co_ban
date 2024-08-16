
public class Test {
	public static void main(String[] args) {
		ToaDo td1= new ToaDo(5, 5);
		ToaDo td2= new ToaDo(7, 9);
		ToaDo td3= new ToaDo(12, 1);

	//	Hinh h = new Hinh(td1);=> loi / error
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2,10);
		Hinh h3 = new HinhChuNhat(td3,5,10);
		
		System.out.println("Dien tich 1: "+ h1.tinhDienTich());
		System.out.println("Dien tich 2: "+ h2.tinhDienTich());
		System.out.println("Dien tich 3: "+ h3.tinhDienTich());
		
		
	}
}
