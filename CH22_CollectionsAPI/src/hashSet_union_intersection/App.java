package hashSet_union_intersection; //union(합집합), intersection(교집합)

import java.util.HashSet;
import java.util.Objects;


public class App {
	public static void main(String[] args) {
		HashSet<String> list1 = new HashSet<>();
		list1.add("사과");
		list1.add("배");
		list1.add("딸기");
		list1.add("수박");
		
		HashSet<String> list2 = new HashSet<>();
		list2.add("체리");
		list2.add("배");
		list2.add("사과");
		list2.add("오렌지");
	
		HashSet<String> union = new HashSet<>(list1); //처음 생성시 리스트1을 입력해 생성
		union.addAll(list2); // 리스트1 + 리스트2 (중복 안됨)
		union.forEach(System.out::println);
		System.out.println();
		
		HashSet<String> intersection = new HashSet<>(list1); // 교집합		
		intersection.retainAll(list2);
		intersection.forEach(System.out::println);
		
	
	}

}
