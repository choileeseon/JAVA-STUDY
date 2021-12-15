package stream_example;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		
		numbers.forEach(System.out::println); //원래 쓰던거
		System.out.println();
		//stream객체 생성.foreach = 결과는 같음
		numbers.stream()
			.filter(n -> n > 5) //5보다 큰것만 남김
			.map(n -> n*n)
			.forEach(System.out::println); 
	}

}
