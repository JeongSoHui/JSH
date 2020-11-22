package kh.java.oop.student.run;

import java.util.Scanner;

import kh.java.oop.student.controller.StudentManager;
import kh.java.oop.student.model.vo.Student;

public class StudentRun {

	public static void main(String[] args) {
//		StudentRun s = new StudentRun();
//		s.manageStudent();
		
		//학생관리객체 생성 및 메소드 호출
		StudentManager sm = new StudentManager();
		sm.manageStudent();

	}
	/*
	public void manageStudent() {
		
		Student[] arr = new Student[5];
		
//		arr[0] = inputStudent();//new Student(name, point);랑 같은 의미
//		arr[1] = inputStudent();
//		arr[2] = inputStudent();
//		arr[3] = inputStudent();
//		arr[4] = inputStudent();
		
		//객체 사용자 입력
		for(int i = 0; i < arr.length; i++)
			arr[i] = inputStudent();
		
		//객체 출력
		for(int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s.print());
		}
	}
		//메소드 시그니처
		public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생명 : ");
		String name = sc.next();
		
		System.out.println("점수 : ");
		int point = sc.nextInt();
		
		Student s = new Student(name, point);
		return s; //한줄로 줄이면 return new Student(name, point);
		}
	
	public void manageStudent_() {
		
		//객체배열 선언
		Student[] stdtArr;
		//객체배열 할당
		stdtArr = new Student[5]; //위에 객체배열 선언과 합쳐도 됨.
		
		System.out.println(stdtArr[0]); //아직 배열요소 대입 전이라 null
		System.out.println(stdtArr[1]);
		System.out.println(stdtArr[2]);
		System.out.println(stdtArr[3]);
		System.out.println(stdtArr[4]);
		
		//배열 요소 대입
		stdtArr[0] = new Student("홍길동", 80);
		stdtArr[1] = new Student("신사임당", 95);
		stdtArr[2] = new Student("세종대왕", 70);
		stdtArr[3] = new Student("장영실", 87);
		stdtArr[4] = new Student("이황", 99);
		
//		System.out.println(stdtArr[0]);//요소 대입이 끝나서 hashCode 출력(즉, 다 다른 객체다)
//		System.out.println(stdtArr[1]);
//		System.out.println(stdtArr[2]);
//		System.out.println(stdtArr[3]);
//		System.out.println(stdtArr[4]);
		
			for(int i = 0; i < stdtArr.length; i++) {//for(int i = 0; i < stdtArr.length; i++) {
				Student s = stdtArr[i];				 //System.out.println(stdtArr[i]);로도 가능
				System.out.println(s.print());
				
			}
		}
	*/	
	}



