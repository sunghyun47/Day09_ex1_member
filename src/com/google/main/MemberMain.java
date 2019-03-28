package com.google.main;

import com.google.member.Member;
import com.google.member.MemberController;
import com.google.member.MemberInput;
import com.google.view.MemberView;

public class MemberMain {

	public static void main(String[] args) { // 프로그램 시작, 테스트 용도

//		String d1 = "test";
//		String d2 = "test";
//		System.out.println(d1.equals(d2));
//		
//		MemberInput mi = new MemberInput();
//		MemberView mv = new MemberView();
//		// Member m = mi.memberJoin();
//		
//		Member [] members = new Member[100];
//		for(int i=0; i<members.length; i++) {
//			Member member = new Member(); //멤버객체만듬
//			member.setId("id"+1);
//			member.setId("pw"+1);
//			members[i]=member;
//			
//		}
//		Member m = mi.memberLogin(members);
//		
//		System.out.println(m);
		
		
		
		MemberController mc = new MemberController();
		mc.start();
		
	}
}
