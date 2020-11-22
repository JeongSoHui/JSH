package kh.java.multi.dimentioanl.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 가변 배열(크기가 들쑥날쑥)
 * 2차원 배열의 길이가 각각 다른 경우
 * 
 */
public class JaggedArray {

	public static void main(String[] args) {
		JaggedArray j = new JaggedArray();
//		j.test1();
		j.test2();
	}
	/**
	 * @실습 문제 : 3행짜리 2차원 배열을 선언후에, 각 행별 열의 개수는 사용자에게 입력받으세요.
	 * 			1~100사이의 난수를 대입 후에, 5의 배수만 출력하세요.
	 * 
	 * 			5의 배수가 하나도 없다면 "5의 배수가 존재하지 않습니다." 출력
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행 열의 개수 입력하세요 : ");
			int col = sc.nextInt(); //사용자한테 입력받은 정수
			arr[i] = new int[col];
		}
		//2. 요소에 정수 대입
		Random rnd = new Random();
		boolean flag = false; //5의 배수가 존재하는가?(일단 없다고 가정하고 시작)
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100) +1;
				
				//5의 배수여부 검사(5의 배수가 존재한다면 이렇게 출력해라 의미)
				if(arr[i][j] % 5 == 0) {
					flag = true;
					System.out.print(arr[i][j] + " " );
			}
		}
}
		if(!flag)  // flag == true라고 써도 됨.
			System.out.println("5의 배수가 존재하지 않습니다.");
		
		System.out.println("\n-------------------------");
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				}
				
			}
		
		}
	
	public void test1() {
		//여기에서 2차원 배열의 크기를 지정하지 않음.
		int[][] arr = new int[2][];

		System.out.println(arr[0]); //null
		System.out.println(arr[1]); //null (아직 할당된 값이 없기 때문에)
		
		//여기에서 각각 할당(행마다 열을 다르게 줄 수 있다.) 0 0 0
		//								     0 0    이런 느낌으로
		arr[0] = new int[3]; 
		arr[1] = new int[2];
		
		System.out.println(arr[0]); //여기서는 할당되어서 값이 나옴
		System.out.println(arr[1]);
		
		//요소별 값 할당
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[0][2] = 40;
		
		arr[1][0] = 100;
		arr[1][1] = 200; //열 값을 준데까지만 할당이 가능
//만약에 arr[1][2]	= 300;을 할당하면 오류(애초에 배열 공간이 없기 때문에)
		
		for(int i = 0; i < arr.length; i++) {//가변배열은 배열이 일정하지 않기 때문에 arr[0].length를 쓸 수 없다.
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
				
			}
		}
		
	}
}
