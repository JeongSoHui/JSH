package kh.java.oop.method;

public class MethodOverloadingTest {

	/**
	 * 메소드 오버로딩 Overloading
	 * 한 클래스 내에서 동일한 이름, 매개변수 선언부가 다른 메소드를 선언하는 것.
	 * 
	 * 조건>
	 * -메소드명이 동일해야한다.
	 * -매개변수 선언부가 달라야한다.(타입,개수,순서가 달라도 가능 - 호출시 모호하지 않을 것.)
	 * 
	 * 주의>
	 * -접근제한자, 리턴 타입을 상관하지 않는다.
	 * -매개변수명도 상관하지 않는다.
	 */
	public static void main(String[] args) {
		System.out.println(123);
		System.out.println("안녕");
		System.out.println('a');
		System.out.println(true);
	}
	/*
	 * 모두 다른 타입으로 인정된다.
	 */
	public void test() {}
	public void test(int a, int b) {}
	public void test(char c) {}
	public void test(String s) {}
	public void test(int a, String s) {} //밑에꺼랑 다른거임. 예> 12 안녕
    public void test(String s, int a) {} //위에꺼랑 다른거임. 예> 안녕 12
    
//	public void test(int b, int a) {} //얘는 안됨. 왜? 위에 int int 타입이 같은 메소드가 있음
									  //즉, 매개변수명은 상관하지 않는다.
//	public int test() { //얘도 성립안됨.
//		return 100;		//리턴 타입은 상관하지않는다.
	}

//	private void test() {} //얘도 안됨. 즉, 접근제한자는 상관치 않는다. 
		

	/*
	 * <동일한 메소드라도 파마미터부분 ( )이 다르면 다르다고 인식
	 * public void println(int n){
	 	
	 }
	 
	 public void println(String s){
	 
	 }
	 
	 public void println(char c){
	 
	 }
	 */

