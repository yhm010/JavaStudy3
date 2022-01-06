package com.iu.s1.constructor;

public class Engine {
	// 1번 직접 대입
	String name = "V1";
	String fuel = "F1";
	
	{
		System.out.println("초기화 블럭"); // 2번
		this.name="V2";
		this.fuel="F2";
	}
	
	public Engine() { // 3번
		System.out.println("생성자 실행");
		this.name="V3";
		this.fuel="F3";
	}
	
	

	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);
	}
}
