package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String>danhSachSV = new LinkedList<String>();
		
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen van A");
		danhSachSV.offer("Nguyen van B");
		danhSachSV.offer("TITV 2");
		
		while(true)
		{
			String ten = danhSachSV.poll();//peek =>lấy ra nhưng không xoá.
			if(ten==null)
			{
				break;
			}
			System.out.println(ten);
			
		}
	}
}
