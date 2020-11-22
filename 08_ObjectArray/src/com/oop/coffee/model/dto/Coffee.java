package com.oop.coffee.model.dto;

public class Coffee {//기본생성자

	private String origin;
	private String location;
	
	public Coffee() {} //파라미터 생성자
	
		public Coffee(String origin, String location) {
			this.origin = origin;
			this.location = location;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
		
		
		}

