package testSomeGoods.project;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(8);
		
		for (int i : list) {
			System.out.println(i);
		}

	}

}
