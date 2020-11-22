package kh.java.oop.encapsulation;

public class Account {

	//필드,메소드의 접근제한자는 public, protected, default, private가 있다.
	//private의 의미는 '해당 클래스 안에서만 접근이 가능하다'
	private String name;
	private long balance; 
	
	/**
	 * setter
	 * 필드값 대입
	 */
	public void setName(String name) {
		//this는 현재객체를 가리키는 참조변수
		this.name = name; //앞에 this.name은 위에 private String name을 가리키고,
						  //뒤에 name_;은 바로 위에 (String name_)을 가리킨다.
//		name = name_; //위에 'private String name에서 받은 값을 name_에 넣어주세요' 의미
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	/**
	 * getter
	 * 필드값 가져오기
	 * 
	 * 해당 필드의 자료형과 getter리턴타입은 동일하다.
	 */
	public String getName() {
		return name; //this.가 생략되어있음(return this.name;)
		
	}
	public long getBalance() {
		return balance;
	}
	
	/**
	 * 입금 메소드
	 * 
	 * public의 의미는 '모든 패키지, 모든 클래스에서 접근 가능하다'
	 * 
	 */
	public void deposit(int money) {//private은 해당 메소드 안에서만 사용가능하므로 public 메소드를 만들어서 main메소드에서 사용 가능하게(이걸 안하면 Main에서 오류뜸)
		
		if(money > 0) {//돈이 0보다 클때만 입금하능하게ㅇㅇ
			balance += money; //private이라도 같은 클래스 안이라서 balance 사용이 가능한 것.
			System.out.printf("%s 님 계좌에 %d 원 입금 완료!%n", name, money);
			System.out.printf("%s 님 계좌 잔액은 %d 원 입니다.%n", name, balance);
		}
		else {//0보다 크지 않다면 이걸 출력해라.
			System.out.println("유효한 금액을 입력하세요.");
		}
	}
	
	/**
	 * 출금 메소드
	 */
	public void withdraw(int money) {
		
		if(money <= balance) {//현재 금액이 출금하려는 돈보다 크지않거나 같아야
			balance -= money;
			System.out.printf("%s 님 계좌에 %d 원 출금 완료!%n", name, money);
			System.out.printf("%s 님 계좌 잔액은 %d 원 입니다.%n", name, balance);
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
}
