package application;

public class Final {

	public static void main(String[] args) {
		// 변수 앞에 final이 붙으면 상수(변하지 않은 값)
		final int VALUE = 9; //변하지 않은 정수가 됨 //상수는 대문자로 
		// VALUE = 11;  상수는 값을 대입할 수 없다.
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "ASD";
		// USER_PASSWORD = "AAA";
		
		System.out.println(USER_PASSWORD);
	}

}
