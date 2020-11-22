package kh.java.random;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test rt = new Test();
//		rt.test1();
		rt.test2();
		
	}
	/**
	 * 가위바위 보
	 * 승패를 결정하는 if문은 중첩 if문 금지.(||,&& 연산자 적절히 활용)
	 */
	public void test2() {
		Random random = new Random();
		
		System.out.println("=== 가위 바위 보 게임 ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 선택하세요(1.가위 / 2.바위 / 3. 보) : ");
		int user = sc.nextInt();
		String str = (user == 1 ? "가위" : (user == 2 ? "바위" : "보"));
		
		System.out.println("======== 결과 ========");
		
		//내가 누른 가위바위보
		if(user == 1) {
			
			System.out.printf("당신은 가위를 냈습니다.%n");
		}
		
		else if(user == 2) {
			System.out.printf("당신은 바위를 냈습니다.%n");
		}
		
		else {
			System.out.printf("당신은 보를 냈습니다.%n");
		}
		
		//컴퓨터의 가위바위보
		int rnNum = random.nextInt(3) + 1;
		
		if(rnNum == 1) {
		
			System.out.printf("컴퓨터는 가위를 냈습니다.%n");
		}
		
		else if (rnNum == 2) {
			
			System.out.printf("컴퓨터는 바위를 냈습니다.%n");
		}
		
		else {
			
			System.out.printf("컴퓨터는 보를 냈습니다.%n");
		}
		
		System.out.println("====================");
		
		if(user > rnNum) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(user < rnNum) {
			System.out.println("컴퓨터가 이겼습니다. ^o^");
		}
		else if(user == rnNum) {
			System.out.println("당신과 컴퓨터가 비겼습니다 O_o");
		}
		
		}
		
	
	
	/**
	 * 랜덤범위를 구하는 공식을 알아볼것.
	 */
	public void test1() {
		Random random = new Random();
		
		//0~9 까지의 랜덤 
		int rnNum = random.nextInt(10);
		System.out.println(rnNum);
		
		//1~10 까지의 랜덤
		int rnNum1 = random.nextInt(10) + 1;
		System.out.println(rnNum1);
		
		//20~35 까지의 램덤
		int rnNum2 = random.nextInt(16) + 20;
		System.out.println(rnNum2);
		
		//0 또는 1
		int rnNum3 = random.nextInt(2);
		System.out.println(rnNum3);
		
		
		
		
	}

}
	


