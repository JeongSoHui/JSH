package com.kh.test.dimentional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();
	}
	/**
	[ 구현내용 : ]
	1. 3행4열 2차원배열 선언 및 생성
	2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
	3. 아래의 내용처럼 처리함
		0열	1열	2열	3열	
	0행	값	값	값 	0행 값들의 합계
	1행	값	값	값	1행 값들의 합계
	2행	값	값	값	2행 값들의 합계
	 */
	public void exercise1() {
		Random rnd = new Random(); //임의의 정수값 기록해 넣기 위해
		
		int[][] rndArr = new int[3][4]; // 3행 4열 배열 선언 및 생성
		int sum1 = 0; // 0행 값들의 합계
		int sum2 = 0; // 1행 값들의 합계
		int sum3 = 0; // 2행 값들의 합계

		int row = 3; // 행
		int column = 4; // 열
		
		System.out.println("0열1열 2열	3열");
		 
		for(int i = 0; i < rndArr.length; i++) { //행
			System.out.printf("%d행", i);
			
			for(int j = 0; j < rndArr.length; j++) {//열
				System.out.print((rndArr[i][j] = rnd.nextInt(100) + 1) + " "); // i행 j열의 임의의 숫자(1~100 이내에서 랜덤)
				
				if(i == 0) { //0행
					sum1 += rndArr[i][j];
				}
				if(i == 1) { //1행
					sum2 += rndArr[i][j];
				}
				if(i == 2) {//2행
					sum3 += rndArr[i][j];
				}			
		}
			if(i == 0) {
				System.out.printf("값들의 합 : %d", sum1);
			}
			if(i == 1) {
				System.out.printf("값들의 합 : %d", sum2);
			}
			if(i == 2) {
				System.out.printf("값들의 합 : %d", sum3);
			}
			System.out.println();
		}
	}
}