package kh.java.polymorphism.device;

public class TV extends Device {

	private int channel;

	public TV(int channel) {
		super();
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
}
