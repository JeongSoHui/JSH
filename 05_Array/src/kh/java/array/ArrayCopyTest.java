package kh.java.array;

/**
 * 얕은 복사 shallow copy
 	- 배열의 주소값(call stack)을 복사 /즉, call stack에 공간 2개가 되고 그 2개는 1개의 heap 요소를 가리킨다
 *
 * 깊은 복사 deep copy
 	- 실제 배열(heap)을 복사 /즉, heap에 새로운 요소가 생성되고 그 요소를 가리키는 call stack 자리가 하나 더 생긴다.
 */
public class ArrayCopyTest {

	public static void main(String[] args) {
	
		ArrayCopyTest a = new ArrayCopyTest();
		a.test1();
//		a.test2();
//		a.test3();
		
		
	}
	/**
	 * 깊은 복사2
	 	- clone : 통째로 복사하는것
	 	- System.arrayCopy : 일부만 가져다 복사하는 것
	 */
	public void test3() {
		//clone 이용
		byte[] arr1 = {1,2,3,4,5};
		byte[] arr2 = arr1.clone();
		
		printArr(arr1);
		printArr(arr2);
		
		
		//System.arrayCopy 이용(부분만 복사가 가능)
		byte[] arr3 = new byte[arr1.length];
		//void java.lang.System.arraycopy
		//(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(arr1, 0, arr3, 0, arr1.length); //arr1의 0번지에서 arr3의 0번지로 arr1 전체만큼 복사해주세요
//		System.arraycopy(arr1, 2, arr3, 1, 3) //arr1의 2번지에서부터 arr3의 1번지로 3만큼 복사해주세요			
		
		System.out.println(arr3.hashCode());
		printArr(arr3);
		
	}
	/**
	 * 깊은 복사1
	 	- 반복문을 통해 직접 요소값 복사
	 */
	public void test2() {
		byte[] arr1 = {10, 20, 30};
		byte[] arr2 = new byte[arr1.length]; // = new int[3]
		
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; //arr2에 arr1의 값을 넣은 것. 
		}
		
		arr1[1] = 127; //arr1[1]에 127값을 넣었다고 arr2[1]도 127이 되는 건 아니다.
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		printArr(arr1);
		printArr(arr2);
	}
	/**
	 * 얕은 복사
	 */
	public void test1() {
	
		byte[] arr1 = {1, 2, 3}; //배열의 초기화
		byte[] arr2 = arr1; //arr2에 arr1의 주소값을 넣은 것. 즉 얕은 복사
		
		arr1[1] = 100; //arr1 값을 이렇게 바꿨을 때 arr2도 같이 바뀌는 이유는 같은 heap을 향하기 때문
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		printArr(arr1);
		printArr(arr2);
	}
	
	public void printArr(byte[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(i < arr.length -1) { //맨마지막에는 ,가 안나오게 하기 위해서 -1
				System.out.println(", "); 
			}
		}
		System.out.println();
	}
	
}
