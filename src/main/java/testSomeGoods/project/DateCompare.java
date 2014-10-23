package testSomeGoods.project;

import java.util.Date;
import com.google.gwt.i18n.client.DateTimeFormat;

public class DateCompare {

	public static void main(String[] args) {
		Date now = new Date();
		Date inputDate;
		
		inputDate = new Date(1254444444400L);

		System.out.println(inputDate);
//		System.out.println(DateTimeFormat.getFormat("M").format(now));
	}

}
