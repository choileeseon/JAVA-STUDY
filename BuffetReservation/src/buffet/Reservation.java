package buffet;

import java.util.ArrayList;
import java.util.Scanner;


public class Reservation {
	// 호텔 뷔페 이름
	String title;
	// 회원 리스트
	ArrayList<Membership> members = new ArrayList<>();
	// 비회원 리스트
	ArrayList<NonMembership> nonMembers = new ArrayList<>();
	
	private boolean isRunning = true; 
	Scanner scanner = new Scanner(System.in);
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	//isRunning이 false가 되면 종료
	public void run() {
		while(isRunning) {
			reserveBtn();
		}
		scanner.close();
	}
	
	// 1번째
	// 1.예약하기 , 2.예약조회하기 목록
	public void reserveBtn() {
		System.out.println();
		System.out.println(title + " 뷔페에 오신 것을 환영합니다.");
		System.out.println("1.예약하기");
		System.out.println("2.예약조회하기");
		System.out.println("3.종료");
		System.out.println("[예약취소문의는 전화로 상담해드립니다.]");
		System.out.print("#  선택 -> ");
		String s = scanner.nextLine();
		int yesOrNo = Integer.parseInt(s); 
		switch(yesOrNo) {
			case 1 :
				memberCheck();
				break;
			case 2 : 
				reserveCheck();
				break;
			case 3 : 
				System.out.println("프로그램 종료");
				isRunning = false;
				break;
			default :
				System.out.println("다시 선택하여 주세요");
				reserveBtn();
				break;
		}
	}
	
	// 2번째 회원 or 비회원 확인하기
	public void memberCheck() {
		System.out.println("==============");
		System.out.println("롯데호텔 리워즈 회원이신가요?");
		System.out.println("[로그인 후 레스토랑 예약으로 이동합니다]");
		System.out.println("회원예약(y) / 비회원예약(n)");
		System.out.print("#  선택 -> ");
	
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
	// 3번쨰 회원예약하기
	public void membership() {
		System.out.println("==============");
		String user = inputId(1);

		System.out.println("==============");
		int password = inputPassword(1);
		
		//멤버 리스트에 저장하기 				
		Membership member = new Membership(user,password,0,0,0);
		members.add(member);
		System.out.println("==============");
		System.out.printf("반갑습니다. %s님!",member.getId());
		
		reservingStep(member);
		
	}
	// 3번째 비회원 예약하기
	public void nonMembership() {
		System.out.println("==============");
		String name = inputId(2);
		
		
		System.out.println("==============");
		int phone = inputPassword(2);
		
		NonMembership nonMember =  new NonMembership(name,phone,0,0,0);
		nonMembers.add(nonMember);
		System.out.println("==============");
		System.out.printf("반갑습니다. %s님!", nonMember.getName()); 
		
		reservingStep2(nonMember);
		
	}
	
	// 회원 id,비회원 성명 적는 공식
	private String inputId(int mode) {
		String result = null;
		switch(mode) {
			case 1 : //회원id
				while(true) {
					System.out.println("회원 아이디를 입력해주세요");
					System.out.print("회원 아이디 > ");
					result = scanner.nextLine();
					
					if (result.trim().isEmpty()) {
						System.out.println("회원 아이디는 공백을 허용하지 않습니다.");
						System.out.println("==============");
					}else {
						System.out.println("아이디 입력완료");
						break;
					}
					
				}
				break;
				
			case 2 : //비회원 성명
				while(true) {
					System.out.println("고객님의 성명을 입력해주세요");
					System.out.print("고객님 성명 > ");
					result = scanner.nextLine();
					
					if (result.trim().isEmpty()) {
						System.out.println("공백을 허용하지 않습니다.");
						System.out.println("==============");
					}else {
						break;
					}
				}
				break;
		}
		return result;
	}
	// 회원은 password / 비회원은 전화번호 뒷자리
	private int inputPassword(int mode) {
		int result2 = 0;
		switch(mode) {
			case 1 :
				while(true) { // 회원 password
					System.out.println("비밀번호를 4자리를 입력해주세요");
					System.out.print("회원 비번 > ");
					String s = scanner.nextLine();
					try {
						result2 = Integer.parseInt(s);						
					} catch (Exception e) {
						System.out.println("비밀번호는 숫자로만 적으세요");
						System.out.println("==============");
						continue; //다시 while 첫 반복문으로 돌아감
					}
					if(s.length() < 4 || s.length() > 4) {
						System.out.println("비밀번호는 4자리 입니다.");
						System.out.println("==============");
						continue;
					}
					else {
						break;
					}
				}
				break;
			case 2 : // 비회원 전화번호 뒷자리
				while(true) {
					System.out.println("고객님의 번호 뒷자리 4자리를 입력해주세요");
					System.out.print("휴대폰 뒷번호 4자리 > ");
					String s = scanner.nextLine();
					try {
						result2 = Integer.parseInt(s);
					} catch (Exception e) {
						System.out.println("연락처 끝에 4자리를 입력해주세요");
						System.out.println("==============");
						continue;
					}
					if(s.length() < 4 || s.length() > 4) {
						 System.out.println("연락처 끝 4자리를 입력해주세요");
						 System.out.println("==============");
						 continue;
					}
					break;
				}
				break;	
		}
		return result2;
	}
	
	// 4번째
	// 예약하는 과정 (회원)
	public void reservingStep(Membership member) {
		//1.방문 일자 선택
		int setDate = 0;
		System.out.println();
		while(true) {
			System.out.println("==============");
			System.out.println("Step1 이번 달 방문 예정 일시 선택 ");
			System.out.printf("#  방문일자 -> ");
			String s = scanner.nextLine();
			try {
				setDate = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *방문하실 일자만 적어주세요");
				continue;
			}
			System.out.println("2022년 이번 달 " + setDate +"일 을 선택하셨습니다. ");
			member.setDate(setDate);
			break;
		}
		//2.예약인원 선택
		int setCount = 0;
		while(true) {
			System.out.println("==============");
			System.out.printf("Step2 예약 인원 > ");
			String s = scanner.nextLine();
			try {
				setCount = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *인원숫자만 적어주세요");
				continue;
			}
			System.out.println("예약인원은 " + setCount +"명 입니다. ");
			member.setNumbers(setCount); //예약 인원 저장
			break;
		}
		//3.예약시간대 선택
		int setTime = 0;
		while(true) {
			System.out.println("==============");
			System.out.println("Step3 예약 시간대\n(1부 19:00 ~ 19:40\r\n"
					+ "-2부 20:00 ~ 20:40\r\n"
					+ "-3부 21:00 ~ 21:40\r\n"
					+ "-4부 22:00 ~ 22:40) ");
			System.out.printf("이용 시간대 > ");
			String s = scanner.nextLine();
			try {
				setTime = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *몇 부에 방문하실건지 숫자만 적어주세요");
				continue;
			}
			if (setTime < 0 || setTime > 4) {
				System.out.println(" 범위를 벗어났습니다. 다시 선택해주세요");
				setTime = scanner.nextInt();			
			}else {
				System.out.println("선택하신 예약시간은 " + setTime +"부 입니다. ");
				member.setTime(setTime); //예약 인원 저장
			}
			break;
		}
		//회원
		//예약 확인         
		System.out.println("==============");
		System.out.printf("📆이번 달 %d일 / ⏱예약 시간대 %d부 / 🙍‍♀ 인원수 %d명\n",setDate,setTime,setCount);
		System.out.println("예약해 주셔서 감사합니다.");
		System.out.println("\r\n"
				+ "[문의안내]"
				+ "[TEL +82-52-960-4260]\r\n");
		System.out.println("==============");
	}
	
	// 4번째
	// 비회원 예약과정
	public void reservingStep2(NonMembership nonmember) {
		//1.방문 일자 선택
		int setDate = 0;
		System.out.println();
		while(true) {
			System.out.println("==============");
			System.out.println("Step1 이번 달 방문 예정 일시 선택 ");
			System.out.printf("#  방문일자 -> ");
			String s = scanner.nextLine();
			try {
				setDate = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *방문하실 일자만 적어주세요");
				continue;
			}
			System.out.println("2022년 이번 달 " + setDate +"일 을 선택하셨습니다. ");
			nonmember.setDate(setDate);
			break;
		}
		//2.예약인원 선택
		int setCount = 0;
		while(true) {
			System.out.println("==============");
			System.out.printf("Step2 예약 인원 > ");
			String s = scanner.nextLine();
			try {
				setCount = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *인원숫자만 적어주세요");
				continue;
			}
			System.out.println("예약인원은 " + setCount +"명 입니다. ");
			nonmember.setNumbers(setCount); //예약 인원 저장
			break;
		}
		//3.예약시간대 선택
		int setTime = 0;
		while(true) {
			System.out.println("==============");
			System.out.println("Step3 예약 시간대\n(1부 19:00 ~ 19:40\r\n"
					+ "-2부 20:00 ~ 20:40\r\n"
					+ "-3부 21:00 ~ 21:40\r\n"
					+ "-4부 22:00 ~ 22:40) ");
			System.out.printf("이용 시간대 > ");
			String s = scanner.nextLine();
			try {
				setTime = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println(" *몇 부에 방문하실건지 숫자만 적어주세요");
				continue;
			}
			if (setTime < 0 || setTime > 4) {
				System.out.println(" 범위를 벗어났습니다. 다시 선택해주세요");
				setTime = scanner.nextInt();			
			}else {
				System.out.println("선택하신 예약시간은 " + setTime +"부 입니다. ");
				nonmember.setTime(setTime); //예약 인원 저장
			}
			break;
		}
			
		//비회원
		//예약 확인         
		System.out.println("==============");
		System.out.printf("📆이번 달 %d일 / ⏱예약 시간대 %d부 / 🙍‍♀ 인원수 %d명\n",setDate,setTime,setCount);
		System.out.println("예약해 주셔서 감사합니다.");
		System.out.println("\r\n"
				+ "[문의안내]\r"
				+ "[TEL +82-52-960-4260]\r\n");
		System.out.println("==============");
	}
	
	// 5번째. 조회하기
	private void reserveCheck() {
		//회원 비회원 묻기
		System.out.println("==============");
		System.out.println("회원이신가요? (y) / 비회원이신가요?(n)");
		System.out.print("#  선택 -> ");
	
		String isVisited = scanner.nextLine();
		switch(isVisited) {
		case "y":
		case "Y":
			memberShowCheck();
			break;
		case "n":
		case "N":
			nonMemberCheck();
			break;
		default:
			System.out.println("다시 입력해주세요");
			System.out.println();
			reserveCheck();
			break;
		}
	}			
		
	// 5-1 회원 예약조회를 위한 비밀번호 입력
	private void memberShowCheck() {
		System.out.println("==============");
		int password = inputPassword(1);
		boolean isExist = false;
		
		for(Membership each : members) {
			int eachPassword = each.getPassword(); //회원 비번만 확인
			
			if(password == eachPassword) {
				System.out.println("==============");
				System.out.println("조회 중 입니다...\n"); 
				// 1.5초간 대기 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("📆이번 달 %d일 / ⏱예약 시간대 %d부 / 🙍‍♀ 인원수 %d명\n",each.getDate(),each.getTime(),each.getNumbers());
				System.out.println("==============");
				isExist = true;
				break; //빠져나옴
			}
		}
		// 비밀번호가 다르거나 예약을 안했거나
		if(!isExist) {
			System.out.println("\r❗❗비밀번호가 맞지않거나 예약조회가 불가능합니다.");
			System.out.println("==============");
		}
		
	}
	
	// 5-1 비회원 예약조회를 위한 비밀번호 입력
	private void nonMemberCheck() {
			System.out.println("==============");
			int password = inputPassword(2);
			boolean isExist = false;
			
			for(NonMembership each : nonMembers) {
				int eachPassword = each.getPhone(); //비회원 비번만 확인 
				
				if(password == eachPassword) {
					System.out.println("==============");
					System.out.println("조회 중 입니다...\n");
					// 1.5초간 대기 
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("📆이번 달 %d일 / ⏱예약 시간대 %d부 / 🙍‍♀ 인원수 %d명\n",each.getDate(),each.getTime(),each.getNumbers());
					System.out.println("==============");
					isExist = true;
					break; //빠져나옴
				}
			}
			if(!isExist) {
				System.out.println("\n❗❗비밀번호가 맞지않거나 예약조회가 불가능합니다.");
				System.out.println("==============");
			}
		}
}






