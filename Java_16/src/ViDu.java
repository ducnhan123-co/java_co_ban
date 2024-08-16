import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhap vao so a : ");
		a = sc.nextDouble();
		
		System.out.println("Nhap vao so b : ");
		b = sc.nextDouble();
		
		//khai bao bien Math
		
		//Hàm trị tuyệt đối 
		System.out.println("|a|= " + Math.abs(a));
		
		//Hàm tìm min
		System.out.println("Min(a,b)= "+ Math.min(a, b));
		
		//Hàm tìm max
		System.out.println("Max(a,b)= "+ Math.max(a, b));
		
		//Hàm tìm ceil
				System.out.println("Ceil(a)= "+ Math.ceil(a));
		//Hàm tìm floor
				System.out.println("floor(a)= "+ Math.floor(a));
		//Hàm tìm can bac hai
				System.out.println("Sqrt(a)= "+ Math.sqrt(a));
				//Hàm tính căn bậc hai
				System.out.println("Pow(a,b)= "+ Math.pow(a, b));
				
	}
}
