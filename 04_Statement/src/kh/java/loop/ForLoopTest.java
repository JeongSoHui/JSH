package kh.java.loop;

import java.util.Scanner;

/**
 * for 
 * 
 * while
 *  
 * do ~ while
 */
public class ForLoopTest {

	public static void main(String[] args) {
		
		ForLoopTest f = new ForLoopTest();
//		f.test1();
//		f.test2();
//		f.test3();
		f.test4();
		
		
	}
	/**
	 * 블럭 스코프
	 */
	public void test4() {
		int sum = 0;
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		for(int i = 1; i <= 10; i++) {
			sum += i; //sum + sum + i
		/* tip> 
		 	sum += i의 의미 : sum = 0 + 1
						   sum = 1 + 2
						   sum = 3 + 3
						   sum = 6 + 4 이런식으로 증가
		         즉, 원래 sum값에 추가로 현재 i값을 더한다는 의미
		    i++은 for문 내에서 증가.*/
		}
		System.out.println(sum);
		
		//1부터 사용자가 입력한 양수까지의 합을 구하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int n = sc.nextInt();
		sum = 0; //위에 sum썻으니 다시 0으로 리셋시켜준것!
		
		for(int i = 1; i<= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	/**
	 * 이름을 반복 출력해드립니다.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("반복 횟수 : ");
		int num = sc.nextInt(); //3
		
		for(int i = 0; i < num; i++) {
			System.out.println((i + 1) + name);
		}
	}
	
	
	/**
	 * 실습문제 : 구구단 2단
	 * 
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * ...
	 * 2 * 9 = 18
	 */
	public void test2() {
		int dan = 2;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (2 * i));
		}
		
	}
	/**
	  for(초기식; 조건식; 증감식) {
	   //반복실행구문
	 } 
	 
	- 초기식 : for문 실행시 최초 1회만 실행, 여기에서 증감변수를 선언함
	- 조건식 : 매텀마다 검사해서 true면 반복구문 실행, false면 반복문 종료
	- 증감식 : 매턴마다 증감변수의 처리
	
	처리 순서
	1. 초기식(int i = 0;)
	2. 조건식(i < 10;)
	3. (조건식이 참이면) 반복구문 실행
	4. 증감식
	
	5. 조건식
	6. 반복구문 실행
	7. 증감식
	
	8. 조건식
	...
	9. 조건식이 false이면 반복문 중지
	 */
	
	public void test1() {
		
//		for(int i = 1; i <= 10; i += 1) {
//			System.out.println(i + " Hello World~");

		/**		   tip> 생각해보자! for(int i = 1; i <3; i++)
		        int i = 1이라고 선언됨; -> i가 10보다 작음; -> 반복구문실행(1개 출력) -> i++(1이 됨)
		        -> 다시 조건식으로 가서 -> i(1)가 3보다 작음; -> 반복구문실행(1개 더 출력) -> i++(2가 됨)
		        -> 다시 조건식으로 가서 -> i(2)가 3보다 작음; -> 반복구문실행(1개 더 출력) -> i++(3이 됨)
		        -> 다시 조건식으로 가서 -> 음? 이번엔 i가 3이네? -> i <3;은 성립안되니 false구만. 반복문 중지!
		*/

		//		}
	
		// 10 ~ 1까지
//  	for(int i = 10; i >= 1; i--) {
//		System.out.println("Hi");	

//	}
		
// 1부터 20사이의 홀수 출력
// 1 3 5 7 9 11 13 15 17 19
	for(int i = 1; i < 20; i+=2 ) {
		System.out.println(i);	
}
	System.out.println();
	
	
	// tip> 초기식-조건식- if -콘솔-증감식 순서로 출력(조건식에서 false가 되면 if까지 가지도않음. 그냥 끝!)
	// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	for(int i = 1; i < 20; i++) {
		if(i % 2 != 0)
			System.out.println(i + " ");
	}
	
	
		//20 18 16 14 12 10 8 6 4 2
		for(int i = 20; i > 0; i -= 2) {
			System.out.print(i + " ");
			}
	
		for(int i = 20; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
