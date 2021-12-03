package enum_methods;

public class App {

	public static void main(String[] args) {
		//enum에서 사용하는 메소드
		
		Fruit[] fruits = Fruit.values(); //values(): enum의 모든 상수들을 배열로 리턴한다.
		
		for(Fruit f : fruits) { //하나씩 담겨 반복
			System.out.println(f);
		}
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		 
		//ordinal() : 순서(인덱스번호)를 리턴
		//ordinal() : enum의 상수의 순서(인덱스 번호)
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		//valueOf("문자열")
		//valueOf("상수값") : 상수값과 같은 enum을 찾음
		Fruit f1 = Fruit.valueOf("ORANGE"); //(문자열)과 같은 enum
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		
		
		
	}

}
