package kh.java.print;

public class PrintfTest {

	
	public static void main(String[] args) {
		PrintfTest p = new PrintfTest();
//		p.test1();
		p.test2();
		
	}
	/**
	 * 너비 / 정렬 지정하기
	 * %[flag][width]형식문자
	 *  %-10d -> 10byte의 공간에 좌측정렬하라
	 *  %10d -> 10byte의 공간에 우측 정렬하라
	 */
	public void test2() {
		int i = 12345;
		System.out.printf("%10d%n", i); //총 10자리인데 12345는 5자리니까 앞에 5개는 공백
		System.out.printf("%-10d%n" , i);//총 10자리인데 12345는 5자리네? 근데 -10이니까 뒤가 공백
		
		
	}
	/**
	 * System.out.printf(형식문자열, 값1, 값2, ...)
	 * 
	 * 데이터타입별 형식문자(%d, %f같은거)를 이용해서 값을 출력하는 메소드
	 */
	public void test1() {
		//boolean(참/거짓) %b
		boolean bool = true;
		System.out.printf("bool = %b%n" , bool);
		
		//문자 %c
		char ch = '헐';
		System.out.printf("ch = %c%n" , ch);
		
		//숫자 %d : decimal
		int iNum = 100;
		long lNum = 999;
		System.out.printf("iNum = %d, lNum = %d%n" , iNum, lNum);
		
		//%f : float(소수점 이하 6자리까지 반올림처리)
		//%.2f는 소수점이하 2자리까지 표현해달라는 의미
		//%.8f는 소수점이하 8자리까지 표현해달라는 의미
		float fNum = 123.456f;
		double dNum = 123.4563477890;
		System.out.printf("fNum = %.2f , dNum = %.8f%n" , fNum , dNum);
		
		//%s : 문자열
		//만약 위쪽의 여러 %들이 귀찮다 싶으면 대부분 %s로 처리해도 가능
		String name = "홍길동";
		System.out.printf("name = %s%n" , name);
		System.out.printf("%s %s %s %s %s%n" , bool , ch , iNum , lNum , fNum);
		
		
	}
}
