package testSomeGoods.project;

import java.util.Date;

public class DateWork {
	public static void main(String[] args) {
		Date date = new Date(new Date().getTime()/1000*1000);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.getTime()/1000*1000);
	}
}
