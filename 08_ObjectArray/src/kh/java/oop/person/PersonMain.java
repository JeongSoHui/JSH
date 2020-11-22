package kh.java.oop.person;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonManager pm = new PersonManager();
		pm.insertPerson(new Person("홍길동"));
		pm.insertPerson(new Person("신사임당"));
		pm.insertPerson(new Person("세종대왕"));
		
		pm.printPerson();
		
//		Person[] arr = new Person[3];
//		
//		arr[0] = new Person("홍길동");
//		arr[1] = new Person("신사임당");
//		arr[2] = new Person("세종대왕");
		
		//배열초기화식 : 배열할당 + 배열요소할당(위에 식을 한번에 끝낸 것)
//		Person[] arr = {
//				new Person("홍길동"),
//				new Person("신사임당"),
//				new Person("세종대왕")
//		};
//		
//		System.out.println("---------------------");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].printPersonInfo();
//		}

	}

}
