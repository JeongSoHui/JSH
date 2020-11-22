package kh.java.oop.student;
/**
 *클래스
  -객체를 만들기 위한 도면, 설계도 
  -프로그램의 성격에 맞게 추상화하여 속성/기능을 가질 수 있다.
 *
 *객체 
  -클래스를 바탕으로 메모리에 실체화된 결과물
  -new연산자를 사용하여 갯수 제한없이 생성 가능
  -각각의 객체는 다른 정보를 가질 수 있다.
 * 
 *속성 attribute / field
 *
 *기능 operation / method
 *
 * 접근 제한자
 * 
 * -클래스 레벨 : public, default
 * -필드/메소드 레벨 : public, protected, default, private
 * 
 	-public : 모든 패키지와 클래스에서 접근 가능
 	-protected : 같은 패키지와 자식 클래스에서 접근 가능
 	-default(package) : 같은 패키지에서만 접근 가능. 접근제한자 생략형태(직접 default라고 쓰면 안됨)
 	-private : 같은 클래스에서만 접근 가능
 *
 */
public class Student {//이 전체는 전역
	//속성(상태) 정의
	//현재클래스에서만 접근 가능
	private String name;
	private char gender;
	private int age;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}

	
	
	//기능
	public void introduce() {//이 안쪽은 지역, 필드(Field)
		System.out.printf("안녕하세요, 저는 %s입니다."
				+ " %c자이구요, %d살입니다. 반갑습니다.%n",name, gender, age);
	}
	
}
