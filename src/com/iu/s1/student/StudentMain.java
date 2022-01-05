package com.iu.s1.student;

public class StudentMain {
	public static void main(String[] args) {
		
		
		StudentView sv = new StudentView();
		StudentUtil su = new StudentUtil();
		
		Student [] students = new Student[2];
		
		Student student = new Student();
		student.name="iu";
		student.num=1;
		student.kor=10;
		student.eng=20;
		student.math=30;
		students[0]=student;
		
		student = new Student();
		student.name="choa";
		student.num=2;
		student.kor=20;
		student.eng=30;
		student.math=40;
		students[1]=student;
		
		Student student2 = su.search(students);
		if(student2 !=null) {
			sv.viewStudent(student2);
		}else {
			sv.viewMessage("학생이 없습니다.");
		}
			System.out.println("종료");
		// sv.viewStudents(students);

	}
}