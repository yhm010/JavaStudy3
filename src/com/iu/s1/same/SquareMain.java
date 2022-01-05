package com.iu.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.garo = 4;
		s1.sero = 4;

		Square s2 = new Square();
		s2.garo = 4;
		s2.sero = 4;

		boolean check = s1.garo == s2.garo && s1.sero == s2.sero;

		System.out.println(check);
		System.out.println(s1.same(s1, s2));

	}

}
