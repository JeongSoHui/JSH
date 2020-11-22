package kh.java.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 난수(랜덤) 생성
 * 	- 1. Math.random()
 * 	- 2. java.util.Random 클래스의 메소드
 */
public class RandomTest {

	
	public static void main(String[] args) {
		
		RandomTest r = new RandomTest();
//		r.test1();
//		r.test2();
		r.test3();
		
	}
	/**
	 * 동전 앞뒤 맞추기
	 */
	public void test3() {
		//1. 사용자 입력값
		Scanner sc = new Scanner(System.in);
		System.out.println("동전 앞뒤 입력(1.앞  2. 뒤) : ");
		int userInput = sc.nextInt(); //사용자가 1이나 2 넣으면 출력해줄거임
		
		//2. 동전(난수) 던지기 : 경우의 수는 2가지, 최소값은 1
//		int coin = (int)(Math.random() * 2 + 1); //Math.random을 이용
		double num = Math.random(); //처리과정1
		System.out.println(num);    
		num = num * 2 + 1;          //과정2
		System.out.println(num);    
		int coin = (int)num;        //과정3
		System.out.println(coin);
		//*2는 원하는 경우의 수인데 만약 그냥 2면 0,1밖에 안되니
		//뒤에 +1을 해줘서 1,2로 나올수 있게 함.
		//Math.random()은 double을 가져오므로 앞에 (int)를 넣어서 형변환 해준것.

		
//		Random rnd = new Random(); //위에 꺼랑 똑같은데 이건 Random 메소드를 이용한 방법임.
//		int coin = rnd.nextInt(2) + 1;
				
		//3. 값 비교
		System.out.println("-----------------------");
		System.out.println("결과 : " + (coin == 1 ? "앞" : "뒤"));
		System.out.println(userInput == coin ? "맞췄습니다." : "틀렸습니다.");
		
	}
	
	/**
	 * Math.random() //import문 없어도 가능(java.lang)
	 */
	public void test2() {
		// 0.0(inclusive 이상)과 1.0(exclusive 미만)사이의 난수 발생
		double rndNum = Math.random(); 
		System.out.println(rndNum);
		
		//1~10사이의 난수
		rndNum = Math.random() * 10 + 1; //1.0이상 11.0미만 난수 // *10(경우의 수) +1(최소값)의미
		int result = (int)rndNum;
		System.out.println(rndNum);
		System.out.println(result);
		
		
	}
	
	
	/**
	 * Random //import문 필요
	 * 	- 경우의 수
	 * 	- 시작값(최소값)
	 * 
	 */
	public void test1() {
		Random random = new Random();
		//정수 난수 가져오기
		//뒤에 +1(시작값)를 안적으면 0~9까지 10개의 수 중에 랜덤 호출 
		int rndNum = random.nextInt(10) +1;
		System.out.println(rndNum);
		
		//1~100사이 난수출력
		int rndNum2 = random.nextInt(100) +1;
		System.out.println(rndNum2);
		
		//50~100사이 난수출력
		int rndNum3 = random.nextInt(51) +50;
		System.out.println(rndNum3);
		
		//가위0바위1보2
		int rsp = random.nextInt(3);
		System.out.println(rsp); //랜덤으로 숫자 하나가 나오겠지?
		String rspStr = rsp == 0 ? "가위" : (rsp == 1 ? "바위" : "보"); //그럼 여기서 삼항연산자가 그 숫자에 맞게 "가위/바위/보" 고르고
		System.out.println(rspStr); //출력
	
		//타입별 난수 지원
		System.out.println(random.nextBoolean()); //true와 false 중 랜덤으로 나옴
		System.out.println(random.nextDouble()); // 0.0이상 1.0 미만의 난수 반환(소수점 이하 자리수도 랜덤)
		
	}
}
