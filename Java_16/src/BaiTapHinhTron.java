import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r,dienTich,chuVi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao ban kinh r: ");
		r=sc.nextDouble();
		
		//tính chu vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));
		System.out.println("Chu vi = " + Math.round(chuVi*100.0)/100.0 );//làm tròn 2 chữ số thập phân

		//tính diện tích
		dienTich=Math.PI * Math.pow(r,2);
		System.out.println("Dien tich = "+ dienTich);
		
	}
}
