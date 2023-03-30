package kr.ac.kopo.homework.day0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkMain01 {
	public static void main(String[] args) {
		
		
		List<Member> members = new ArrayList<>();
		
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "2222"));
		members.add(new Member("ccc", "3333"));
		members.add(new Member("ddd", "4444"));

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		// 변경할 member의 주소값을 담을 변수 생성
		Member member = null;
		
		// members리스트 안에 Member 
		for(Member m : members) {
			// id가 있으면 member 변수에 주소값 넣기
			if(m.equals(new Member(id))) member = m; 
		}
		
		// member 가 없으면 id 없음
		if(member == null) {
			System.out.println("입력하신 [" + id+ "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		
		// 비밀번호 비교, 올바르지 않으면 프로그램 종료
		if(!member.getPassword().equals(sc.nextLine())) {
			System.out.println("입력한 패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("변경할 새로운 패스워드를 입력하세요 : ");
		// 비밀번호 변경
		member.setPassword(sc.nextLine());
		System.out.println("패스워드 변경이 완료되었습니다.");
		
		System.out.println("< 전체 회원 목록 >");
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("--------------------");
		
		for(Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPassword());
		}
		System.out.println("--------------------");
		
		/*
		int memberIdx = members.indexOf(new Member(id));
		
		if(memberIdx == -1) {
			System.out.println("입력하신 [" + id+ "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!members.get(memberIdx).getPassword().equals(password)) {
			System.out.println("입력한 패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		} 
		System.out.print("변경할 새로운 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		members.get(memberIdx).setPassword(newPassword);
		System.out.println("패스워드 변경이 완료되었습니다.");

		System.out.println("< 전체 회원 목록 >");
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("--------------------");
		
		for(Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPassword());
		}
		System.out.println("--------------------");
		
		*/
	}

}
