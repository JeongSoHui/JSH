package kh.java.oop.init.block;

import java.util.Random;

/**
 * 인스턴스변수 초기화 과정
 * 1.타입별 기본값(int = num;일 때 초기값은 0이겠지?)
 * 2.명시한 초기값이 있다면 그 값이 대입된다.(int num = 100;이면 100이 대입된것)
 * 3.초기화블럭에서 대입한 값
 * 4.생성자(객체생성시 호출되는 메소드)에서 대입한 값
 * 
 * 클래스 변수 초기화 과정
 * 1.타입별 기본값
 * 2.초기값
 * 3.초기화블럭에서 대입한 값
 * 
 */
public class Sample {
	
	static int sno = 111;
	static {
		System.out.println("static초기화 블럭 시작 : " + sno);
		sno = 333;
		System.out.println("static초기화 블럭 끝 : " + sno);
		
	}
	

	int num = 100;
	{//인스턴스 변수의 초기화 블럭
		System.out.println("초기화블럭 시작 : " + num);
		Random rnd = new Random();
		num = rnd.nextInt(); 
		System.out.println("초기화블럭 끝 : " + num);
	}
	
	//생성자 : 리턴값 없음, 클래스명과 메소드명이 동일, void 적으면 안됨!
	public Sample() {
		System.out.println("생성자 시작 : " + num);
		num = 300;
		System.out.println("생성자 끝 : " + num);
	}
	
}
