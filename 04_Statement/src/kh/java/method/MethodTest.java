package kh.java.method;

import java.util.Scanner;

/**
 *메소드 
 * -처리절차를 모아둔 곳 -> 반복적인 작업을 한번만 작성해서 처리하는 효과
 * 
 * -매개변수 : 메소드 호출시에 전달된 값이 담기는 변수
 * -리턴값 : 메소드 호출 결과값. 없거나(void) 특정한 하나의 타입을 가진다.
 */
public class MethodTest {

	public static void main(String[] args) {
		
		MethodTest m = new MethodTest();
		m.test1();
		m.test2();
		
	}
	
	/**
	 * 리턴값
	 */
	public void test2() {
		
//      import없이 쓸 수 있는 법 : java.util.Scanner sc = java.util.Scanner(System.in);
//      간혹 클래스명이 똑같은 경우, import문으로 구분이 안돼서 이런식으로 직접 적어줄 수있다.
//      예> Date now = new Date();를 썼는데 어느 패키지인지 구분 안갈 수 있으니
//		    java.util.Date d = new java.util.Date();
//		    java.sql.Date q = new java.sql.Date(2346); 이렇게 구분해서 쓸 수 있다.
		
		int a = inputNumber(); // 아래 public int inputNumber가 대표가 되어 각각의 a,b,c의 적용됨 
		System.out.printf("[%d]를 입력하셨습니다.%n", a);

		int b = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", b);

		int c = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", c);
		return; // '메소드 호출부로 즉시 돌아가라'는 의미. 돌아갈 때 특정 값이 있을 수 도 있고 void처럼 비어있을 수도 있다.
				// 만약에 main메소드에 return을 쓰면 종료를 의미. 돌아갈 곳이 없으니ㅇㅇ
		
	}
	
	public int inputNumber() {//반환할 값의 타입 int
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		return num; // 메소드 호출부로 반환할 값
					// return 옆에 있는 num과 int가 같아야함.
		
		
		
	}
	
	/**
	 * 매개변수 : 메소드 선언부에 정의된 변수(=공간) ex.아래에 있는 (String name)
 	 * 매개인자(인수) : 메소드 호출부에서 호출시 전달되는 값. ex. 아래 printPerson 옆에 있는 (name, age)
	 */
	public void test1() {
		String name = "홍길동";
		int age = 30;
//		printName(name);
		printPerson(name, age);
		
		name = "신사임당";
		age = 50;
//		printName(name); //아래에 이름 나이 출력 메소드를 적용해놓고 이 printName(name)만 적어놓으면 굳이 문자으로 길게 쓰는 일이 줄어듬.
		printPerson(name, age);

		//만약에 이런 식으로 100명을 해야한다면? 일일이 이렇게 하지말고 메소드를 이용하여 바꿀 수 있다.
		//그 메소드가 바로 아래에 있다.
	}
	
		public void printName(String name) {//(String name)이 매개변수
			System.out.printf("안녕하슈? 내 이름은 %s여.%n", name);//여기서 멘트만 바꾸면 위에 여러 이름들에서 호출되는 문장들도
														      //자동으로 다 바뀔 수 있다.
	}

		/**
		 * 이름 나이 출력 메소드
		 */
		public void printPerson(String name, int age) {//(String name, int age)가 매개변수
			System.out.printf("제 이름은 %s이고, 나이는 %d살입니다.", name, age);
			
	}
	
}
