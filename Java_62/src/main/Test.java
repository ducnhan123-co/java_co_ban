package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> stackChuoi = new Stack<String>();
		// stackChuoi.push("giatri") => dua gia tri vao stack
		// stackChuoi.pop()=>lay gia tri ra va xoa khoi stack
		// stackChuoi.peek()=> lay gia tri ra nhung khong xoa khoi stack
		// stackChuoi.clear()=> xoa tat ca phan tu trong stack
		// stackChuoi.contains("giatri")=>xac dinh gia tri co ton tai trong stack hay
		// khong
		// stackChuoi.size() => do lon stack

		// Vi du dao nguoi chuoi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		// TITV
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "");
		}
		System.out.println("Chuoi dao nguoi: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}

		// Vi du chuyen tu he thap phan sang he nhi phan
		Stack<String> stackSoDu = new Stack<String>();
		System.out.println("\nNhap 1 so nguyen duong tu ban phim ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu + "");
			x = x / 2;
		}
		System.out.println("So nhi phan la: ");
		while (!stackSoDu.isEmpty()) {
			System.out.print(stackSoDu.pop());
		}

	}
}
