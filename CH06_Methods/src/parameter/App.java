package parameter;

public class App {

	public static void main(String[] args) {
		// 매개변수(파라미터)가 있는 메소드 사용
		Calculater cal = new Calculater();
		int number = 5;
		int result = cal.square(number);
		// 방법 위아래 두가지
//		int result = cal.square(5);
//		System.out.println(result);
		
		result = cal.plus(10, 10);
		System.out.println(result);

		result = cal.minus(10, 5);
		System.out.println(result);

		result = cal.multi(10, 10);
		System.out.println(result);
		
		
		
	}

}

;
