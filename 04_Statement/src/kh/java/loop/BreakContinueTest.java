package kh.java.loop;

import java.util.Scanner;

/**
 * break : 반복문을 끝내는 구문. '현재 블록을 빠져나간다'는 의미 (즉시 중지)
 * 
 * continue : 이하 구문을 실행하지 않고, 반복문을 다시 실행 (이번 턴 중지)
 *
 */
public class BreakContinueTest {

	public static void main(String[] args) {
		BreakContinueTest bc = new BreakContinueTest();
		bc.test1();
//		bc.test2();
//		bc.test3();
//		bc.test4();
		
	}
	//병뚜껑 숫자 맞추기 게임
	public void test4() {
		Scanner sc = new Scanner(System.in);
		int rndNum = (int)(Math.random() * 100 + 1);
		System.out.println("[" + rndNum + "]");
		
		while(true) {
			System.out.println("숫자를 입력하세요(1 ~ 100) : ");
			int num = sc.nextInt();
			
			if(num > rndNum) {
				//큰 수를 말한 경우
				System.out.println("Down!");
			}
			else if(num < rndNum) {
				//작은 수를 말한 경우
				System.out.println("Up!");
			}
			else {
				//정답
				System.out.println("정답입니다!");
				break;
			}
		}
	}
	/**
	 * @실습문제 : 1부터 사용자 입력값까지 홀수의 합을 출력하세요
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(true) {
		
			if(i % 2 != 1) {
				sum += i;
			}
			if(i == num) {
				break;
			}
				i++;
			}
		System.out.print("1부터" + num +  "까지 홀수의 합은" + sum + " 입니다.");
		}
	
	/**
	 * 1부터 100까지 짝수만 출력
	 */
	public void test2() {

		int i = 0;
		while(i < 100) {
			i++; //증감식이 만약 continue 밑에 오면 무한 반복으로 큰일남;;;;
			//홀수 일때는 반복문 건너뛰기
			if(i % 2 != 0) {
				continue;
				//이하구문을 실행하지 않고 반복문 다시 실행
				//while 조건식으로 이동, for문은 증감식으로 이동
				//컨티뉴 밑에 증감식 넣으면 무한으로 돈다. 하지말자
			}
			System.out.println(i);
		}
	}
	/**
	 * 1부터 사용자 입력값까지 출력하기
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			System.out.println(i);
			i++;   // 답 1 2 3
		}
		System.out.println("---------------------");
		i = 1;
		while(true){ //무한정
			System.out.println(i);
			i++; //인접 연산이 없으므로 전위, 후위 따질 필요없이 그냥 +1씩 증가
			//반복문 중지 조건식
			if(i > num) {
				break; // 답 1 2 3
			}
		}
			System.out.println("---------------------");
			i = 1;
			while(true){ //무한정
				System.out.println(i);
				
				if(i == num) {
					break;
			}
				i++;    // 답 1 2 3
		}

		
		
		}
}