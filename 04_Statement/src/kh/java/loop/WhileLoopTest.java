package kh.java.loop;
/*
	초기식
	while(조건식){
		//반복실행구문
		증감식
	}
 */
public class WhileLoopTest {
	public static void main(String[] args) {
		WhileLoopTest w = new WhileLoopTest();
		w.test1();
	}
	public void test1() {
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
//		System.out.println(i); //i는 for문 안에 선언되었으므로 외부접근 불가
		
		
		System.out.println("-------------");
		
		
		int j = 1;
		while(j <= 10) {
			System.out.println(j);
			j++;
		}
//		System.out.println(j); //j는 while문 바깥에서 선언되었기 때문에 이 자리도 가능
		
		
		System.out.println("--------------");
		
		//10 9 8 7 6 5 4 3 2 1
//		j = 10;
//		while(j > 0) {
//			System.out.println(j);
//			j--;
//		}
//		System.out.println("--------------");	
//		
//		//1 3 5 7 9 11 13 15 17 19
//		j = 1;
//		while(j < 20) {
//			System.out.println(j);
//			j += 2;
//		}
//		System.out.println("--------------");	
//		
//		//20 18 16 14 12 10 8 6 4 2 
//		j = 20;
//		while(j > 0) {			
//		System.out.println(j);
//		j -= 2; //만약 이 증감식이 한칸 위로 올라가면 답이 달라진다. 왜? 생각해보면 조건식을 만나자마자 -2가 되는 꼴이니 답이 18~0까지 나오는것
		}
	}
