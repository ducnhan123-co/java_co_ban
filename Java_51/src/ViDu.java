
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chao cac ban ,xin chao co chu , Xin chao	 ";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'ô';
		// hàm indexOf
		System.out.println("Vi tri cua s2 trong s1 la : " + s1.indexOf(s2));
		System.out.println("Vi tri cua s3 trong s1 la : " + s1.indexOf(s3));

		// sử dụng vị trí bắt đầu
		System.out.println("Vi tri cua s2 trong s1 la : " + s1.indexOf(s2, 2));

		// Tìm kiếm char
		System.out.println("Vi tri cua s2 trong s1 la : " + s1.indexOf(c1));
		System.out.println("Vi tri cua s2 trong s1 la : " + s1.indexOf(c1, 20));

		// hàm lastIndexof ==>tìm kiếm từ phải sang trái
		System.out.println("Vi tri cua s2 trong s1 la : " + s1.lastIndexOf(s2));

		// tenFile="Bai tap. excel.lop12.xls' ;
		
	}
}
