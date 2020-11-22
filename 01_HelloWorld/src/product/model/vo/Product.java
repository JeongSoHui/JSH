package product.model.vo;

public class Product {

	public void printProduct() {
		Product p = new Product();
		p.test();		
	}
	
	public void test() {
		System.out.println("이 TV는 42인치이며, 가격은 100만원입니다.");
	}
}
