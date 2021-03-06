package com.oop.emp.model;
/**
 * [문제]
 		- 사원정보 관리용 클래스
	- Field 작성 : 캡슐화 반드시 적용함

	사번 : - empNo:int
	이름 : - empName:String
	소속부서 : - dept:String
	직급 : - job:String
	나이 : - age:int
	성별 : - gender:char
	급여 : - salary:int
	보너스포인트 : - bonusPoint:double
	핸드폰 : - phone:String
	주소 : - address:String

Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

* 실행용 클래스 : com.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성

=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************

	1. 새 사원 정보 입력  => empInput() 메소드 실행
	2. 사원 정보 삭제 => 참조변수에 null대입할  것.
	3. 사원정보 출력 =>  empOutput() 메소드 실행
	9. 끝내기
********************************************
 */
public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String jop;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
}
