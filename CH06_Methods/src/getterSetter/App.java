package getterSetter;

public class App {

	public static void main(String[] args) {
		// �ν��Ͻ� ������ �����ϴ� �޼ҵ� get�� set
		Person p1 = new Person();
		// p1.name = "���"; // ���Ȼ� ��ü�� ������ �ٷ� �������� ���� 
		p1.setName("���");
		p1.setAge(20);
	
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		Person p2 = new Person();
		
		p2.setName("�浿");
		System.out.println(p2.getName());
	
		p2.setAge(25);
		System.out.println(p2.getAge());
		
	}

}
