package operators;

public class SHIFT {

	public static void main(String[] args) {
		// 비트 shift >>, << 연산
		int value = 0b00010001;
		System.out.println(toBinary(value));
		int result1 = value << 3;	//앞으로 3칸 사라지고 뒤에 나머지3칸은 0으로 채워짐 
		System.out.println(toBinary(result1));
		int result2 = result1 >> 3;
		System.out.println(toBinary(result2));

		System.out.println(100 << 3); //곱하기 값이 2^n승 
		System.out.println(100 >> 2); //나누기 2^n승 		
		
	}
	
	public static String toBinary(int value) { //2진수 문자열로 출력!
		//String.format은 printf처럼 사용하면 문자열로 리턴된다.
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0"); //공백일때는 0으로 채워라
	}

}
