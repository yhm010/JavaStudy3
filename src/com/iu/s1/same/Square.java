package com.iu.s1.same;

public class Square {
	
	int garo;
	int sero;
	
	public boolean same(Square s1, Square s2) {
		//멤버변수 garo와 매개변수로 받은 객체의 garo가 같고
		//멤버변수 sero와 매개변수로 받은 객체의 sero가 같으면 true 리턴
		//하나라도 틀리면 false를 리턴
		//this 활용
		
		boolean check = s1.garo == s2.garo && s1.sero == s2.sero;
		
		if(check == true) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
		return check;
	}
} // class 끝
