package com.kh.function.run;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
//		m.opSample1();
		m.opSample2();
		m.opSample3();
	}
	
	/**
	 * [문제 1]
 		- 메소드명 : public void opSample1(){}
 		- 구현 내용 : 
		국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
		각 점수를 키보드로 입력받고, 합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
		세 과목의 점수와 평균을 가지고 "합격" 출력
		(합격의 조건 : 세 과목의 점수가 각각 40점이상이면서, 평균이 60점 이상이면 합격, 아니면 "불합격" 출력)
	 */
	public void opSample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시오 > ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하시오 > ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하시오 > ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		System.out.println("총점 > " + total);
		
		//평균(합계/3.0)
		double d = total / 3.0;
		System.out.println("평균 > " + d);
		
		System.out.println("======================");
		
		//세 과목의 점수가 각각 40점이상이면서&&, 평균이 60점 이상이면 합격, 아니면 "불합격" 출력
		//강사님 답변(나와 다른 이유 : 그냥 출력해도 되지만 만약에 변수들이 계속 달라질 수 있기 때문에 이왕이면 문법 사용하기)
        //String result = kor>=40 && eng>=40 && math>=40 && avg>=60?"합격":"불합격";
		String result = (kor >= 40 && eng >= 40 && math >= 40) && d >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
	}
	/**
	 * 

[문제 2]
 - 구현 내용 : 
	변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고 변수값을 화면에 출력 확인함.
	성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
	=> 변수 선언후 입력받음 
	학생이름 (문자열), 학년 (정수), 반 (정수), 번호 (정수), 
	성별(M/F) (문자)//문자열로 입력받은 후, 문자하나 분리해야 함
	성적 (실수) 	  //성적은 소수점 2자리까지 출력

 - 출력 예
	3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
	 */
	public void opSample2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름 : ");
	String name = sc.next();
	
	System.out.print("학년 : ");
	int grade = sc.nextInt();
	
	System.out.print("반 : ");
	int cls = sc.nextInt();
	
	System.out.print("번호 : ");
	int iNum = sc.nextInt();
	
	System.out.print("성별(M/F) : ");
	char gender = sc.next().charAt(0);
	String str = (gender == 'M'|| gender == 'm') ? "남" : "여";
	
	System.out.print("성적 : ");
	double score = sc.nextDouble();

	System.out.printf("%d학년 %d반 %d번 %s학생 %s은 성적이 %.2f이다.",grade,cls,iNum,str,name,score);
	
	}
	
	/**
	 * 메소드명 : public void opSample3(){}
	- 구현 내용 : 
		1. 정수 변수 선언
		2. 키보드로 부터 정수 하나 입력받음
		3. 입력받은 정수가 양수이면 "양수다." 출력
		      양수가 아니면 "양수가 아니다." 출력
	 */
	public void opSample3(){

		Scanner sc = new Scanner(System.in);
		
		int iNum;
		String str;
		
		System.out.println("정수 입력 : ");
		iNum = sc.nextInt();
				
		str = (iNum > 0) ? "양수다." : "양수가 아니다.";
		
		System.out.println(str);
	}
	
}
