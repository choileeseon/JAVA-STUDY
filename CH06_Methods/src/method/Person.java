package method;

public class Person {
		// Ŭ���� ���� �Ϲ� ���� => �ν��Ͻ� ���� (��ü ������ ������)
		String name; //���� ������ ������������ null�� 
		int age; //���� ������ ������������ 0 �� 
		
		// Ŭ���� ���� ���� �Լ��� �޼ҵ� => ��ü ������ ��밡�� => Person p1 = new Person(); 
		void sayHello() {
			System.out.println("����!" + name);
			System.out.println("�� ���̴�" + age);
		}

	
}

