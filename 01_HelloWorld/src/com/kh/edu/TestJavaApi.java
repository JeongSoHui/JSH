package com.kh.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar; //import 단축키 : Ctrl + shift + 알파벳 O
import java.util.Date;

/**
 * @실습문제 
자바 기본 API활용
* package : com.kh.edu
* class : TestJavaApi
* 메소드 : public static void main(String[] args){ }

자바에서 지원하는 API 중 java.util.Date 클래스를 이용해서 오늘 날짜를 출력하세요
(출력형식 : 2020/8/14)
 */
public class TestJavaApi {

	public static void main(String[] args) {
		TestJavaApi t = new TestJavaApi();
		t.test();
		
	}
	public void test() {
		//Date 메소드 : Deprecated 메소드는 더 이상 사용하면 안된다.
		//Calendar //java에서 제공하는 api를 참고한다.
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(
				cal.get(Calendar.YEAR) + "/" +
				(cal.get(Calendar.MONTH) + 1) + "/" + //컴퓨터는 Month을 0부터 취급하기 때문에 +1을 해줘야 한다.
				cal.get(Calendar.DATE)
				);
		

		//SimpleDateFormat
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");//MM을 대문자로 써준 이유는 api에
				System.out.println(sdf.format(d));						  //대문자MM은 '월'을 의미하고
																		  //소문자MM은 시간의 '분'을 의미하기 때문
	}
}
