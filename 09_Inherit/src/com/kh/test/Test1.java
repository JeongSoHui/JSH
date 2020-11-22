package com.kh.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			System.out.println(1);  //중간 과정을 보기 위해 출력문 임의로 찍어보기
			if(num == 1) {
				System.out.println('a'); //중간 과정을 보기 위해 출력문 임의로 찍어보기
				System.out.println("1은 소수가 아닙니다.");
			}else {
				System.out.println('b');//중간 과정을 보기 위해 출력문 임의로 찍어보기
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						System.out.println(num + "은/는 소수가 아닙니다.");
						return;
					}
				}
				System.out.println(num + "은/는 소수입니다.");	
			}
		}else {
			System.out.println(2); //중간 과정을 보기 위해 출력문 임의로 찍어보기
			System.out.println("1~100사이의 정수를 입력하세요!");
		}
	}
}
