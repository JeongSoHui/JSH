package kh.java.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		
	}
	/**
	[문제1] 
	정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
	출력예)
	정수 입력 : 5
	*
	**
	***
	****
	*****
	==========================
	정수 입력 : 0
	양수가 아닙니다.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int user = sc.nextInt();
		
		if(user > 0) {
		for(int i = 0; i < user; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}	
		System.out.printf("===============\n" + "정수입력 : " + user+"\n");
		}
		System.out.println("양수가 아닙니다.");	
	}

}