package application;

public class Break {

	public static void main(String[] args) {
		// break; ���� �ݺ��� �ȿ��� ��������
		int count = 0;
		
		while (true) {
			System.out.println("��ο� " + count);
			
			if (count == 5) {
				break;
			}
			
			System.out.println("how are you. ");
			
			count++;
		}
		
		System.out.println("���α׷� ����. "); // 5�� �Ǿ� break �� while���� �������ͼ� ���� 
		
	}

}
