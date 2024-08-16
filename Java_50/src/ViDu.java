
public class ViDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";

		// hàm equals ==> so sánh 2 chuỗi giống nhau,có phân biệt hoa thường
		System.out.println("s1 eqals s2: " + s1.equals(s2));
		System.out.println("s1 eqals s3: " + s1.equals(s3));

		// hàm equalsIgnoreCase
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

		// hàm compareTo => so sánh > < =
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";

		System.out.println("sv1 compare to sv2 " + sv1.compareTo(sv2));
		System.out.println("sv1 compare to sv3 " + sv1.compareTo(sv3));
		System.out.println("sv1 compare to sv4 " + sv1.compareTo(sv4));

		// Hàm compareToIgnoreCase =>Tương tự hàm compareTo, không phân biệt chữ hoa
		// thường
		System.out.println("sv1 compareToIgnoreCase to sv2 " + sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase to sv3 " + sv1.compareToIgnoreCase(sv3));
		System.out.println("sv1 compareToIgnoreCase to sv4 " + sv1.compareToIgnoreCase(sv4));

		// hàm regionMathches =>so sánh 1 đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);

		// hàm startWith => hàm kiểm tra chuỗi bắt đầu bằng ...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));

		// hàm endWith => hàm kiểm tra chuỗi kết thúc bằng ...
		String tenFile = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		if (tenFile.endsWith(".JPG")) {
			System.out.println("File 1 la hinh anh !");
		} else if (tenFile.endsWith(".PDF")) {
			System.out.println("File 1 la pdf");
		}
		
		if (tenFile2.endsWith(".JPG")) {
			System.out.println("File 2 la hinh anh !");
		} else if (tenFile2.endsWith(".PDF")) {
			System.out.println("File 2 la pdf");
		}
		
		
	}
}
