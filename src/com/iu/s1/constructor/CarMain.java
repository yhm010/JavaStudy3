package com.iu.s1.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		// 변수 선언 = 생성자호출
		Car car = new Car();
		// 원래 null과 0이 나옴
//		car.brand="k7";
//		car.company="kia";
//		car.cc=2000;
		car.info();
		
		//여쭤보기
		Car car2 = new Car("k5");
		car2.info();
		
		Car car3 = new Car("k3", "white");
		car3.info();
		
		Car car4 = new Car("k5", "Yelloew", 2000); 
		car4.info();
		
		
		
		

	}

}
