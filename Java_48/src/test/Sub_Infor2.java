package test;

import code.Infor;

public class Sub_Infor2 extends Infor {
	public Infor infor;

	public void method() {
		// super.b => khong truy cap duoc
		super.c = 3; // => truy cap duoc
	}
}
