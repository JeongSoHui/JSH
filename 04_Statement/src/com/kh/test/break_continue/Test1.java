package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
//		t.test1();
		t.test2();

	}
	/**
	 2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	 	(Tip. 큰수/작은수에 해당하는 변수를 사용할 것.)
     
     	결과:
     	정수를 하나 입력하세요. => 100
     	다른 정수를 하나 입력하세요. => 1
     	====================
     	1부터 100까지의 홀수의 합은 2500입니다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 => ");
		int user1 = sc.nextInt();
		
		System.out.print("다른 정수를 하나 입력하세요 => ");
		int user2 = sc.nextInt();
		
		System.out.println("====================");
		
		int i = 0;
		int sum = 0;
		int b = 0;
		int s = 0;
			
			if(user1 > user2) {
				b = user1; 
				s = user2;
			}
			else if (user1 < user2) {
				b = user2;
				s = user1;
			}
			
			
			i = s; 
			while(i <= b) {
				if(i % 2 != 0) {
					sum += i;
				}
				i++;
			}			
			
			System.out.print(s +"부터" + b + "까지의 홀수의 합은 " + sum + "입니다.");
			
	
	}
	
	/**
	 * 1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 */
	public void test1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int user = sc.nextInt();
		
		int i = 1;
		int sum = 1;
		
		while(true) {
			
			i++;
			
			if(i % 2 != 0) {
				sum*= i;
				continue;
			}
			
			else if(i > user) break;
			
		}
		
		System.out.print("1부터" + user +  "까지 홀수의 곱은 " + sum + " 입니다.");
			
	}
	
}