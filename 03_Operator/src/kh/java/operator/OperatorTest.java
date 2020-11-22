package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		
		OperatorTest ot = new OperatorTest();
//		ot.test1();

//		ot.test2();
//		ot.test3();

		
//		ot.test4();
//		ot.test5();
		
		ot.test6();
		
		
		
	}
	/**
	 * @내가 만들어본 문제
	 */
	 public void test6() {
		 
		 int a = 15;
		 int b = ++a + a--;
		 int c = b--;
			
		 System.out.println("c = " + c); //32
		 System.out.println("result1 = " + (a++ + c)); //47

		 int x = 20;
		 int y = 10;
		 String str = (x > y && y <= 0) ? "긍정" : "부정";
			
			
		 System.out.println("result2 = " +  str); // 부정
			
			
	 }
			/**
			 * 복합대입연산자
			 * 	
			 */
	 public void test5() {
		
		int x = 15;
		
		x += 15; // x = x + 15
		System.out.println(x);

		x -= 15; //x = x - 15
		System.out.println(x);
		
		x *= 3; // x = x * 3
		System.out.println(x);
		
		x /= 2; // x = x / 2
		System.out.println(x);
		
		x %= 10; // x = x % 10
		System.out.println(x);
	
	 }
	
	/**
	 * 삼항 연산자
	 * (조건식)?(참일때 값):(거짓일때 값)
	 */
	public void test4() {
		
		int num = 50;
		String str = num > 50 ? "안녕" : "잘가";
		System.out.println(str);	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		str = (num % 2 == 1) ? "홀수" : "짝수";
	    str = (num % 2 != 0) ? "홀수" : "짝수";
		System.out.println(str + "를 입력하셨습니다.");
		
		int a = 5;
		int b = 7;
		int c = a > b ? a : (a == b ? 0 : b);
		System.out.println("c = " + c); //7
	
	}
	
	
	
	/**
	 * 논리비교연산자
	 * -&& (and)  : a && b (a가 참이면서 b도 참인가 - 둘다 참이어야 참)
 	 * -|| (or)   : a || b (a 혹은 b가 참인가 - 둘 중 하나만 참이면 참)
	 */
	public void test3() {
		int m = 50;
		int n = 100;
		System.out.println((m < n) && (m * 2 == n));// t && t -> t
		System.out.println((m < n) || (m * 3 == n));// t || t -> t (하나라도 참이면 참)
		
		System.out.println("-----------------------");
		System.out.println(true && true); //t
		System.out.println(true && false); //f
		System.out.println(false && true); //f
		System.out.println(false && false); //f
		
		System.out.println("-----------------------");
		System.out.println(true || true); //t
		System.out.println(true || false);//t
		System.out.println(false || true);//t
		System.out.println(false || false);	//f	
		
		
		System.out.println("=======================");	
		
		int a = 1;
		int b = 1;
		//&& 좌항이 true일 때
		System.out.println(a > 0 && ++b > 0); //좌항이 참이면 우항도 참인지 봐야지? 우항 실행하자
		//&& 좌항이 false일 때
		System.out.println(a < 0 && ++b > 0); //좌항이 거짓인데 이미 결과는 거짓이지 뭐. 우항 실행 안해
		//|| 좌항이 true일 때
		System.out.println(a > 0 || ++b > 0); //좌항이 참이라고? 그럼 이미 결과도 참이지!우항 실행 안해.
		//|| 좌항이 false일 때
		System.out.println(a < 0 || ++b > 0); //좌항이 거짓이야? 혹시 우항은? 우항도 실행해보자
				
		System.out.printf("a = %d, b = %d%n", a, b);
		
	}
	
	
	/**
	 * 이항연산자
	 */
	public void test2() {
		int a = 3;
		int b = 50;
		int c = 11;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);//asterisk(*)
		System.out.println(b / c);//몫
		System.out.println(b % c);//나머지 연산자

		
		//짝홀 구분 : 2로 나눈 나머지가 0이면 짝수, 아니면 홀수
		System.out.println(10 % 2 == 0); //짝수
		System.out.println(3 % 2 == 0);	//홀수
		
		
		//비교연산
		System.out.println(a == b); //f
		System.out.println(a != b); //t
	
		System.out.println(a > b); //greater than : gt
		System.out.println(a < b); //less than : lt
		System.out.println(a >= b); //greater than or equal to : ge
		System.out.println(a <= b); //less than or equal to : le
				
	}
	
	
	/**
	 * 단항연산자
	 */
	public void test1() {
		int a = +10;
		int b = -33;
		System.out.println(a + b);
		
		//증감연산자
		int c = 7;
		c++; // c = c + 1; //해당 변수값을 1 증가 시킨 후에 다시 대입한다.
		c--; // c = c - 1; //해당 변수값을 1 증가/감소 시킨 후에 다시 대입한다.
		
		System.out.println(c);
		
		//1.전위증감연산자 ++c : 먼저 1증감후에 인접연산 처리
		//2.후위증감연산자 c++ : 인접연산 처리 후에 1증감
		int d = 3;
		int k = ++d; //=보다 ++이 우선 순위이므로 ++3인 4를 먼저 k에 대입
		             //만약에 d++이었다? 그러면 k=3++이므로 k=3부터 하고 그 다음에 d가 4가 됨. 
		System.out.println("d = " + d);
		System.out.println("k = " + k);
		
		int m = 10;
		int n = 20;
		System.out.println(m++ + --n);//29
		
		System.out.println("m = " + m); //11
		System.out.println("n = " + n); //19
		
		
		//@실습문제
		
		int x = 10;
		int y = 10;
		int z = ++x;
		System.out.println("z = " + z); //11 
		System.out.println("x = " + x); //11
		
		z = y++;
		System.out.println("z = " + z); //10
		System.out.println("y = " + y); //11 
		
		x = 20;
		z = x++ + --y;
		System.out.println("x = " + x);//21
		System.out.println("y = " + y);//10 
		System.out.println("z = " + z);//30
		
		int num = 20;
		int result = num++ + num;
		System.out.println("num = " + num); //21
		System.out.println("result = " + result); //41
		
		//논리부정 연산자 !
		boolean bool = true;
		bool = !bool;
		System.out.println("bool = " + bool);//false		
		
	}
}
