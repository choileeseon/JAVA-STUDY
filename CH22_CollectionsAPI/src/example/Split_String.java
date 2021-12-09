package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "Vaccine.// makers have known for months now that the immunity vaccines elicit against Covid-19 can wane over time, leading to the need for a booster dose. The boosters appear to restore immunity to where it was initially.\r\n"
				+ "Two separate studies from israel published Wednesday showed booster doses of Pfizer/BioNTech's coronavirus vaccine reduced infections tenfold and reduced Covid-19 deaths by 90%.\r\n"
				+ "The two studies, published in The New England Journal of Medicine, look at the effects of Israel's campaign to offer boosters to everyone 12 and older with the spread of the Delta variant in the summer. While deaths and severe cases were low among fully vaccinated people, booster shots lowered them dramatically more.\r\n"
				+ "It's more evidence that boosters not only restore waning immunity, but improve protection against emerging coronavirus variants.\r\n";
		String text2 = "클레르만 박사팀은 영국의 감염 방지 프로그램에 등록된 보건 분야 종사자 2천190명을 대상으로 클레르만 박사팀은 영국의 감염 방지 프로그램에 등록된 보건 분야 종사자 2천190명을 대상으로 코로나19 백신 접종 후에 나타나는 항체 수치를 검사했다. 이후 자체 개발 분석 모델을 이용해 접종 시간대와 백신 유형(화이자의 mRNA 백신 또는 아스트라제네카의 아데노바이러스 백신), 연령, 성별, 접종 후 경과코로나19 백신 접종 후에 나타나는 항체 수치를 검사했다. 이후 자체 개발 분석 모델을 이용해 접종 시간대와 백신 유형(화이자의 mRNA 백신 또는 아스트라제네카의 아데노바이러스 백신), 연령, 성별, 접종 후 경과";
		
//		String[] words = text1.split("[^a-zA-Z]+"); //영문철자를 제외한 특수문자 스페이스 점 슬래시같은 것들을 제외하고 단어만 리턴
		//^ : 제외 a-zA-Z 소,대문자 제외한 나머지들 빼기 = 영문자만 남음
		String[]words = text2.split("[^가-힣]+");
				
				
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); //소문자로 변환해서 출력
		}
	}

}
