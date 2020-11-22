package kh.java.oop.student.model.vo;

public class Student {

	private String name;
	private int point;
	
	//기본 생성자
	public Student() {
		
	}
	//파마미터생성자
	public Student(String name, int point) {
		this.name = name; //현재 객체에 전달받은 name 객체를
		this.point = point;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//모든 필드 열람용 메소드
	public String print() {
		return "[name = " + name + ", point = " + point + "]";
	}
}
