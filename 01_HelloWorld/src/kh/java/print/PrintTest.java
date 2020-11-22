package kh.java.print;

public class PrintTest {

	/**
	 * escape문자
	 * 인쇄되지 않거나 키보드로 표현불가능한 기능성문자를 표현
	 * \(역슬래시) + 문자
	 * 
	 * - \n 은 개행처리(줄바꿈)
	 * - \t 은 탭처리
	 * - \r 은 carriage return
	 * 	    \r\n
	 * - \\ 는 \(역슬래시)를 문자 그대로 사용
	 * - \" 는 "를 문자 그대로 사용
	 * - \' 는 '를 문자 그래도 사용
	 *
	 * 
	 */
	public void escapingTest() {
		System.out.println("가\n나\t다");
		
		System.out.println("a\\b\\c\\d");
		System.out.println("그는 말했다. '안녕~'");
		System.out.println("그는 말했다. \"안녕~\"");
		
		System.out.println("C:\\Intel\\Logs");
		
	}
	
	/*
	  	"ShakeIt 알람"
--------------------------------------------
	흔들기	쏴리질러	터치하기	원터치
--------------------------------------------
아침부터 쌩쑈를 해야 알람을 끌수 있음.

	 */
	public void shakeIt() {//""안에 그냥 공백을 넣는 것도 실제 출력에서 띄어쓰기 될 수 있다.
		System.out.println("\t    \"ShakeIt 알람\"\n" +
				  "----------------------------------------\n"
				+ "\t흔들기\t쏴리질러\t터치하기\t원터치\n"
				+ "----------------------------------------\r\n"
			    + "아침부터 쌩쑈를 해야 알람을 끌 수 있음.");
	}
	
	public static void main(String[] args) {
	
		PrintTest p = new PrintTest();
//		p.printValueTest();
		
//		p.printTest();
		
		p.escapingTest();
		
		p.shakeIt();
		
	}
	
	public void printTest() {
		//출력메소드
		//println은 출력 + 줄바꿈
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//print는 출력 그대로 이어서
		//개행문자(줄바꿈 처리 문자  "\n")
		System.out.print(1 + "\n\n");
		System.out.print(2 + "\n");
		System.out.print(3);
		
	}
	
	public void printValueTest() {
		//숫자
		System.out.println(123);
		System.out.println(45.678);
		System.out.println(12 + 34); // 12 + 34가 우선 계산된 후, 결과가 println에 처리된다.(괄호 안이 더 먼저이므로 연산하고 출력)
		System.out.println(46);
		//sysout 쓰고 ctrl + space바 누르면 System.out으로 변함
		System.out.println(1 + (3 * 2)); // 1 + (3*2)
		
		//문자(딱 한개의 문자) : 'a' 'b' '가' '나' '有' '*' '  '
		//문자는 ''는 안됨. 공백이라도 한 칸 있어야함. 'ab'도 안됨
		//문자열(0개 이상의 문자) : "" "안녕" "korea" "123"
		System.out.println('a');
		System.out.println('馬');
		System.out.println("안녕하세요");
		
		//문자/문자열은 더하기 연산을 지원한다. 더하기만!
		System.out.println('a' + "bcde"); // 결과는 abcde로 나옴
		
		System.out.println("어디" + "가세요" + "?"); // 결과는 어디가세요?로 나옴
		
		System.out.println(12 + "4");
		//결과는 124로 나옴.
		//문자열과 숫자의 더하기 연산은 더한게 아니라 문자열로 처리
		
		System.out.println(1 + 2 + "3"); // 33
		//왼쪽에서 오른쪽으로 처리되기 때문에 1+2가 처리되고 그 다음 "3"이 붙어서 결과값이 33
		//즉 3 + "3" => 33
		
		System.out.println("1" + 2 + 3); // 123
		//마찬가지로 왼쪽에서 오른쪽으로 차례대로 처리되어 "1" + 2가 처리되고 3이 붙어서 결과값이 123 
		//즉 "12" + 3 => "123" => 123
		
		//문자는 숫자와 만나면 숫자로 처리된다.
		//문자는 문자열과 만나면 문자열로 처리된다.
		System.out.println('a' + 1); //결과값 98
		System.out.println('a' + "가나다"); //결과값 a가나다

		//ASCII Code(아스키 코드)
		//문자를 숫자로 변환하기 위한 약속(=매핑)
		System.out.println('c' + 3); //99 + 3
		System.out.println('Z' - 3); //90 - 3
		System.out.println('0' + 3); //48 + 3
		System.out.println('A' + 'a'); // 65 + 97
		
	}
}




