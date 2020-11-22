package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		
	}
	/**
	 * [문제 1]
	정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      
	출력 예) 입력 5, 6, +
		   5+6=11
	음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.
	
	tip) 문자를 비교할 때는 i == 'a'를 쓰지만, 문자열을 비교할 때는 "abc".equals(userInput)을 이용한다.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int user1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 > ");
		int user2 = sc.nextInt();
		
		if(user1 < 0 || user2 < 0 ) {//조기 리턴
			System.out.println("잘못된 연산기호를 입력하셨습니다. 프로그램을 종료합니다.");
			return; // 리턴 아래로는 실행하지 않고, 다시 메소드 호출부로 돌아간다.
		}
		
		System.out.print("연산자를 입력하세요[+, -, *, / ] > ");
		char op = sc.next().charAt(0);
		
		if(op != '+' && op != '-' && op != '*' && op != '/') {//조기 리턴
			System.out.println("잘못된 연산기호를 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		
		if(op == '+') {
			System.out.println(user1 + ", " + user2 + ", " + op);
			System.out.println(user1 + " + " + user2 + " = " + (user1 + user2));
		}
		else if(op == '-') {
			System.out.println(user1 + ", " + user2 + ", " + op);
			System.out.println(user1 + " - " + user2 + " = " + (user1 - user2));
		}
		else if(op == '*') {
			System.out.println(user1 + ", " + user2 + ", " + op);
			System.out.println(user1 + " * " + user2 + " = " + (user1 * user2));
		}
		else if(op == '/') {
			System.out.println(user1 + ", " + user2 + ", " + op);
			System.out.println(user1 + " / " + user2 + " = " + (user1 / user2));
		}
		
	}
	

}
