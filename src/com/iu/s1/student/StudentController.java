package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		
		Scanner sc = new Scanner(System. in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil(); // 객체생성
		StudentView studentView = new StudentView(); // 객체생성
		Student [] students = null;
		while (check) {
		System.out.println("1. 학생들의 정보 입력");
		System.out.println("2. 학생들의 정보 출력");
		System.out.println("3. 학생 정보 검색 출력");
		System.out.println("4. 프로그램 종료");
		int select = sc.nextInt();
		
		switch (select) {
		case 1 :
			students = studentUtil.makeStudents();
			break;
		case 2 :
			if(students != null) {
			studentView.viewStudents(students);
			}else {
				if(students==null) {
					studentView.viewMessage("학생 정보가 없습니다");
					continue;
				}
				studentView.viewMessage("학생 정보를 먼저 입력하세요.");
				if(student != null) {
					studentView.viewStudent(student);
				}else {
					studentView.viewMessage("검색결과가 없습니다.");
				}
			}
			break;
		case 3 :
			Student student = studentUtil.search(students);
			
			
			break;
			default :
				check = !check;
				break;
		} // 스위치 끝
		} // 와일 끝
		
		}
	}


