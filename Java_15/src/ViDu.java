import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a= ");
		int a = sc.nextInt();
		
		String ketQua=(a%2==0) ?"Số chẵn" :" số lẻ " ;
		System.out.println(a+ " la "+ ketQua);
	}
}
