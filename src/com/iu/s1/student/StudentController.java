package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil(); // 객체생성
		studentUtil.initUtil(); // 초기화
		StudentView studentView = new StudentView(); // 객체생성
		Student[] students = null;
		while (check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생 정보 검색 출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				students = studentUtil.makeStudents();
				break;
			case 2:
				if (students != null) {
					studentView.viewStudents(students);
				} else {
					studentView.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;
			case 3:
				if (students == null) {
					studentView.viewMessage("학생 정보가 없습니다");
					continue;
				}
				Student student = studentUtil.search(students);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.viewMessage("검색 결과가 없습니다");
				}
				break;
			default:
				// check = !check;
				check = false;
				break;
			}

			// switch case
		} // while 끝
	}// Main 끝
}// class 끝