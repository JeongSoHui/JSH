package kh.java.inherit.product.after;

public class SmartPhone extends Product {

	private String os;
	private String carrier;
	
	public SmartPhone() {}
	
	public SmartPhone(String brand, 
			  String productName, 
			  int price, 
			  String os, String carrier) {
	
		super(brand, productName, price);
		
		this.os = os;
		this.carrier = carrier;
			
	}

	public SmartPhone(String os, String carrier) {
		super();
		this.os = os;
		this.carrier = carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
	public String getProductInfo() {
		return super.getProductInfo() + ", " + os + ", " + carrier;
	}
}