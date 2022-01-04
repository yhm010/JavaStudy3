package com.iu.s1.student;

public class StudentMain {
	public static void main(String[] args) {
		// makeStudent 호출
		// 이름, 번호, 국어, 영어, 수학 출력
		StudentUtil studentUtil = new StudentUtil();
		Student student0 = studentUtil.makeStudent();
		// Student student = studentUtil.makeStudent();
		Student[] students = studentUtil.makeStudents();

		System.out.println("이름 : " + student0.name);
		System.out.println("번호 : " + student0.num);
		System.out.println("국어 : " + student0.kor);
		System.out.println("영어 : " + student0.eng);
		System.out.println("수학 : " + student0.math);
		for (int i = 0; i < students.length; i++) {
			Student student1 = students[i];
			System.out.println("이름 : " + student1.name);
			System.out.println("번호 : " + student1.num);
			System.out.println("국어 : " + student1.kor);
			System.out.println("영어 : " + student1.eng);
			System.out.println("수학 : " + student1.math);
		}

	}
}