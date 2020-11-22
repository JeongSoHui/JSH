package kh.java.polymorphism.device;

public class Laptop extends Device{

	int capacity;

	public Laptop(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
