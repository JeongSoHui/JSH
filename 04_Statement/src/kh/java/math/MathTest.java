package kh.java.math;

public class MathTest {

	public static void main(String[] args) {
		
		MathTest m = new MathTest();
		m.test1();
		m.test2();
			
	}
	/**
	 * 반올림
	 * 정수형 long을 리턴 / 실수는 double로 리턴
	 */
	public void test2() {
		double num = 94.53;
		long result = Math.round(num);
		System.out.println(result);
		
		//94.53 * 10 -> 945.3 -> 945 / 10.0(정수/정수는 정수라서 소수점이 사라지므로 10.0으로 나눠야함) -> 94.5
		double dResult = Math.round(num * 10) / 10.0;
		System.out.println(dResult);
		
		
		//@실습문제 : 123.456 -> 반올림처리해서 소수점 이하 2자리까지
		//123.46
		num = 123.456;
		dResult = (double)Math.round(num * 100) / 100; //그냥 round만하면 12346인데 그걸 더블형으로 바꿔준거지
		System.out.println(dResult);
		
	}
	
	
	/**
	 * 올림(ceil)/버림(floor)
	 */
	public void test1() {
		double num = 7.8;
		double result = Math.ceil(num);
		System.out.println(result); //8.0 //리터럴값이 double인것 주의깊게 보기
		
		result = Math.floor(num);
		System.out.println(result);
			   
		//부도소수점(소수점 이동) 방식처리
		num = 4.567; // 결과적으론 4.6
		// 과정 : 4.567 * 10 -> 45.67(소수점을 뒤로 한칸 옮겨서 올림) -> 46.0 / 10 -> 4.6 
		result = Math.ceil(num * 10) / 10;
		System.out.println(result);
		
		//버림 소수점이하 둘째자리까지 표현
		//과정 : 4.567 * 100 -> 456.7 -> 456.0 / 100 -> 4.56
		num = 4.567;
		result = Math.floor(num * 100) / 100;
		System.out.println(result);
		
		
				
		
	}
}
