package javaAPI;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// 이름을 키로, 이메일을 값으로 담을 해시맵을 만드세요
		HashMap<String,String> emails = new HashMap<>();
		
		// 데이터를 저장하세요
		emails.put("홍팍", "sehong@cloudstudying.kr");
		emails.put("나리", "nari@cloudstudying.kr");
		emails.put("정애", "jungaeg@cloudstudying.kr");
		
		// 해시맵의 크기를 출력하세요
		System.out.printf("emails.size() -> %d\n", emails.size());
		
		// key목록 출력
		System.out.println("\n== key set ==");
		for(String key : emails.keySet()) {
			System.out.println(key);
		}
		
		// value 목록 출력
		System.out.println("\n== value set ==");
		for(String val : emails.values()) {
			System.out.println(val);
		}
	}

}
