package kh.java.type;

public class StringTest {
	
	/**
	 * 자료형
	 * -기본형 boolean char byte short int long float double
	 * -참조형
	 */
	public static void main(String[] agrs) {
		
		//기본형 변수
		boolean b = true;
		char ch = '캬';
		
		String str = "안녕하세요"; //String은 원래 참조형이나 워낙 많이 쓰여서 기본형, 참조형 모두 가능
		
		
		//st는 기본형에 해당사항이 없네? 즉, 참조형변수
		StringTest st = new StringTest();
		String s = new String("안녕");
		
		// String은 워낙 자주 쓰여서 기본형 형태도 가능
		// 위에 있는 것처럼 String str을 이용하던지
		// new 연산자를 사용하여 new String로 가능

		
		//"지하철"
		String metro1 = "지하철";
		String metro2 = new String("지하철");
		
		System.out.printf("metro1 = %s%n" , metro1); //%s는 printf에서 쓰는 지시자로, 문자열을 쓸때 써준다
		System.out.printf("metro2 = %s%n" , metro2);
		
		
	}

}
