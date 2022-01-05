package com.iu.s1.student;

public class Student {
	// 데이터를 저장하는 용도 (가방같은 역할)
	String name;
	int num;
	int kor;
	int eng;
	int math;

	int total;
	double avg;

	public void makeTotal() {
		int total; // 지역변수
//		System.out.println("참조변수 this");
//		System.out.println("참조변수 this : "+ this);
		this.total = this.kor + this.eng + this.math; // this
		this.avg = this.total / 3.0; //// 평균계산

		this.hello();// 참조메서드.메서드 this 지워도 된다.
	}

	public void hello() {
//		System.out.println("안녕하세요");

	}
}
