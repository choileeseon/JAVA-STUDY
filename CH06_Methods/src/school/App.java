package school;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("ö��",34);
		Student s2 = new Student("�̿�",23);
		Student s3 = new Student("�ѳ�",49);
		Student s4 = new Student("ȿ��",26);
		
		s1.setVisible(false);	// ö���� ����, �µ����� ����
		
		s2.setTemperature(35.5);	// �浿�� ��ü, �µ� 35.5
		
		s3.setTemperature(36.5);	// �ѳ��� ��ü, �µ� 36.6
		
		s4.setVisible(false);	// ȿ�ŵ� ����

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		

	}

}
