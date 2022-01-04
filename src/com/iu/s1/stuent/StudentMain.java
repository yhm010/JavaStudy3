package com.iu.s1.stuent;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudnet 호출
		// 이름, 번호, 국어, 영어, 수학 출력
		
		StudentUtil studentUtil = new StudentUtil();
		Student student = studentUtil.makeStudnet();
		System.out.println("이름 :" +student.name);
		System.out.println("번호 :" +student.num);
		System.out.println("국어 :" +student.kor);
		System.out.println("영어 :" + student.eng);
		System.out.println("수학 :" + student.math);
		

	}

}
