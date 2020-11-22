package kh.java.nested.loop;

import java.util.Scanner;

/**
 * 중첩 반복문을 사용하면 다차원적인 데이터를 처리할 수 있다.
 * 
 * 행(row)/열(column)로 이루어진 테이블 표현 가능
 *
 */
public class NestedLoopTest {

	public static void main(String[] args) {
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
//		n.test4();
//		n.test5();
//		n.test6();
		n.test7();
		
	}
	/**
	 ☆
	 ☆☆
	 ☆☆☆
	 ☆☆
	 ☆
	 */
	public void test7() {
	
		 for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("☆");
				}
			System.out.println();
			
				}
			}
		
	/**
	 * 구구단 출력
	 *---- 2단 ---- 
	 *2 * 1 = 2
	 *2 * 2 = 4
	 *2 * 3 = 6
	 *   ...
	 *2 * 9 = 18
	 *---- 3단 ---- 
	 *3 * 1 = 3
	 *3 * 2 = 6
	 *3 * 3 = 9
	 *   ...
	 *3 * 9 = 27
	 */
	public void test6() {
		for(int i = 2; i < 10; i++) {
				System.out.println("---- " + i + "단 ----");
			
			for(int j = 1; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		System.out.println();
		}
	}
	/**
	 ooo
	 o
	 ooo
	 o
	 ooo 
	 */
	public void test5() {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 3; j++) { 
				System.out.print("o");
				if(i % 2 != 0) //i(행)가 홀수일 때
				break; //break가 실행되어 처음으로 돌아감
			}
			System.out.println();
		}
			
}
	
	/**
	 ★
	 ★★
	 ★★★
	 ★★★★
	 ★★★★★
	 
	 continue 이하 코드를 실행하지않고,
	 -for문이라면 증감식
	 -while문이라면 조건식으로 이동한다.
	 
	 */
	public void test4() {
		
//		for(int i = 0; i < 5; i++) {
//			
//		for(int j = 0; j < i + 1; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
	
		//라벨(outer)을 사용한 break
		outer:
		for(int i = 0; ; i++) {//중간에 조건식이 없지? 그럼 무한으로 출력이 될거야. 그럴때 break;를 써주는거지
			
			for(int j = 0; j <= i; j++) {
				
				if(i > 5)
					break outer; //그냥 break만 쓰면 이 for문만 탈출하고 바깥 for문은 계속 돌기 때문에 outer까지 써줘야함. 
				
				System.out.print("☆");
			}
			System.out.println();
		}
		//라벨(outer)을 사용한 continue
		outer:
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("★");
				if(i == j) { //i가 j랑 같을 때까지만 ★을 찍겠다!
					System.out.println();
					continue outer; //증감식으로 갔다가 조건식으로 간다.
				}
		    }
		}
}
	
	/**
	 * @실습문제 : 사용자가 원하는 크기의 별박스 출력
	 *  행 : 3
	 *  열 : 4
	 *  -----
	 *         ★★★★
		 ★★★★
	            ★★★★
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int user1 = sc.nextInt();
		
		System.out.print("열 : ");
		int user2 = sc.nextInt();
		
		System.out.println("-------");
		
		for(int i = 0; i < user1; i++) {
			
			for(int j = 0; j < user2; j++) {
				System.out.print("★");
			}
			
			System.out.println();
		}
		
	}
	/**
	 * @실습문제 : 
	 	(0,0)(0,1)(0,2)(0,3)(0,4)
		(1,0)(1,1)(1,2)(1,3)(1,4)
		(2,0)(2,1)(2,2)(2,3)(2,4)
	 */
	public void test2() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print("★");
				//System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
	}
	
	public void test1() {
		
		//outer(행,가로 담당)
		for(int i = 0; i < 2; i++) {
			System.out.print(i + " : ");
			
			//inner(열, 세로 담당)
			for(int j = 0; j < 3; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println( ); //개행처리
								    // 결과) 0 : 0 1 2
								    //		1 : 0 1 2
		}
		
		for(int i = 0; i < 2; i++) {//행
			
			for(int j = 0; j < 3; j++) {//열
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println(); //개행처리
		}
	}
}
