package kh.java.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
//		t.test();
		t.test2();
		
	}
	/**
	  [문제4-1] 아래 문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	 		   java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
	    	      문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
	    	
	 * substring : 문자열의 일부를 가져오는 것. ex) apple의 인덱스 -> [0,1,2,3,4]인데 만약 'pp'만 가져오고싶다? -> substring(1, 3)이라고 해야한다.
	 * 여기서 1은 beginIndex(포함), 3은 endIndex(불포함)  	      
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String num = sc.nextLine(); //사용자 번호를 문자형 배열로 받아야 하므로 String
		
		char[] arr = new char[num.length()]; //배열 선언, 사용자 번호가 11자리이므로 배열 11자리임을 보여줌
		//자바에서 String은 immutable이라 변경할 수 없다.(즉,문자열을 자체를 변경할 수 없다.)
		//num.charAt(3) == '*'; -> 이런 메소드는 없다.
		//변경된 문자열을 새로 생성해야한다.
		//substring(beginIndex)
		//substring(beginIndex, ednIndex)
		//자바에서 문자열의 일부를 가져오는 메소드는 substring이다.
		//*beginIndex => inclusive
		//*endIndex => exclusive
		//java api확인할 것.
		String result = num.substring(0,3) + "****" + num.substring(7);
		System.out.println(result);
	}
		
	
	
	/**
	 [문제4] 사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후, 
	 가운데 4자리를 *로 가리기. (단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요)
		힌트) 복사방법
	   	- for문이용 1:1대입
	   	- System.arraycopy() 매소드 이용
	   	- clone() 매소드 이용
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String num = sc.nextLine(); //사용자 번호를 문자형 배열로 받아야 하므로 String
		
		//다른 방법 : char[] arr =phNum.toCharArray();
		char[] arr = new char[num.length()]; //사용자 번호가 11자리이므로 배열 11자리임을 보여줌
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i); //배열 자리에 사용자 번호 하나씩 넣어줌
									//여기까지가 입력받은 번호를 배열로  만들어준것
		}
		char[] arrCopy = arr.clone(); //배열 복사하고
		for(int i = 3; i <= 6; i++) { //복사된 배열에서 조건에 맞는 자리에 *로 대체
			arrCopy[i] = '*';
		}
		System.out.println(arr);
		System.out.println(arrCopy);
 }
}