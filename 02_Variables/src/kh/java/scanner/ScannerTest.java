package kh.java.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner는 jdk1.5부터 사용자입력값처리를 담당한다.
 * 이전의 BefferedReader를 대체했다
 *
 * 사용자입력값 가져오기 + 형변환
 *
 * 1. next계열
 * 2. nextLine계열
 *
 */
public class ScannerTest {

	public static void main(String[] args) {
		ScannerTest s = new ScannerTest();
//		s.test1();
//		s.test2();
		s.test3();
		
	}
	
	/**
	 * @실습문제
	 * 사용자로부터 이름, 나이, 주소, 키(실수)를 입력받아 출력하세요
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = sc.next();
		
		System.out.print("나이 > ");
		int age = sc.nextInt();
	   	
		//개행문자 버리기(왜 버려? 앞에는 공백없이 쓸 수 있는 next들이었잖아. 근데 뒤에 주소는 공백쓰는 nextLine이나까 써줘야지)
		sc.nextLine();
		
		System.out.print("주소 > ");
		String addr = sc.nextLine();
		
		System.out.print("키 > ");
		double height = sc.nextDouble();
		
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %s%n" , age);
		System.out.printf("주소 : %s%n" , addr);
		System.out.printf("키 : %.1f%n", height);
		
	}
	
	/**
	 * nextLine
	 * 개행문자(엔터)까지 읽어온 후, 개행문자를 제외한 문자열을 반환
	   nextLine()은 띄어쓰기를 문자열에 포함하고, 엔터(줄바꿈)만 문자열의 끝으로 인식
	 * 
	 * 주의할 점
	 * next와 nextLine을 연이어 사용할 때,
	 * next : 공백/개행문자 전까지만 입력버퍼에서 읽어오므로, 개행문자(띄어쓰기나 엔터)가 입력버퍼에 남는다.
	 * nextLine : 버퍼에 남은 개행문자를 읽어서 처리
	 * 
	   예) I'm a student
	   - next()로 입력받아 변수에 저장했다면 결과는 I'm으로 나옴.
	   - nextLine()은 I'm a student가 다 나옴.
	 * 
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in); //메소드 안에 변수들은 공유할 수 없으니까 밑에 Scanner 선언했어도 여기에도 또 해야함.
		System.out.print("이름 > "); //이름은 띄어쓰기가 없으니 next
		String name = sc.next();
		
		//next -> nextLine연결시 개행문자 버리기 코드 넣어줘야함(
		sc.nextLine();
		
		System.out.print("주소 > "); //주소는 띄어쓰기 있으니 nextLine
		String addr = sc.nextLine();
		System.out.printf("이름 : %s%n주소 : %s%n" , name, addr);
		
		
	}
	
	
	/**
	 * next계열
	 *  - next()
	 * 	- nextInt()
	 * 	- nextDouble()
	 * 	- nextBoolean()
	 */
	public void test1() {
		//System.in - 사용장 입력(키보드)   /[키보드] -> [jvm] -> console
		//System.out - 사용자 표준출력(콘솔)         
		Scanner sc = new Scanner(System.in);
		
		//정수니까 int, 엄청 큰 숫자면 long으로 해도 됨
		System.out.print("정수를 입력하세요 > "); //정수를 입력하세요 >
		int userNum = sc.nextInt(); //사용자가 숫자 입력할거임. 예를 들어 10 입력
		System.out.printf("[%d]를 입력하셨습니다.%n" , userNum); // [10]을 입력하셨습니다.
		
		System.out.println("실수를 입력하세요 > ");
		double userDouble = sc.nextDouble(); //사용자가 소수 입력하겠지?
		System.out.printf("[%f]를 입력하셨습니다.%n" , userDouble);
	
		System.out.print("논리형값을 입력하세요 (true | false) > ");
		boolean userBool = sc.nextBoolean();
		System.out.printf("[%b]를 입력하셨습니다.%n" , userBool);
		

		/**
		 * charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
		  			    만약에 charAt()에 (2)를 넣고 '감사합니다'를 입력하면 '합'이 나옴.
		  			    글자 순서는 0부터라서 2를 넣으면 3번째 글자가 나옴.
		 */
		//sc.nextChar()는 존재하지 않음
		//문자열을 읽어온 다음, 첫글자만 가져오기
		System.out.print("한글자만 입력하세요 > ");
		String userInput = sc.next(); //문자열 가져오기
		char ch = userInput.charAt(0); //한줄로 표현하기 : char ch = sc.next().charAt(0);
		                               //즉, String userInput~~ char ch~~ 두줄을 한 줄로 표현한것.
		System.out.printf("[%c]를 입력하셨습니다." , ch);
	
		//문자열
		//next 특징 : 사용자 입력값 중 공백/개행문자 전까지만 읽어온다.(띄어쓰기 전까지만 출력된다는 것. 띄어쓰기도 출력하고 싶으면 nextLine써야함)
		System.out.print("문자열을 입력하세요 > ");
		String s = sc.next();
		System.out.printf("[%s]를 입력하셨습니다.", s);
		
	}
}


