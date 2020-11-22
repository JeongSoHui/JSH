package kh.java.args;

/** 
 * 매개변수 parameter : 변수(공간) 메소드 선언부 작성한 변수
 * 매개인자/인수 arguments : 값(메소드 호출부에서 전달한 값)
 *
 */
public class ArgumentsTest {

	/**
	 * JVM이 프로그램의 main메소드를 호출할 때, String[]을 전달한다.
	 * 
	 * 프로그램 시작할 때 사용자가 프로그램 전달한 문자열을 공백기준으로 잘라서
	       문자열 배열로 전달한다.
	       
	 * c:\>java ArgumentsTest 123 안녕 하하하
	 * 
	 * {"123", "안녕", "하하하"}
	 */
	public static void main(String[] args) {
		ArgumentsTest a = new ArgumentsTest();
//		a.test1(3); //3은 매개인자
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(i + " : " + args[i]);
//		}
		
		a.adder(args);
		
	}
	public void adder(String[] args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			        //문자열 -> 정수 형변환
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
	public void test1(int num) {
		
	}
}
