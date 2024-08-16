import java.util.Scanner;

public class BaiTapGiaiPTBacNhat {
	public static void main(String[] args) {
		/**
		 * PTBN ax+b=0 neu a=0 neu b=0=>vo so nguyem neu b!=0=>vo nghiem neu a!=0 co
		 * nghiem x=-b/a
		 */
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a= ");
		a = sc.nextDouble();
		System.out.println("Nhap vao b= ");
		b = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem!");
			} else {
				System.out.println("Phuong trinh vo nghiem!");
			}
		} else {
			x=-b/a;
			System.out.println("Co nghiem x = " + x);
		}
	}
}
