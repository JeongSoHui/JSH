package kh.java.switch_;

import java.util.Scanner;

/**
 * if문 논리형에 따라 분기(조건식 - true or false) / if는 넓은 범위의 조건을 사용할 때 주로 사용.
 * switch '값'에 따라 분기(그냥 값) 
 *
 */
public class SwitchTest {

	public static void main(String[] args) {
		SwitchTest s = new SwitchTest();
		s.test1();
//		s.test2();
//		s.test3();
//		s.test4();
		
	}
	/**
	 * @실습문제 : 수도세 계산 프로그램
	 * 사용자에게 용도와 물 사용량을 입력받아서, 수도세를 계산할것.
	 * 	-사용요금 : 용도별 가격*사용량
	 * 	-수도세 : 사용요금 5%
	 *  -총 납부 금액 : 사용요금 + 수도세
	 *  
	 * 용도별 가격
	 * 1. 가정용 50/liter
	 * 1. 상업용 45/liter
	 * 1. 공업용 30/liter
	 * 
	 * 출력결과(상업용, 250liter 사용시) :
	 * --- 총 사용요금 ---
	 * - 상업용을 사용하고 계십니다.
	 * - 사용요금은 : 11250원
	 * - 수도세 : 562원
	 * - 총납부금액 : 11812원
	 * 
	 */
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용 용도를 선택하시오.(1.가정용 2.상업용 3.공업용) > ");
		int choice = sc.nextInt();
		
		System.out.println("사용량을 입력하시오. > ");
		int used = sc.nextInt();
		
		
		//여기에 미리 변수 선언
		int price = 0;
		double tax = 0;
		int total = 0;
		String type = ""; //사용자가 용도 선택할 때 1,2,3할 수도 있지만 가정용, 상업용, 공업용 직접 쓸수도
		
		
		switch(choice) {
		
		case 1 : price = 50 * used; 
				 type = "가정용"; 
				 break;
		
		case 2 : price = 45 * used; 
		 		 type = "상업용"; 
		 		 break;
		
		case 3 : price = 30 * used; 
		 		 type = "공업용";
		 		 break;
		 		 
		default : System.out.println("잘못 입력하셨습니다.");
		return;
		 		 
		}
		
		tax = price * 0.05;
		total = (int)(price + tax);

		//결과 출력
		System.out.println("--- 총 사용요금 ---\n" +
						   "- " + type + "을 사용하고 계십니다.\n" +
						   "- 사용요금 : " + price + "원 \n" +
						   "- 수도세 : " + tax + "원\n" +
						   "- 총 납부금액 : " + total + "원\n");
		
	}
	/**
	 * @실습문제 : 사용자로부터 회원등급을 입력받습니다. (골드, 실버, 브론즈)
	 * 1. 골드 : 스마트tv, 전자렌지, 전기다리미
	 * 2. 실버 : 전자렌지, 전기다리미
	 * 3. 브론즈 : 전기다리미 
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 등급을 입력하세요.");
		System.out.println("> ");
		
		int choice = sc.nextInt();
		String gift = "";
		
		switch(choice) {
		
		//fall throught현상 : break;를 써주지 않았기 때문에 밑에 상품들도 줄줄이 나오는거지
		case 1 : gift = "스마트tv, "; //gift = gift + "---" 
		case 2 : gift += "전자렌지, ";
		case 3 : gift += "전기다리미"; break;
		
		default : System.out.println("잘못 입력하셨습니다.");
		return;
		
		}
		
		System.out.println("당첨된 선물은 [" +gift+ "]입니다.");
		
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		String menu = "================\n"
				+ "1. 순대국\n"
				+ "2. 김치찌개\n"
				+ "3. 순두부찌개\n"
				+ "----------------\n"
				+ "> ";
		System.out.print(menu); //메뉴판이 출력되고
		
		int choice = sc.nextInt(); //사용자가 번호를 선택하겠지?
		int price = 0; //아직 가격은 정해지지않았잖아
		
		switch(choice) {
		
		case 1 : price = 8000; //여기서 메뉴마다 가격이 있네
		break;
		
		case 2 : price = 7000;
		break;
		
		case 3 : price = 7000;
		
		default : System.out.println("잘못 입력하셨습니다."); //메뉴판에 없는 번호를 선택하면 이게 뜨겠지?ㅇㅇ
		return;
		}
		
		System.out.println("가격은 [" + price + "]입니다." );
			
	}
	/*
	  괄호 안에는 byte, short, int, char, String, enum(열거형)등이 올 수 있다.
	  - long, float, double 사용불가
	  - String은 jdk 1.7부터 사용가능
	  
	 	switch(변수|계산식) { //if와 달리 true,false같은 조건식이 아니라 바로 '변수(값)'이 들어가야해
	 		case 값1 :
	 			//실행문1
	 			break;
	 		case 값2 :
	 			//실행문2
	 			break;
	 			...
	 		default :
	 			//기본 실행문(모든 case에 해당되지 않는 경우)
	 	}
	 */
	public void test1() {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.사과 2.바나나 3.오렌지");
			System.out.println(">  ");
			
			int choice = sc.nextInt();
			String color = "";
			
			switch(choice) {//if와 달리 바로 값을 넣었지?ㅇㅇ
			case 1 : 
				 color = "빨간색";
				 break; //현재 블럭을 빠져나가라는 의미( '}'다음으로)
			case 2 : 
				 color = "노란색";
				 break;
			case 3 :
				 color = "주황색";
				 break;
			default : //옵션같은 존재. 생략 가능
				 System.out.println("잘못 입력하셨습니다.");
				 return;
			}
			
			System.out.println("선택한 과일의 색상은 [" + color + "]입니다." );
	
			
			}
	
	
}
