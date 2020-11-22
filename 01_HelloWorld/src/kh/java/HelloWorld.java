package kh.java;//네비게이터에 가면 kh폴더 밑에 java라는 폴더가 생성되어있음.그 밑에 HelloWorld클래스가 생성되어있음
				//package는 폴더 구조를 보기 편리하게 '.'을 사용하여 한줄로 나열한 것.
				//이클립스는 저장(Ctrl + s)를 하면 자동으로 컴파일 된다.
				//한 패키지 안에 같은 이름의 클래스는 생성이 안된다.
				// package는 보통 domain을 거꾸로 작성한다. kr.or.iei

/**
 * 이 주석의 이름은 'javadoc주석(자바독)'이라고 한다.
 * 클래스나 메소드에 대한 설명을 적어둔다.(클래스 위에 쓰면 '클래스 레벨'/메소드에 쓰면 '메소드 레벨'
 * 자바독 주석은 문서 만들 때도 활용 가능
 * (클래스 레벨)
 * 
 */
public class HelloWorld { //내가 만든건 HelloWorld라는 클래스를 만든거지만 실제로는 kh.java.HelloWorld를 생성한것.
	
	/**
	 * (메소드레벨)
	 * 
	 * main메소드는 프로그램을 실행하는 첫 메소드입니다.
	 * main메소드 없이는 프로그램을 시작할 수 없다.
	 * 
	 */
	public static void main(String[] args) {
		//(단일행)주석: jvm에 의해서 해석되지 않는다. 콘솔에 출력되지않음.
		
		/*이 주석은 '여러줄주석'
		 a
		 b
		 c
		 */
		
		System.out.println("Hello world~");
		System.out.println("안녕!!");
		
	}
}
