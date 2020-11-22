package net.kh.member.run;

import java.util.Scanner;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
		
		//사용자 입력값으로 member객체 대입하기
		Scanner sc = new Scanner(System.in);
		
		Member m = new Member();
		System.out.print("이름 : ");
		String memberName = sc.next();
		m.setMemberName(memberName);
		
		m.setMemberId("thgml1979");
		m.setMemberPwd("1234");
		m.setPhone("01046337577");
		m.setEmail("thdnl1979@naver.com");
		m.setGender('여');
		m.setAge(27);
		
		String name = m.getMemberName();
		System.out.println(name);
		
		System.out.println(m.getMemberName());
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberPwd());
		System.out.println(m.getPhone());
		System.out.println(m.getEmail());
		System.out.println(m.getGender());
		System.out.println(m.getAge());
	}
}
