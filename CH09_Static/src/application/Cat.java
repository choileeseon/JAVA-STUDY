package application;

public class Cat {
	private String name; //�̸� (Cat�� ��ü�� �����ؾ� ��밡��)
	private int id; // ���̵� (������ȣ, �ߵ��ȵ�)
	//����ƽ ���
	public static final String FOOD = "����� ���"; //(���� �������� ��밡��
	//����ƽ ����(��ü�鿡 ������)
	public static int count = 0; //�ʱⰪ 0
	
	public Cat(String name) {
		this.name = name;
		count++;
		id = count; // ��ü�� ������������� ī��Ʈ �����ϸ鼭 ����
	}
	
	public static int getCount() {
		// ����ƽ�޼ҵ�� �Ϲ� �ν��Ͻ�(��ü)���� ���Ұ�
		//String s = name; ��ü�� ��������� ���� ��밡���ϹǷ� 
		// �ν��Ͻ� ������ ����Ҽ��� ����.
		return count; // ����ƽ ������ ��밡��
	}

	@Override
	public String toString() {
		return "Cat [�̸�=" + name + ", ���̵�=" + id + "]";
	}
	
//	@Override 
//	public String toString() {
//		return "Cat [�̸�=" + name + "]";
//	}
	
	
}
