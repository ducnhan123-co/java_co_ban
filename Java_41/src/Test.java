
public class Test {
	public static void main(String[] args) {
		NguoiBaLan nb1=new NguoiBaLan("Tomek", 2015);
		
		NguoiVietNam nvn = new NguoiVietNam("Tung titv", 2021);
		
		NguoiMy nm = new NguoiMy("Michal", 2030);
		
		nb1.xinChao();
		
		nvn.xinChao();
		
		nm.xinChao();
	}
}
