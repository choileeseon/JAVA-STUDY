package buffet;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
	// 호텔 뷔페 이름
	String title;
	
	//회원아이디(리워즈)
	String user;

	ArrayList<Membership> members = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	// 콘솔에 처음 뜨는 안내말
	public void initGreet() {
		System.out.println(title + " 뷔페에 오신 것을 환영합니다.");
		System.out.println("롯데호텔 리워즈 회원이신가요?");
		System.out.println("회원예약(y) / 비회원예약(n)");
	
		String isVisited = scanner.next();
		
		switch(isVisited) {
		case "y":
		case "Y":
			membership();
			break;
		case "n":
		case "N":
			nonMembership();
			break;
		default:
			System.out.println("다시 입력해주세요");
			initGreet();
			break;
		}
	}
	
	public void membership() {
		System.out.println("==============");
		System.out.println("회원 아이디를 입력해주세요");
		System.out.println("회원 아이디 번호 : ");
		
		user = scanner.next(); 
		
		//멤버 리스트에 저장하기
		Membership member = new Membership("","");
		members.add(member);
	}
	public void nonMembership() {
		System.out.println();
	}
}
