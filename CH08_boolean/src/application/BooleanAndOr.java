package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && || ���ļ� ���
		boolean isRaining = true; // �� ���°�?
		boolean mightRain = false; // �� �ü��� �ֳ�?
		boolean haveUmbrella = false; // ����� ������ �ֳ�?
		//1.
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� ���� �ʴ´�");
		}
		
		//2.
		boolean rainCheck = isRaining || mightRain;
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� ���� �ʴ´�");
		}

	}

}
