package kh.java.oop.field;

public class IPhone {

//	3.지역변수 : 메소드 영역에 선언, 접근제한자와 static 키워드를 가질 수 없다.
	public void heySiri(int a, int b) {
		int sum = a + b;
		System.out.println("두 수의 합은 " + sum + "입니다.");
	}
	
	
//	2. 전역변수 - 클래스변수 : 객체간 공유할 정보를 담는다.
	public static final int WIDTH = 10;
	public static final int HEIGHT = 20;
	
//	1. 전역변수 - 인스턴스(멤버)변수 : 왜? 메소드 안에 안쓰고 static이 없으니까	
	private String owner;
	private String phoneNumber;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
