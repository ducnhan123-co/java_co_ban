import java.util.Scanner;

public class ChuyenDoi {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n>0");
		n=sc.nextInt();
		
		String nhiPhan="";
		/*
		 * Chia lien tuc cho 2 va lay phan du 
		 * dao nguoc lai
		 */
		while(n>0) {
			nhiPhan = (n%2)+nhiPhan;
			n=n/2;
		}
		System.out.println("So he nhi phan la: "+nhiPhan);
		
	}
}
