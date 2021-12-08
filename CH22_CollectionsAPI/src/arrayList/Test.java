package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> numbers = new ArrayList<>();
		
		double total = 0; //평균값을 구하기 위한 총합을 초기화
		
		while(true) {
			System.out.print("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine();
			input = input.trim(); //공백제거
			// System.out.println(input);
			if(input.equalsIgnoreCase("q")) { //입력을 q,Q 로 하면 반복문 종료
				break;
			}
			try {
				double value = Double.parseDouble(input); //문자열 => 실수로 변환
				numbers.add(value); //실수로 변환된 값을 리스트에 입력
				total += value;
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}
		scanner.close(); //스캐너 종료
		System.out.println();//한칸 띄우는용도
		
		if(numbers.size()>0) { //입력된 숫자가 1개이상이면 출력
			System.out.println("입력된 숫자 : ");
			for(Double num : numbers) {
				System.out.printf("%.2f\n",num);
			}
		}else { //처음부터 q를 누르면 출력되는 코드
			System.out.println("숫자가 입력되지 않음");
		}
		System.out.println("평균값 : " + total/numbers.size());
		
	}

}
