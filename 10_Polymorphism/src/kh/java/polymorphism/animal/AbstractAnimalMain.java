package kh.java.polymorphism.animal;
/**
 * 부모클래스의 메소드 오버라이딩 강제화
 * -부모클래스 추상메소드(미완성메소드)
 * 
 * 추상메소드를 하나라도 가지고 있다면, 추상클래스가 된다.
 * -객체화할 수 없다.
 * 
 * 자식클래스마다 달라져야 하는 필수적인 기능이 있다면,
 * 추상메소드 사용을 권장한다.
 */
public class AbstractAnimalMain {

	public static void main(String[] args) {
		AbstractAnimalMain aam = new AbstractAnimalMain();
		aam.test1();

	}

	public void test1() {
		//추상클래스는 객체화할 수 없다.
//		Animal a = new Animal(); //오류 : Cannot instantiate the type Animal
		
		
	}
}
