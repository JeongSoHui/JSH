package kh.java.oop.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		//계좌 객체
		Account acc = new Account();
//		acc.name = "홍길동"; //이 계좌의 주인은 "홍길동"이고
//		acc.balance = 1_000_000; // 계좌의 금액은 100만원
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		
		
		//입금
//		acc.balance += 500_000; //직접 접근방식 (원래 있던 금액 acc.balance에 50만원 넣기)
//		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다.%n",acc.name, acc.balance);
		
		acc.deposit(500_000); // 50만원 입금해주세요 의미
		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다.%n",
						acc.getName(), acc.getBalance()); //get ()는 메소드를 호출하는 것.
		
		
		//출금
//		acc.balance -= 700_000;
//		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다.%n",acc.name, acc.balance);
		
		acc.withdraw(700_000); //더 안전하다.
		acc.withdraw(1_700_000);
		
		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다.%n",
				acc.getName(), acc.getBalance());
	}
}
