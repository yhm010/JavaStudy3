package com.iu.s1.stuent;

import java.util.Scanner;

public class StudentUtil {
	
	private void makeStudents() {
		// 학생의 수를 입력 받음
		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력
		// 학생들의 정보를 리턴

	}

	public Student makeStudnet() {
		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력 받고 리턴함. 1개만!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println("국어점수를 입력해주세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요");
		int math = sc.nextInt();
		
		// 1. 배열 - 같은 데이터타입 X
		// 2. Class
		Student Student = new Student();
		Student.name = name;
		Student.num = num;
		Student.kor = kor;
		Student.eng = eng;
		Student.math = math;
		
		return Student;
	}
	
}
