package kh.java.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();
	}
	/**
	 [문제3] 
	 문자열을 하나 입력 받아 배열에 넣고 문자를 하나 입력 받아 입력 받은 문자가 문자열에 몇 개인지 
	 개수를 출력하는 프로그램을 작성하세요.
		예) 입력값 : helloworld
		        검색값 :ㅣ
	                 출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		String str = sc.nextLine().toLowerCase(); //사용자가 입력하는 값에 소문자도 가능하도록 
		
		String[] Input = new String[str.length()]; // 배열 선언 및 할당(배열은 생성할 때 무조건 크기설정이 있어야함)
//		char[] arr = str.tocharArray(); 
//		System.out.println(Arrays.toString(arr)); // 배열 모든 요소 확인 가능		
		
		
		
		System.out.print("검색값 : "); 
		char ch = sc.next().toLowerCase().charAt(0); // 사용자가 입력한 값에 소문자도 가능하게 하고, 첫번째 글자로 추출
	
		
		int cnt = 0; //총 갯수
		
		for(int i = 0; i < str.length(); i++) { //i가 배열 할당값보다 작을 때 true
			char c = str.charAt(i); //입력값의 i번째를 c에 대입(c는 추출된 글자가 어떤건지 밑에서 말해주는 역할)
			if(c == ch) { // 대입받은 c가 검색 알파벳과 같으면
				cnt++; //총 갯수 늘어남
		
			}
				
		}
		System.out.print("출력 : 입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은/는 " + cnt + "개 입니다.");		
	}
}
