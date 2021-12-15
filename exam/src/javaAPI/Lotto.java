//package javaAPI;
//
//import java.util.Random;
//
//public class Lotto {
//	public static void main(String[] args ) {
//		LottoMachine machine = new LottoMachine();
//		
//		int[] numbers = machine.getLottoNumbers();
//		
//		System.out.println("생성번호 : ");
//		for(int i : numbers) {
//			System.out.printf("%d", i);
//		}
//	}
//	
//}
//
//class LottoMachine {
//	
//	private int[] LottoNumbers;
//	
//	public int[] generate() {
//		int[] pickedNumbers = new int[6];
//		Random rand =  new Random();
//		
//		//1~45사이의 정수 랜덤값을 추출한다.
//		//임의의 숫자 6개를 추출
//		int num1 = 0;
//		while (num1 < 7) {
//			pickedNumbers[num1] = rand.nextInt(45) + 1;
//		}
//		return pickedNumbers;			
//	}
//
//	
//	public int[] getLottoNumbers() {		
//		
//		
//	}
//	
//	
//}
