package kh.java.type;
/**
 * 
 * 변수란? 메모리(RAM)에 하나의 값을 기록하기 위한 물리적 공간
 * 
 * 자료형
 * 1.기본형 Primitive Type
 * 	- 실제 데이터, 값(Literal)을 저장
 * 	- 크기가 각각 다른 8가지 타입(논리형, 문자형, 정수형, 실수형)
 * 
 * 2.참조형 Reference Type
 *	- 8가지 기본형을 제외한 나머지 모두
 *	- 주소값을 저장
 *	- 4byte
 *
 */

public class PrimitiveType {

	public static void main(String [] args) {
		
		PrimitiveType p = new PrimitiveType();
//		p.test1();
//		p.test2();
		p.test3();
//		p.test4();
//		p.test5();
		
	}
		
	/**
	 * Data Overflow 현상
	 * 지정한 타입의 범위를 넘어선 값이 오게 되면, 최소값으로 다시 돌아간다.
	 * 예를 들어 전자 시계에서 59분 다음에 60분이 되어야하는데 다시 00으로 돌아가는 것과 비슷하다고 봄
	 */
	public void test5() {
		int iNum = Integer.MAX_VALUE; //int에서 가장 큰 수 불러오고
		iNum = iNum + 1; //거기에 1을 더하면
		System.out.println("iNum = " + iNum); //다시 가장 작은 수 -2147483648로 돌아감.
		
	}
	
	
	
	/**
	 * 상수 constant : final
	 * 한번 값이 정해지면 변경 불가	
	 */
	public void test4() {
		final int NUM = 100;
//		NUM = 200; (이미 위에서 100이라고 딱 고정되었기 때문에 성립 안되는 것)
	
		final int AGE_LIMIT = 20; //나이 제한이 20일 때
		int tomAge = 18; // 톰의 나이는 18이고
		int janeAge = 24; // 제인의 나이는 24이다.
		boolean tomAllowed = tomAge > AGE_LIMIT; // 톰의 나이가 제한나이보다 많은가? false
		boolean janeAllowed = janeAge > AGE_LIMIT; // 제인의 나이가 제한 나이보다 많은가? true
	
		//jdk정수형의 표현 범위(byte가 얼마까지고~, int까지가 얼마이고~ 이런거 외우지말라고 했던 이유가 이렇게 알 수 있기 때문)
		//MIN_VALUE : 최소값 / MAX_VALUE : 최대값  -> 이미 지정된 상수값이므로 이런데 적용하면 됨)
		System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); //byte : -128 ~ 127
		System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE); //short : -32768 ~ 32767
		System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); //int : -2147483648 ~ 2147483647
		System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);//long : -9223372036854775808 ~ 9223372036854775807
		
	}
	
	/**
	 * 초기화
	 * 변수의 선언과 값대입 동시에 하는 것.
	 * 변수는 하나의 값을 저장하는 저장공간인데 변수의 값은 사용자가 원한다면 언제든지 변경할 수 있는 녀석이다.
	      따라서 변수 선언과 동시에 int i = 10; 처럼 값을 넣어도 되지만 만약 프로그램이 계속 실행되면서 i의 값이 계속 변하는 것이라면
	      코드가 시작하는 줄에 int i = 0;으로 선언을 해놓고 시작하는 것이 일반적이라는 것이다.
	 */
	public void test3() {
		double dNum = 123.456;
		System.out.println("dNum = " + dNum);
		
		// 내 이름의 마지막 글자를 last변수에 초기화
		char last = '희';
		System.out.println("last = " + last);
		
		//올해를 표현할 변수
		int year = 2020;
		System.out.println("last = " + last);
		
		
		
	}
	
	public void test2() {
		//같은 자료형은 한줄에 동시 선언 가능
		//하지만 한줄에 하나씩 명확하게 쓰는 것이 더 좋음 
		int a;
		int b;
		int c;
		
		a = 10;
		b = 20;
		c = a + b;
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
		boolean bool;
		bool = a < b; //a가 b보다 작은가?의 의미(무조건 왼쪽에서 오른쪽)
		bool = a > b; //a는 b보다 큰가?의 의미
		bool = a >= b; //a는 b보다 크거나 같은가?
		bool = a <= b; //a는 b보다 작거나 같은가?
		bool = a == b; //a는 b와 같은가?
		bool = a != b; //a는 b와 같지않은가? 같지 않은면 true
		bool = !true; // !는 반전,뒤집는 의미
		bool = !(a == b); // 'a와 b가 같은가?'의 반대.
		System.out.println("bool = " + bool);
		
		
		
	}
	
	
	
	/**
	 * 1bit
	 * 1byte = 8bit 
	 * 1kb = 1024byte
	 * 1mb = 1024kb
	 * 1gb = 1024mb
	 * 1tb = 1024gb
	 * 1peta
	 * 1exa
	 * 1zetta
	 * 1yotta
	 * 
	 * 기본형의 종류
	 * 1. 문자형 
	 * 	char : 2byte (0~65535) 'a' '가' '馬' '3'
	 * 
	 * 2. 정수형
	 * 	byte - 1byte (-128~127)
	 * 	short - 2byte (-32768~32767)
	 * 	int(기본형) - 4byte (-21억~21억)
	 * 	long - 8byte (-922경~922경)
	 * 		tip> int를 기본형으로 보고 21억 아래 숫자들은 보통 int를 쓴다	
	 * 
	 * 3. 실수형
	 * 	float - 4byte 정밀도가 소수점이하 7자리까지 보장
	 * 	double(기본형) - 8byte 정밀도 소수점이하 16자리까지 보장
	 * 
	 * 4. 논리형
	 * 	boolean - 1byte (true / false)
	 * 
	 * 변수명명규칙
	 * 1.대소문자 구분 (abc와 ABC는 다름)
	 * 2.길이 제한 없음
	 * 3.자바예약어는 사용할 수 없다.
	 * 4.숫자로 시작할 수 없다. 1name(x)
	 * 5.특수문자는 _와 $만 가능
	 * 
	 * 6.여러 단어가 조합됐을 경우, 단어 첫글자는 대분자로 시작 (CamelCasing)
	 * 7.한글사용가능하지만, 사용하지 말것.
	 * 8.직관적인 변수명을 사용하자 (userName,userAge)
	 */
	
	public void test1() {
		// 1. 변수선언
		// 2. 변수 값 대입
		// 3. 변수 사용(출력)
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		//대입연산자 (=) 우항의 값을 좌항에 대입하라(같다는 뜻이 아님)
		bNum = 100;
//		bNum = 200; // -128~127까지만 표현 가능하므로 이건 오류
		
		//정수는 기본적으로 int형으로 취급된다.
		//int범위를 넘어선 정수 리터럴은 L 접미어를 사용해 long타입 명시
		sNum = 30000;
		iNum = 12345678;
		lNum = 1234567890;
		lNum = 1_000_000_000_000L; //본래 1조는 int의 범위 밖이다. 그래서 long타입이라는 것을 알리기 위해 접미어 L, l로 명시
		
		System.out.println("bNum = " + bNum);
		System.out.println("sNum = " + sNum);
		System.out.println("iNum = " + iNum);
		System.out.println("lNum = " + lNum);
		
		
		//실수 리터럴(값)은 기본적으로 double로 취급됨.
		//F,f접미어로 float임을 명시
		float fNum;
		fNum = 0.123f;
		fNum = 0.123456789f;
		
		//소수점 이하 16번째 짜리까지만 정확하게 보장하는 것뿐 그 이후는 맞을 수도 있고, 틀릴 수 도 있고 정확하지 않음.
		double dNum;
		dNum = 0.1234567;
		dNum = 0.12345678901234567890;
		
		System.out.println("fNum = " + fNum);
		System.out.println("dNum = " + dNum);
		
		char ch;
		ch = 'a';
		ch = '김';
		System.out.println("ch = " +  ch);
		System.out.println("ch = "+ ch);
		
		boolean bool;
		bool = true;
		bool = false;
		System.out.println("bool = " + bool);
		
		

	}
	
}
