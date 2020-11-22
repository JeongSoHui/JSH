package kh.java.oop.method;

import java.util.Arrays;

/**
 * call by value
 * -메소드 호출시 인자로 값을 넘기는 경우(기본형을 넘기는 경우)
 * 
 * call by reference
 * -메소드 호출시 인자로 주소값을 넘기는 경우(참조형을 넘기는 경우)
 */
public class CallByValueCallByReference {

	public static void main(String[] args) {
		int a = 9;
		int[] b = {1,2,3};
		
		//1.call by value : 값(리터럴)이 복사되는 경우
		CallByValueCallByReference c = new CallByValueCallByReference();
		
		c.test(a);
		System.out.println(a);

		
		//2.call by reference
		c.test(b);
		System.out.println(Arrays.toString(b));
	}
	
	public void test(int x) {
		x *= 100;
	}
	
	public void test(int[] arr) {
		arr[0] *= 100;
	}
}
