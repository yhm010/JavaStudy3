package com.iu.s1.constructor;

import java.security.PublicKey;

public class Car {

	String brand;
	String company;
	String color;
	int cc;

	// 생성자 특수한 메서드 // 주로 모든 객체에 동일한 값이 들어갈때 사용함.
	public Car() {
		this("k9");
//		this.company="kia";
//		this.brand="k9";
//		this.color="black";
//		this.cc=5000;
	}

	public Car(String brand) {
		this(brand, "black");
//		this.company="kia";
//		this.brand=brand;
//		this.color="black";
//		this.cc=5000;
	}

	// 생성자
	public Car(String brand, String color) {
		this(brand, color, 5000);
		this.company = "kia";
		this.brand = brand;
		this.color = "color";
		this.cc = 5000;
	}

	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.cc);
	}

	public Car(String brand, String color, int cc) {
		this.company = "kia";
		this.brand = brand;
		this.color = "color";
		this.cc = 5000;
	}

}
