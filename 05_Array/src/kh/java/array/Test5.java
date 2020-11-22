package kh.java.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
		
	}
	/**
	 [문제5] 
	 주민등록번호 성별자리 이후부터 *로 가리기.  
	 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요.
	 
	힌트) 복사방법
	   - for문이용 1:1대입
	   - System.arraycopy() 매소드 이용
	   - clone() 매소드 이용
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력 > ");
		
		String num = sc.nextLine();
		
		char[] arr = new char[num.length()];
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i);			
		}
		char[] arrCopy = arr.clone(); //배열 복사
		
		for(int i = 7; i < 13; i++) {//범위 설정 중요
			arrCopy[i] = '*';
		}
		System.out.println(num);
		System.out.println(arrCopy);
	}
	
}
