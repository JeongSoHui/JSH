package kh.java.oop.access.modifier.class_;

public class AppleRun {

	public static void main(String[] args) {
		Apple a = new Apple();
		PineApple p = new PineApple();//같은 패키지에서만 가져다 쓸 수 있다.
	}
}
