package product.run;

import product.model.vo.Product;

/**
 * @실습문제
실행용 클래스
* 패키지 : product.run
* 클래스명 : TestProduct
* 추가메소드 : public static void main(String[] args)
* 내용 : Product의 printProduct실행
기능제공 클래스
* 패키지 : product.model.vo
* 클래스명 : Product
* 메소드 :  public void printProduct() {} 
* 내용 : 제품소개글 출력(예: TV, 42인치, 100만원
 */
public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product(); //호출하고자 하는 기능제공 클래스의 이름
		p.printProduct();		   //호출하고자 하는 기능제공 클래스 안에 있는 메소드 호출
		
	}
	
	public void printProduct() {//Product안에 있는 printProduct 메소드
		System.out.println();	//호출(출력)
	}
}
