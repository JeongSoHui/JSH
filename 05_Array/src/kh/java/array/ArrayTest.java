package kh.java.array;
/**<변수와 배열 구분할 줄 알기>
 * 변수 : 하나의 자료형, 한가지 값을 보관하는 장소(저장공간)
 	- 변수에 새로운 값들을 계속해서 저장하면 이전에 있던 값들은 사라지고 새로 저장한 값만 남아있게 된다.
 		(그렇기 때문에 원래 있는 값을 남겨두면서 새로운 값을 저장하기 위해선 새로운 변수를 생성해서 새로운 값을 저장하는 방법 밖에 없었다.)
 	- 이렇게 여러개 생성된 변수들은 변수들은 어떠한 연관도 없는 각각의 변수일 뿐이다.
 * 배열 : 하나의 자료형(같은 타입의 변수들), 여러가지 값을 보관
 	- 연관된 값들을 한 번에 관리하고 처리할 수 있도록 해주는 역할
 	- 배열에서는 여러 변수들을 하나로 묶어주기 때문에 여러 값을 처리하는데 굉장히 유용
 */
public class ArrayTest {

	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
		
		
		
	}
	/**
	 * 배열 초기화
	 	- 배열 할당 및 값대입
	 */
	public void test7() {
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		int[] arr = {1, 2, 3, 4,5}; //배열의 초기화(할당과 값대입을 한번에)
		int[] arr1 = new int[]{1,3,5}; //이렇게 초기화할 때는 배열 크기 지정하지 말것.
	}
	/**
	 * 배열의 특징
	 	- 배열의 크기는 변경할 수 없다.
	 	- 배열의 삭제는 참조형 변수의 null을 대입해서 처리된다.
	 */
	public void test6() {
		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		//hashCode : 객체가 가진 고유값(주소값은 아니다.)
		System.out.println(arr1.hashCode());
		
		//arr1의 값이 커진 것처럼 보이지만 그게 아니라 새로운 배열을 할당한 것.
		arr1 = new int[10];
		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		
		//만약 배열을 삭제하고 싶다면? null로 초기화 시켜주기
		arr1 = null;
		
		//참조형 변수가 heap에 가리키는 객체가 없을 때(즉, null인 상태)에
		//메소드, 속성 등을 참조(호출)하면 NullPointerException 예외 발생 (오류)
		System.out.println(arr1.length); //오류 내용 : Exception in thread "main" java.lang.NullPointerException
	}
	/**
	 * @실습문제 : 알파벳 소문자배열을 만들고, 모든 요소를 한줄로 출력
	 * 
	 * a, b, c, d, e, ... z (아스키코드 97~122)
	 */
	public void test5() {
		//1.배열선언 및 할당
		char[] alphabet = new char[26]; //알파벳 26개
		
		//2. 요소 값대입
			for(int i = 0; i < alphabet.length; i++) {
					alphabet[i] = (char)('a' + i); // 'a'대신 아스키코드 97써도 가능
											   //뒤에 +1 안해주면 계속 a,a,a,a..로 뜬다...
			
			System.out.print(alphabet[i]); 			
			System.out.print((i < alphabet.length -1) ? ", " : ""); 
			
			}
				
			}	
			
	public void test4() {
		//1.배열선언 및 할당
		int[] numArr = new int[8];
		
		//2.요소의 값 대입
		//규칙이 있는 경우(규칙 없으면 일일이 넣어줘야함)
		for(int i = 0; i < numArr.length; i++) { //numArr.length는 8이다. 왜? new int[8]로 해놨잖아
				numArr[i] = (i + 1)*2; // 2 4 6 8 10 12 14 16

				
						
				//10 20 30 40 50 60 70 80 		
				//numArr[i] = (i + 1)*10;		
						
				//1 2 3 4 5 6 7 8 		
				//numArr[i] = i + 1; //예를 들어 i가 0일 때, numArr[0] = 0 + 1 이므로 0번지 자리에는 값이 1
						       //i가 1일 때, numArr[1] = 1 + 1 이므로 1번지 자리에는 값이 2
		
		}
		//3.요소 값사용
		//2, 4, 6, 8, 10, 12, 14, 16
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
				if(i != numArr.length - 1) // 2, -> 통째로 0번지로 보고 4,->통째로 1번지로 보는 식(마지막에는 , 찍지말고싶을 때)
											//numArr.length말고 7이라고 쓸수도 있지만 나중에 7의 의미를 모를 수도있으니(매직넘버) 변수로 써주자.
											//배열 길이 -1 = 마지막 인덱스 
					System.out.print(", ");
		}
		
	}
	public void test3() {
		
		String[] strArr = new String[10]; //길이가 10이라고 10의 값이 존재하지않는다. 왜? 0부터 시작하니까 0 1 2 3 4 5 6 7 8 9 (이렇게 10개)
		strArr[0] = "이준혁";
		strArr[1] = "오레오";
		strArr[2] = "나쵸";
		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);

		
		for(int i = 0; i < 3; i++) {
			System.out.println(strArr[i]);
		}//위에 주석달린 프린트랑 결국 같은 답이 출력됨.
		
		
		//배열(객체)는 length 속성이 있다. -> strArr.length
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr.length);
		}//위에 주석달린 프린트랑 결국 같은 답이 출력됨.
		
	}
	/**
	 * @실습문제 : 문자배열을 이름길이로 생성하고, 각 인덱스에 이름을 대입한 후 출력할 것.
	 */
	public void test2() {
		//1. 배열선언
		char[] nameArr;
		
		//2. heap에 배열 할당
		nameArr = new char[3]; //char[] nameArr = new char[3]으로 한번에 초기화도 가능
		
		//3. 요소에 값 대입
		nameArr[0] = '정';
		nameArr[1] = '소';
		nameArr[2] = '희';
		
		//4. 출력
		System.out.println(nameArr[0]); 
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
	}
	
	public void test1() {
		//변수 공간은 초기화되지 않고, 쓰레기값이 들어있다.(쓰레기값은 직접적으로 접근x)
		int kor;
		int eng;
		int math;
		
		kor = 80;
		eng = 100;
		math = 90;
		
		//callstack의 변수 초기화(값 대입)하지 않고는 사용할 수 없다.
		//즉, 위의 kor = 80; eng = 100; 이런 값이 프린트 아래로 가면 오류뜸
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		//1. 배열변수 선언
		int[] arr; //arr의 타입은 int배열(즉, int배열은 참조형이다.(주소값이 들어있다) / 기본형은 실제 값이 들어있음)
		
		//2. 배열 할당(heap영역에 공간 확보하는 것)
		//배열 크기를 반드시 지정할 것.([3] 이런식으로)
		//heap은 자료형별 기본값으로 초기화된다.
		//int는 0, double은 0.0 , boolean은 false, char는 ' '(공백)로 초기화되고
		//참조형은 null로 초기화됨
		arr = new int[3]; //new를 쓰면 heap에 배열공간을 만드는데 [3]이므로 3개 확보.
		
		//배열 요소 값 대입
		arr[0] = 80; //기본형 int (int[] arr에 들어있는건 주소값이고 arr의 요소는 값이므로 기본형 int)
		arr[1] = 100;
		arr[2] = 90;
		
		//배열 요소 값 확인
		System.out.println(arr[0]); //arr의 0번지 값을 보여주세요 : 80 
		System.out.println(arr[1]); //arr의 1번지 값을 보여주세요 : 100
		System.out.println(arr[2]); //arr의 2번지 값을 보여주세요 : 90
	
		//heap은 이름을 가질 수 없고 arr요소가 생성됨과 동시에 초기화(int = 0, boolean = false 등)가 설정된다.
		
		
		
	}
}
