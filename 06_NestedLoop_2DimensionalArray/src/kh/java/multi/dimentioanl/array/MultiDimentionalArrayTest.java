package kh.java.multi.dimentioanl.array;
/**
 * 2차원 배열
 	- 참조의 참조형태로 2차원배열을 생성할 수 있다.
 	- 간단히 행/열을 이용해서 배열을 다룰 수 있다.
 */
public class MultiDimentionalArrayTest {

	public static void main(String[] args) {
		MultiDimentionalArrayTest m = new MultiDimentionalArrayTest();
//		m.test1();
//		m.test2();
//		m.test3();
//		m.test4();
		m.test5();
		
	}
	/**
	 * 2차원 배열 구조
	 */
	public void test5() {
		int[][] arr = new int[2][3]; //2행 3열의 2차 배열
		
	}
	/**
	 *  1 2 3 4
	 *  5 6 7 8 
	 *  9 10 11 12
	 */
	public void test4() {
		int[][] arr = new int[3][4];
		int k = 1; // i는 2차원배열의 행, j는 열 담당. 그거말고 1씩 증가하면서 실제 대입될 값을 관리하는 변수(
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				//값 대입
				arr[i][j] = k; //밑에 k++안쓰고 그냥 여기에 바로 k++로 써도 됨(arr[i][j] = k++;)
				k++;				// 2 4 6 8 처럼 나오게 하고 싶으면 k+=2로 고쳐주고 k는 2부터 시작하면 됨.
				
				//값 출력
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// A B C D ... Z
		// a b c d ... z
		
		char[][] alpha = new char[2][26];
		char b = 'A';
		char s = 'a';
		
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < alpha[0].length; j++) {
				if(i == 0) //첫번째 행이 0이니까
					alpha[i][j] = (char)('A' + j);
				else // 첫번째 행이 아니면
					alpha[i][j] = (char)('a' + j);
					
				System.out.println(alpha[i][j] + " ");
					
			}
			System.out.println();
		}
		
	}
	/**
	 * 2 * 5
	 * 
	 * A B C D E
	 * a b c d e
	 */
	public void test3() {
		char[][] alphabet = 
	{{'A', 'B', 'C', 'D', 'E'},{'a', 'b', 'c', 'd', 'e'}};
		
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[0].length; j++) {
				System.out.println(alphabet[i][j]);
			
			}
		}
	}
	public void test2() {
		String name[][] = new String[5][6];
		name[0][0] = "이원빈";
		name[0][1] = "김동현";
		name[0][2] = "유영국";
		name[0][3] = "강준혁";
		name[0][4] = "정인식";
		name[0][5] = "권송현";
		
		name[1][0] = "김진하";
		name[1][1] = "주진홍";
		name[1][2] = "유선아";
		name[1][3] = "정다미";
		name[1][4] = "김지현";
		name[1][5] = "김지훈";
		
		name[2][0] = "한광희";
		name[2][1] = "정다솜";
		name[2][2] = "이상원";
		name[2][3] = "이제환";
		name[2][4] = "황현준";
		name[2][5] = "정다빈";
		
		name[3][0] = "황수빈";
		name[3][1] = "김지수";
		name[3][2] = "김자경";
		name[3][3] = "박소연";
		name[3][4] = "서강석";
		name[3][5] = "유 리";
		
		name[4][0] = "정소희";
		name[4][1] = "사영리";
		name[4][2] = "강송이";
		name[4][3] = "강유정";
		name[4][4] = "이효정";
		name[4][5] = "이수연";
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[0].length; j++) {
				System.out.println(name[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void test1() {
		
		//1.배열 선언
		//int[][] 타입
		int[][] arr;
		//2.할당
		arr = new int[2][3]; //마치 행과 열이라고 생각해도 무방하다.
		
//		int[][] arr = new int[2][3]; //배열과 할당 동시에 하기
		
		//3. 요소에 값 대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j++) {
//				System.out.println("[" + i + "]" + "[" + j + "]");
				System.out.println(arr[i][j]);
			}
			
		}
		
	}
}
