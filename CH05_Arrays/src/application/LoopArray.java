package application;

public class LoopArray {

	public static void main(String[] args) {
		// ���ڿ� Ÿ������ ���� �迭
		
		String[] animals = {"�����","������","����","�ϸ�","����","�⸰"};
		
//		System.out.println(animals[0]);
//		System.out.println(animals[1]);
//		System.out.println(animals[2]);
//		System.out.println(animals[3]);

		// �ݺ��� for�� �ε��� ��ȣ�� i�� , �迭.length�� �迭�� ������(ũ��)�� �˷��ش�.
		for (int i = 0; i<animals.length; i++) {
			System.out.printf("�ε��� ��ȣ %d���̰� ������ %s \n",i,animals[i]);			
		}
	}

}
