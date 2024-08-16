package test;

import code.Infor;

public class test {
	private Infor infor;

	public void method() {
		// this.infor.a=> khong truy cap duoc
		// this.infor.b ==> khong truy cap duoc
		// this.infor.c ==> khong truy cap duoc
		this.infor.d = 4;
	}

}
