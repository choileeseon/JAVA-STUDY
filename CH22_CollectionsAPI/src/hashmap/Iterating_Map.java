package hashmap;

import java.util.HashMap;

public class Iterating_Map {
	public static void main(String[] args) {
		// 맵 타입을 반복문 출력
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
	
		//람다식으로 출력
		months.forEach((k,v)-> System.out.println(k + " : " + v));
		System.out.println();
		
		//entrySet() : key와 value값을 가져옴
		for(var entry : months.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//KeySet() 키 값만 가져옴
		for(var key : months.keySet()) { //키 값 가져오기
			String v = months.get(key); // get(key): key의 value값을 가져오기
			System.out.println(key + " : " + v);
		}
		System.out.println();
		
		//
	
	}

}
