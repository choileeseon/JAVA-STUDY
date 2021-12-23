package buffet;

import java.util.ArrayList;
import java.util.Scanner;

import javaAPI.Book;

public class Reservation {
	// 호텔 뷔페 이름
	String title;

	ArrayList<Membership> members = new ArrayList<>();
	ArrayList<Book> books = new ArrayList<Book>();
	
	Scanner scanner = new Scanner(System.in);
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	// 1번째
	// 1.예약하기 , 2.예약취소하기 목록
	public void reserveBtn() {
		System.out.println(title + " 뷔페에 오신 것을 환영합니다.");
		System.out.println("1.예약하기");
		System.out.println("2.예약조회하기");
		System.out.println("[예약취소문의는 전화로 상담해드립니다.]");
		System.out.print("#  선택 -> ");
		int yesOrNo = scanner.nextInt();
		printReserveList(yesOrNo);
	}
	
	// 예약 또는 예약취소를 선택했을때 출력하기 
	public void printReserveList(int yesOrNo) {
		switch(yesOrNo) {
			case 1 :
				memberCheck();
				break;
//			case 2 : 
//				reservedCancle();
//				break;
			default :
				System.out.println("다시 선택하여 주세요");
				reserveBtn();
		
		}
	}
	
	// 3번째 회원 or 비회원 확인하기
		public void memberCheck() {
			System.out.println("==============");
			System.out.println("롯데호텔 리워즈 회원이신가요?");
			System.out.println("[로그인 하시면 마이페이지의 정보가 자동 입력 됩니다.]");
			System.out.println("[로그인 후 레스토랑 예약으로 이동하시겠습니까?]");
			System.out.println("회원예약(y) / 비회원예약(n)");
			System.out.print("#  선택 -> ");
			scanner.nextLine();
			String isVisited = scanner.nextLine();
			
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
				System.out.println();
				memberCheck();
				break;
			}
		}
		// 4번쨰 회원예약하기
		public void membership() {
			System.out.println("==============");
			System.out.println("회원 아이디를 입력해주세요");
			System.out.println("회원 아이디 : ");
			System.out.print("#  선택 -> ");
			String user = scanner.nextLine(); 
			
			System.out.println("==============");
			System.out.println("비밀번호를 입력해주세요");
			System.out.println("회원 비번 : ");
			System.out.print("#  선택 -> ");
			String password = scanner.nextLine(); 
			
			//멤버 리스트에 저장하기
			Membership member = new Membership(user,password);
			members.add(member);
			System.out.println("==============");
			System.out.printf("반갑습니다. %s님 ",member.getId());
			
			reservingStep();
			
		}
		// 5번째 비회원 예약하기
		public void nonMembership() {
			System.out.println("반갑습니다.");
			
			
			reservingStep();
			
			//고객 성명, 휴대폰번호 받기 
			//예약 확인해주기
			//비회원 예약은 정가 가격
			
		}
		// 이거먼저하기!!!!!!!!!!!
		// id, password 적는 공식
		private String input(int mode) {
			switch(mode) {
			
				
			}
		}
		
	// 2번째
	// 예약하는 과정
	public void reservingStep() {
		//1.방문 일자 선택
		System.out.println("==============");
		System.out.println("Step1 이번 달 방문 예정 일시 선택 ");
		System.out.printf("#  방물일자 -> ");
		int setDate = scanner.nextInt();
		System.out.println("2022년 이번 달 " + setDate +"일 을 선택하셨습니다. ");
		
		//2.예약인원 선택
		System.out.println("==============");
		System.out.printf("Step2 예약 인원 > ");
		int setCount = scanner.nextInt();
		System.out.println("예약인원은 " + setCount +"명 입니다. ");
		
		//3.예약시간대 선택
		System.out.println("==============");
		System.out.println("Step3 예약 시간대\n(1부 19:00 ~ 19:40\r\n"
										+ "-2부 20:00 ~ 20:40\r\n"
										+ "-3부 21:00 ~ 21:40\r\n"
										+ "-4부 22:00 ~ 22:40) ");
		System.out.printf("이용 시간대 > ");
		int setTime = scanner.nextInt();
		if (setTime < 0 || setTime > 4) {
			System.out.println(" 범위를 벗어났습니다. 다시 선택해주세요");
			setTime = scanner.nextInt();			
		}else {
			System.out.println("선택하신 예약시간은 " + setTime +"부 입니다. ");			
		}
		
		Book b = new Book(setDate,setCount,setTime);
		books.add(b);
		
		
	}
	
	
}






