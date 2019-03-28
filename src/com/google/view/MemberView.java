package com.google.view;

import com.google.member.Member;

public class MemberView { // 출력담당

	// member 한명의 정보를 출력하는 메서드
	public void view(Member member) {
		System.out.println("ID : " + member.getId());
		System.out.println("PW : " + member.getPw());
		System.out.println("AGE : " + member.getAge());
		System.out.println("EMAIL : " + member.getEmail());
		System.out.println("PHONE : " + member.getPhone());

	}


	// member들의 정보를 출력하는 메서드
	public void view(Member [] members) {
		for(int i=0; i<members.length; i++) {
			Member member = members[i];
			this.view(member);

			//			System.out.println("ID : " + member.getId());
			//			System.out.println("PW : " + member.getPw());
			//			System.out.println("AGE : " + member.getAge());
			//			System.out.println("EMAIL : " + member.getEmail());
			//			System.out.println("PHONE : " + member.getPhone());


		}
	}




}
