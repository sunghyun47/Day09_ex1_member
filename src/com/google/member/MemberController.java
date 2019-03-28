package com.google.member;

import java.util.Scanner;

import com.google.view.MemberView;

public class MemberController {
	private Scanner sc; //스캐너 여기서만쓸거임
	private Member [] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;

	public MemberController() { //디폴트생성자
		sc = new Scanner(System.in); // 맴버변수 초기화
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
		//		System.out.println(members.length);
	}

	// start 메서드 생성
	// 1. 회원가입
	// 2. 로그인
	// 3. 회원정보 전체출력
	// 4. 프로그램 종료

	public void start() {

		boolean check = true;

		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보 전체출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt(); //멤버변수 sc활용
			switch(select) {
			case 1:
				Member m = mi.memberJoin();
				//System.out.println("가입");
				members = ma.add(members, m); // 배열이 0칸, 회원 추가될때마다 늘리려고
				break;
			case 2:
				System.out.println("로그인");
				Member member = mi.memberLogin(members);
				if (member != null) {
					System.out.println(member.getId()+ " 환영합니다");
				}
				else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("정보 출력");
				mv.view(members);
				break;
			default:
				check =! check; // check=fasle
			}

		}

	}


}
