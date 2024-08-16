package main;

public class TestBox {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Gia tri: "+box.getValue());
		// Box box = new Box(15.5); ==>Bao loi / error
		// Box box = new Box("Muoi lam"); ==>Bao loi / error
		
		
	}
}
