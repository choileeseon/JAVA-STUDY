package application;

public class StringArray2 {

	public static void main(String[] args) {
		// ���ڿ��� ���� �ڷ���, ���� ����(reference variable)�� �ּҰ��� ������.
//		String text = null; // �� ���� �ּҰ��� ���� , ���� ���� ��������� �ּҸ� ���� text�� ���� �ִ� ��������
//		// int x = null; �⺻ �ڷ������� �ΰ��� �ԷºҰ� (�ΰ��� �ּҰ� ���ٴ� ��)
//		//text = new String("��ο�");  // �迭�� ����
//		text = "��ο�";		
//		System.out.println(text); // �ּҰ� = ��ο�
		
		String[] texts = null;
		System.out.println(texts);		// �ּҰ� = null
		texts = new String[3];			// �迭 (���ڿ�3ĭ)�� ���� �����ؼ� texts�� �ּ��Է�
		System.out.println(texts);		// �ּ� ???
		System.out.println(texts[0]);	// null, ���ڿ��� �ּҰ��� ����
		
		texts[0] = new String("����!");
		texts[1] = "�ȳ�";
		texts[2] = "�¹���";
		
		for(String w : texts) {
			System.out.println(w);
		}
	}

}
