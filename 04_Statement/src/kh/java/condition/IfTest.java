package kh.java.condition;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		IfTest f = new IfTest();
//		f.test1();
//		f.test2();
//		f.test3();
//		f.test4();
		f.test5();
		
	}
	/**
	 * @실습문제 :
	 * 두 수를 입력받아서 그 중 큰 수와 작은 수를 차례로 출력하세요
	 * 같다면 "두 수는 같습니다."출력
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a +", " + b);
		}
		else if(a < b) {
			System.out.println(b + ", " + a);
		}
		else {
			System.out.println("두 수는 같습니다.");
		}
	}
	
	
	/**
	 * 여러개의 if문으로 구현
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		char grade = ' '; //공백문자 //선언을 이렇게 밖에 하면 각 if문마다 다 가져다쓸 수 있다.
		
		if(num >= 90) {
			System.out.println('A');
			grade = 'A';
		}
		
		if (num >= 80 && num < 90) {
			System.out.println('B');
			grade = 'B';
		}
		
		if(num >= 70 && num < 80) {
			System.out.println('C');
			grade = 'C';
		}
		
		if(num >= 60 && num < 70) {
			System.out.println('D');
			grade = 'D';
		}
		
		if(num < 60) {
			System.out.println('F');
			grade = 'F';
		}
		
		System.out.printf("점수 : %d%n학점 : %c%n", num, grade); 
		
		// 밑에꺼랑 조건식이 똑같고 else if만 그냥 if로 바꿔서 출력했을 때 100점인데 왜 D가 나올까? 각각 if라서 연결되어있지않기 때문에 각각 A B C D가 나왔다가 결국 마지막 값인 D가 출력된 것.
		// 그래서 조건식 범위를 더 구체적으로 (num >= 60 && num < 70) <-이런식으로 바꿔준거다.
	}
	
	
	/**
	 * if
	 * else if...
	 * [else] 생략가능
	 * 
	 * 여러 조건식을 직렬화한다.
	 * 참인 조건식의 if문이 실행된다.
	 * if블럭 실행시 나머지블럭은 건너뛰고, 전체 조건문을 빠져나간다.	
	 * 
	 * 90 ~ 100 : A
	 * 80 ~ 89 : B
	 * 70 ~ 79 : C
	 * 60 ~ 69 : D
	 * 60미만 : F
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		char grade = ' '; //공백문자로 초기화해줌. //선언을 이렇게 밖에 하면 if~else까지 다 가져다쓸 수 있다.
	
		
		if(num >= 0 && num <= 100) { //유효성 검사(점수의 범위를 정해주는거지 0~100사이에서만)
			
			//정상입력 : if보고 참이면 바로 종료되어 점수:A학점이 뜨겠지만 만약 거짓이라면? 그 밑에 else if로 간다. 이런식으로 아래로 쭉쭉
			if(num >= 90) {
				System.out.println('A');
				grade = 'A';  //만약 char grade를 if 바깥이 아니라 여기서 선언했으면 이 if 하나에만 적용된다. 밑에 else if에는 적용안됨.	
			}
			else if (num >= 80) {
				System.out.println('B');
				grade = 'B';
			}
			else if(num >= 70) {
				System.out.println('C');
				grade = 'C';
			}
			else if(num >= 60) {
				System.out.println('D');
				grade = 'D';
			}
			else {
				System.out.println('F');
				grade = 'F';
			}
			System.out.printf("점수 : %d%n학점 : %c%n", num, grade);
		}
		
		else {
			//입력값 오류
			System.out.println("잘못 입력하셨습니다.");
		}
					
		if(num >= 90) {
			System.out.println('A');
			grade = 'A';
		//만약 char grade로 선언했으면 이 if 하나만 적용된다. 밑에 else if에는 적용안됨.	
		}
		else if (num >= 80) {
			System.out.println('B');
			grade = 'B';
		}
		else if(num >= 70) {
			System.out.println('C');
			grade = 'C';
		}
		else if(num >= 60) {
			System.out.println('D');
			grade = 'D';
		}
		else {
			System.out.println('F');
			grade = 'F';
		}
		
		System.out.printf("점수 : %d%n학점 : %c%n", num, grade);
		
	}
	
	
	/**
	 * if ... else
	 * 
	 * if절과 else절 중에 무조건 하나는 실행된다.(참이면 if절일거고, 거짓이면 else로 가겠지)
	 */
	public void test2() {
		
		int a = 14;
		if(a % 2 != 0) { //홀수인 경우에 true
			System.out.println("a는 홀수입니다.");
		}
		else { //조건식이 거짓이면 이쪽으로 오겠지?
			System.out.println("a는 짝수입니다.");
			
		}
		
		//@실습문제 : 사용자 나이를 입력받고, 
		//20살이상인 경우만 성인인증되었습니다. 출력
		//20살 미만이라면 성인 인증에 실패하였습니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인인증되었습니다");			
		}
		
		else {
			System.out.println("성인인증에 실패하였습니다.");
		}
		
	}
	
	/**
	 * if
	 * 
	 * 조건에 따라 if절이 실행되지 않을 수도 있다.
	 */
	public void test1() {
		int a = 10;
		if(a > 0) { //조건식 : 결과가 논리형이어야 함
			System.out.println("a는 0보다 큽니다.");//조건식이 참이라면 실행
		}
		
		System.out.println("----종료----");//만약에 a가 -10이라면 조건이 거짓이니 바로 ---종료---가 뜨겠지?ㅇㅇ
	}
}
