package com.google.member;

import java.util.Scanner;

public class MemberInput {
	
	private Scanner sc; //맴버변수 선언
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}

	//memberLogin
	//매개변수로 Member[] 받아서 
	//member를 리턴

	public Member memberLogin(Member [] members) {

		Member member = null; //래퍼런스 타입이니깐 null

		System.out.println("id 입력");
		String id = sc.next();

		System.out.println("pw 입력");
		String pw = sc.next();

		for(int i=0; i<members.length; i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())); {
				member = members[i];
				break;
			}
		}

		return member;
	}


	//메서드명 memberJoin
	//id, pw, 나이, 이메일, 전화번호
	//member를 리턴
	public Member memberJoin() {

		Member member = new Member();

		System.out.println("id 입력");
		String id = sc.next();
		member.setId(id);
		//member.setId(sc.next()); //위에 두줄 한줄로 표현가능

		System.out.println("pw 입력");
		//String pw = sc.next();
		member.setPw(sc.next());

		System.out.println("나이 입력");
		member.setAge(sc.nextInt());

		System.out.println("이메일 입력"); 
		member.setEmail(sc.next());

		System.out.println("전화번호 입력");
		member.setPhone(sc.next());

		return member;

	}




}
