package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViduDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();

		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen van A");
		danhSachSV.offer("Nguyen van B");
		danhSachSV.offer("TITV 2");
		danhSachSV.offerLast("TITV 4");
		danhSachSV.offerFirst("TITV 0");
		
	 //   TITV 4 > TITV 2 > Nguyen Van B > Nguyen Van A > TITV 1 > TITV 0
		
		while (true) {
			String ten = danhSachSV.poll();// peek =>lấy ra nhưng không xoá.
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
