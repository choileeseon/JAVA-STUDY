package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 decimal 	 0-9 
		 * 2진수 binary 		 0-1 (컴퓨터)
		 * 16진수 hexadecimal	 0-F
		 * 
		 * 1234567890
		 * 0,1,10,11,100,111,1000 => 2진수 
		 * A0,FB,CD,FFF,FF00 	  => 16진수
		 */
		//8bit -> byte
		
		//16진수를 리터럴(값) 표시할때 0x 이진수는 0b
		int val = 0B11111111;
		System.out.println("10진수 : " + val);
		System.out.println(" 2진수 : " + Integer.toBinaryString(val)); //10진수 정수를 => 2진수표현
		System.out.println("16진수 : " + Integer.toHexString(val));
		
		
	}

}
