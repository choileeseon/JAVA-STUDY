package sorting_list;

import java.util.ArrayList;
import java.util.Collections;

//같은 패키지 안에끼리는 import 필요없음

public class App {

	public static void main(String[] args) {
		// 리스트 정렬
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(3.45);
		doubles.add(6.95);
		doubles.add(2.35);
		doubles.add(1.78);
		doubles.add(4.87);

		doubles.forEach(System.out::println); // 위 순서 그대로
		
		Collections.sort(doubles); //순서대로 정렬
		
		doubles.forEach(System.out::println);
		
		//기본타입 숫자등은 값으로 정렬, 문자열, 문자 등은 알파벳순 정렬, 한글은 가나다순
		
		//커스텀 객체의 정렬
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
	
		// Comparable 인터페이스 구현 해야함.
		Collections.sort(people); //정렬
		people.forEach(System.out::println);
		
	}

}
