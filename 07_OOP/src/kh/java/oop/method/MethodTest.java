package kh.java.oop.method;

/**
 * method
 * -클래스 메소드 (static있음)
 * -인스턴스 메소드(non-static)
 * 
 *static자원(field, method)은 non-static자원(필드,메소드)을 참조할 수 없다.
 */
public class MethodTest {
	
	static int sno = 99;
	int num = 100;
	
	public static void main(String[] args) {
		
		MethodTest m = new MethodTest();
		m.instanceMethod();
		
		MethodTest.classMethod(); //아래에 있는 classMethod 호출하는 것

	}
	
	public static void classMethod() {//static있으므로 클래스 메소드
		System.out.println(sno);
//		System.out.println(num); //인스턴스 변수 사용불가
//		instanceMethod(); //불가능
	}
	/**
	 * instance메소드에서는 static/non-static자원 모두 사용 가능
	 */
	public void instanceMethod() {
		System.out.println(sno);
		System.out.println(num);
	
		classMethod(); //가능
	}

}
























