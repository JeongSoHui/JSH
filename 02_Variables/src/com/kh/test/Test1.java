package com.kh.test;

/**
 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.

 	- 정수형 100, 9999억, 
   	- 실수 486.520(float), 567.890123
   	- 문자 A
   	- 문자열 Hello world, 
   	- 논리 true
     (단, 변수를 이용하여 출력하시오 .)
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		
	}
	public void test() {
		
		int i = 100;
		System.out.println("i = " + i);
		
		long l = 999900000000L;
		System.out.println("long = " + l);
		
		float f = 486.520f;
		System.out.println("float = " + f);
		//.520까지 모두 나오게 하기 : System.out.printf("float = %.3f%n", f);
		
		double d = 567.890123;
		System.out.println("double = " + d);
		
		char ch = 'A';
		System.out.println("char = " + ch);
		
		String str = "Hello world";
		System.out.println("String = " + str);
		
		boolean bool = true;
		System.out.println("boolean = " + bool);	
		
	}
}
