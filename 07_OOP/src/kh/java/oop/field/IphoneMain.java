package kh.java.oop.field;

public class IphoneMain {
/**
 * <생명 주기>
 * 클래스 변수 IPhone.WIDTH : 프로그램 시작(해당클래스 최초 사용시) ~ 프로그램 종료
 * 인스턴스 변수 owner : 객체 생성시 ~ 객체 소멸시(가비지 컬렉터에 의해 삭제될때)
 * 지역 변수 sum : 메소드 호출 ~ 메소드 종료
 */
	public static void main(String[] args) {
		
		IPhone hong = new IPhone();
		hong.setOwner("홍길동");
		hong.setPhoneNumber("01012347657");
		
		IPhone sin = new IPhone();
		sin.setOwner("신사임당");
		sin.setPhoneNumber("01045671979");
		
		System.out.printf("%s : %s%n", hong.getOwner(), hong.getPhoneNumber());
		System.out.printf("%s : %s%n", sin.getOwner(), sin.getPhoneNumber());
		
		
		//static
//		hong.width = 15;
//		System.out.println(hong.width);
//		System.out.println(sin.width);
		System.out.println(IPhone.WIDTH);
		System.out.println(IPhone.HEIGHT);
//		IPhone.WIDTH = 13; //상수이므로 값 변경 불가
		
		hong.heySiri(3,  10);
		sin.heySiri(3,  5);
		
		//홍 아이폰 객체 삭제
		hong = null;
	}
}
