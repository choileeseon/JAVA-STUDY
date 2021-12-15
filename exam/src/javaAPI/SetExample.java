package javaAPI;

import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//1.String 저장을 위한 트리셋 객체를 만드세요
		TreeSet<String> names = new TreeSet<String>();
		
		//객체 추가
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		
		//정보출력
		System.out.printf("names.size()->%d\n",names.size());
		System.out.printf("names.first()->%s\n",names.first()); // %s 뜻 알기 
		System.out.printf("names.last()->%s\n",names.last());
		
		//set의 모든 요소 출력
		System.out.println("==for each 구문 출력 ==");
		for(String str : names) {
			System.out.println(str);
		}
	}

}
