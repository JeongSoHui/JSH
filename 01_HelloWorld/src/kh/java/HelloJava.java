package kh.java;
/* package명은 모두 '소문자'로 작성

 * 단어별로 끊어서 작성(korea.seoul.gangnam)
 
 * class명은 반드시 '대문자'로 시작한다
 * 단어가 연결될 때는 연결된 단어의 첫글자는 대문자로 시작한다.
 * 이것을 CamelCasing이라고한다.(낙타 등처럼 굴곡지게 Hello World)
  
 * 예) kh.java.HelloJava
 * 예) java.lang.String (즉, java.lang까지는 패키지고 String부터는 클래스명)
 * 예) java.io.File
 * 예) java.util.collection.Collection 
 */

import kh.java.other.JeongSoHui;
import java.util.Date;


public class HelloJava {

	/**
	 * 자바는 메소드 단위로 호출하면서 프로그램이 진행된다.  
	 * 실행하고자 하는 코드(실행코드)는 반드시 메소드 안에 작성해야한다.
	 */
	public static void main(String[] args) {
		
		//객체 레시피 : 클래스명  약자(임의의 단어) = new 클래스명(); 
		//클래스를 객체로 만들어주는 문법(현재 클래스에서 다른 클래스를 이용하고 싶을 때 한 문장으로 가져온다고 생각하면 될듯) 
		//클래스명 이름 = new 클래스명();
		//프로그램에서 =는 같다(equal)는 의미가 아니라 '우항의 값을 좌항에 대입하라'는 뜻.
		HelloJava hello = new HelloJava();
		hello.test(); // 아래 test라는 메소드를 호출한 것.
		
		HelloJava helloo = new HelloJava();
		helloo.callMyName(); // 맨 아래 callMyName이라는 메소드를 호출한 것.호출을 해야 콘솔에 출력 가능.
		
		//HellowKHdml welcome메소드 호출하기
		HelloKH kh = new HelloKH();
		kh.welcome();
		
		
		//'다른' 패키지의 클래스를 사용하려면, import문을 반드시 작성해야한다.(맨위에 package kh와 public class HelloJava 사이 참조)
		//kh.java.other.JeongSoHui에 있는 say메소드 호출하기
		JeongSoHui Jeong = new JeongSoHui();
		Jeong.say();
		
		//jdk가 제공하는 클래스 가져다 쓰기(java가 여러 기능들을 미리 만들어놔서 가져다 쓰는 개념.얘 역시도 위에 import문 작성)
		//java.util.Date
		Date today = new Date();
		System.out.println(today);
	
		//java.lang.String
		//java.lang은 import없이 쓸 수 있는 유일한 패키지.(너무 자주써서)
		String name = new String("신사임당");
		System.out.println(name);	
	}
	
	public void test() {
		System.out.println("안늉~~~~");	
	}

	/*
	 * 메소드명은 소문자로 시작
	 * 동사로 메소드의 내용을 간단히 설명할 수 있어야 한다.
	 * 연결된 단어의 첫글자는 대문자로 작성한다.(CamelCasing)
	  
	 * public void kh.java.HelloJava.callMyName
	   kh.java.(<-패키지) HelloJava.(<-클래스명) callMyName(<-메소드)
	 */
	public void callMyName() {
			System.out.println("정소희!!!"); 
	}
		
}	