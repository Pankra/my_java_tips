package testSomeGoods.project;

public class Mod13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		На позиции 15 стоит контрольная цифра, которая равна 
//		последней цифре остатка от деления на 13, предыдущего 14-значного числа
		
		Long num = 123456789012405L;
		
		Long first14;
		int last;
		
		first14 = Long.parseLong(num.toString().substring(0, 14));
		
//		first14 = (int) num/10;
		
		last = Integer.parseInt(num.toString().substring(14));

		
		int stay = (int) (first14 % 13) % 10;
		
		System.out.println(first14);
		System.out.println(last);
		System.out.println(stay);

	}

}
