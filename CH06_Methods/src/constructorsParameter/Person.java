package constructorsParameter;

public class Person {
	private String name;
	private double height;
	
	// public Person(){}  // �⺻������
	// ������ �޼ҵ� : public + Ŭ������(), ����Ÿ�Ծ���
	public Person() {		// �ؿ� �ִ� name, height�� �������ָ� �ʱⰪ �����صаɷ� ���� ��
		name = "�͸�";
		height = 170;
		System.out.println("�� ����� ����!");
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("�� ����� ����!");
	}
	
	// toString �޼ҵ�
	public String toString() {
//		String text = "�̸� : "+name+ ", Ű : "+height; 
//		return text;
		// �Ǵ�
		return "�̸� : "+name+ ", Ű : "+height;
	}
	
	
	// get set �޼ҵ�
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	public double getHeight() {
//		return height;
//	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
}
