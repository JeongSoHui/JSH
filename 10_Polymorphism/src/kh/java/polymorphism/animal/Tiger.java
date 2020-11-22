package kh.java.polymorphism.animal;

public class Tiger extends Animal{

	public void punch() {
		System.out.println("호랑이 펀치를 날립니다.");
	}
	
	@Override
	public void say() {
		System.out.println("안녕. 난 호랑이야");
	}
}
