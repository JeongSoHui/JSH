package kh.java.type.cast;

/**
 * 컴퓨터의 작동원리
 * 
 * 1.같은 자료형 사이에서 연산할 수 있다(int는 int끼리,long은 long끼리)
 * 2.리터럴은 같은 자료형의 변수에만 대입할 수 있다(즉, 기본형은 기본형끼리 / 참조형은 참조형끼리)
 									   (Ex] boolean 값을 int에 대입X / 1.24같은 실수값을 long타입(정수형)에 담을 수 없다 등등) 
 * 3.같은 자료형의 연산결과는 동일한 자료형이다(int + int -> int)
 * 
 */
public class Casting {
	
	public static void main(String[] args) {
		
		Casting c = new Casting();
//		c.test1();
//		c.test2();
//		c.test3();
		c.test4();
	
	}
	
	public void test4( ) {
		System.out.println('A' + 1); //아스키코드 A는 65니까 답은 66
		//char + int -> int + int
		
		System.out.println('0' + 1); //아스키코드 0은 48이니까 답은 49
		//char + int -> int + int
		
		System.out.println(99);//알파벳 c가 출력되려면? 아스키코드에서 99는 c니까 앞에 문자형 변수 char를 붙여준 것.
		//System.out.println((char)99);
		
		System.out.println(2.0 == (5/2)); //true
		//2.0 == (int / int) -> 2.0 == 2 
		//-> double == int-> double == double (왜냐하면 (5/2)의 값은 정수 2인데 앞에 실수인 2.0처럼 바뀌어서 비교하면 둘이 똑같으니 true)
		
		System.out.println('C' == 67); //true (아스키코드 참고)
		//char == int -> int == int
		
		System.out.println('A' == 'B' - 1); //true (아스키코드 참고)
		//'A' == char - int -> 'A' == 65
		
		System.out.println('a' != 97); //false (아스키코드 참고)
		//char != int -> int != int -> 97 !=97 
		
	}
	
	
	/**
	 * int보다 작은 타입간 연산시 주의사항
	 * byte, short, char타입은 오칙연산(+ - * / %)의 피연산자로 사용되면
       int로 자동형변환 되어 처리된다.
	 */
	  public void test3() {
		 byte b1 = 100; //범위 안에 있다면 암묵적으로 가능(byte : -128 ~ 127)
		 byte b2 = 10;
		 byte result = (byte)(b1 + b2); //byte + byte -> (오류남) -> 그래서 앞에 byte써주면 int + int -> int 
		 System.out.println(result);
	
		 char a = 97; //아스키 코드 참고
		 System.out.println(a);
		 
}
	/**
	 * 2. 명시적 형변환
	 * 	- 데이터손실이 있을 수 있으므로 주의 
	 */
	public void test2() {
		int num = (int)3.7; //int에 double을 넣는건 불가능하지? double이 더 크잖아ㅇㅇ 그니까 실수앞에 int를 붙여서 작게 만들어주는 거지.
		System.out.println(num); // 결과는 소수점 버려지고 그냥 3으로 출력됨.
		
		num = 290;
		byte b = (byte)num; //290은 byte에 너무 크잖아. 안된까 앞에 byte로 형변환 해준거지.
		System.out.println(b); // 34 -> 계산기로 계산해보면 290은 4byte인데 byte는 1byte밖에 안되니까 숫자가 깎이게 된것.
		
		int k = 10;
		int m = 4;
		System.out.println((double)k / m);//(double)int / int 모습인데
		//첫번째 int를 double로 바꿔주면 double / int -> 그럼 뒤에 int도 따라서 double / double -> 결국 값은 double로 출력
		
		
		//결과로 2147483648를 출력하려면? 
		//System.out.println((long)i + 1);로 바꿔줌
		int i = Integer.MAX_VALUE; // i가 int의 최대값일 때
		System.out.println((long)i + 1); //long + int -> long + long
		System.out.println(i + 1L); //long일 때 명시적으로 접미사 숫자 뒤에 L붙이는거 기억나지?
		
		
		
		
	
	
	}

	/**
	 * 1.암묵적 형변화(자동형변환) - 자동으로 형 변환이 일어나는 것.
	 * 	어느 때? 
	  	- 데이터 손실이 없는 경우
	  	- 승격
	  	- 크기 순서대로 : byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	  			  			  -> char(2)
	  	 (tip. long(정수)는 float(실수)로 변화 가능하다. 생각해보면 3.14가 그냥 3보다 더 큰 범위니까..?)  
	 */
	public void test1() {
		//1.자료형이 다른 값의 연산
		int a = 3;
		double b = 2.7;
		System.out.println(a + b); // 처리 과정 :  3 + 2.7 -> 3.0 + 2.7 = 5.7
								   // 3이 int이므로 double과 같은 3.0으로 변환한 후 계산된 것.
		//2.리터럴이 다른 자료형의 변수에 대입될 때
		int c = 5;
		float d = c; // d = 5 -> d = 5.0 (int는 정수니까 float과 같은 실수로 모습이 변환된 후 대입된 것.)
		System.out.println(d);
		
		char e = 'e'; // 문자가 숫자로 변할 때는 아스키 코드 참조.  아스키 코드상에서는 e는 101
		int f = e; // 
		System.out.println(f);
		
		System.out.println('B' + 100); // char + int -> int + int
		// 아스키코드 상에는 B가 66이므로 결국 계산은 66 + 100
		
		//3.연산결과는 동일한 자료형
		int k = 10;
		int m = 3;
		float n = 3;
		System.out.println(k / 3); // 10 / 3
		System.out.println(k / n); //먼저 K자리에 10을 대입하여 10 / 3 -> float/float(n이 float모습이니까 float로 바꿔줘야지) -> 10.0/3.0 -> 3.333333
		
	}
}
