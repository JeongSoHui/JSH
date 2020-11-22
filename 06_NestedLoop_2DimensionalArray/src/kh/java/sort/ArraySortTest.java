package kh.java.sort;

import java.util.Arrays;

public class ArraySortTest {
/**
 *배열 정렬
 * 2 4 3 5 1 -> 5 4 3 2 1 
 * 
 * 정렬 알고리즘 종류
 * -순차정렬
 * -선택정렬
 * -버블정렬
 * -삽입정렬
 * -퀵 정렬
 * -합병정렬
 * ...
 */
	public static void main(String[] args) {
		ArraySortTest a = new ArraySortTest();
//		a.test1();
//		a.test2();
		a.test3();
		
		
	}
	/**
	 * @실습문제 : 로또 숫자 생성하기
	 	- 1 ~ 45 사이의 난수 6개
	 	- 중복 없음
	 	- 오름차순 정렬 (어려움...)
	 */
	public void test3() {
		
		int[] lotto = new int[6];
		
		int idx = 0;
		outer : 
		for(;;) {//조건없이 무한으로 돌림. == while(true)
			int num = (int)(Math.random() * 45 + 1);
			
			//중복 제거
			for(int i = 0; i < idx; i++) {//i가 0일때는 검사할게 없고 
				if(lotto[i] == num) //lotto의 i번지 수가 방금 뽑은 num(난수)와 같다면
					continue outer; // 바깥 for문으로 가서 continue outer(다시 뽑아라)의미
			
			}
		
			lotto[idx++] = num;
			
			if(idx == 6)
				break;
		}
		
		for(int i=0; i<lotto.length-1; i++) { //-1을 해준건 마지막 6번째자리는 앞에 5자리가 맞으면 굳이 비교할 필요가 없기 때문
			for(int j=i+1; j<lotto.length; j++) {
				
				if(lotto[i] > lotto[j])
					swap(lotto, i, j);
			}
		}
		System.out.println(Arrays.toString(lotto));	
	}
	/**
	 * 순차정렬
	 * Sequential Sort
	 * 
	 * 한 회차마다 해당하는 인덱스에 적합한 수를 찾는다.
	 */
	public void test2() {
		int[] arr = {4, 3, 0, 2, 1}; //{0,1,2,3,4}로 만드는 게 목적
		
		//i : 0 1 2 3
		for(int i = 0; i < arr.length - 1; i++) {//왜 -1인가? 앞에서부터 4개의 숫자가 제자리에 각각 있다면 마지막 자리는 검사 안해도 되겠지? 마지막 숫자는 할 필요가 없는거지
		
			//i = 0일때, j는 1 2 3 4				
			//i = 1일때, j는 2 3 4
			//i = 2일때, j는 3 4
			//i = 3일때, j는 4
			for(int j = i + 1; j < arr.length; j++) {//다른 자리의 숫자랑 비교 시작
				
				//오름차순 
				if(arr[i] > arr[j]) //i번지의 수와 j번지의 수랑 비교해서 큰 수가 뒤로가야하므로
					swap(arr,i,j);
				
			}
		}
		System.out.println(Arrays.toString(arr)); //{0 1 2 3 4}
	}
	
	/**
	 * 값 교환
	 */
	public void test1() {
		int num1 = 10;
		int num2 = 20;
		
		int temp = num1; //임시로 값을 담아두는 공간 temp를 만듦. 왜? 바로 num2값을 num1에 옮기면 그전에 있던 10이 날아가잖아
		num1 = num2;	 //그래서 임시공간에 미리 값을 넣어놓고 교환
		num2 = temp;
		
		System.out.println(num1); //20
		System.out.println(num2); //10
		
		int[] arr = {2, 1, 3};
		
//		temp = arr[0]; //temp에 arr 0번지 값을 미리 담아놓고
//		arr[0] = arr[1];
//		arr[1] = temp;
	
		swap(arr, 0, 1); //밑에 int[] arr, int i, int j처럼 해당하는 배열의 값을 직접 넣어준것.
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void swap(int[] arr, int i, int j) { //정수 배열을 하나 받고(int[] arr) 교환하고자하는 인덱스 i,j를 인자로 받음
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}






















