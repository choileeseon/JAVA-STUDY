package returnValue;

public class App {

	public static void main(String[] args) {
		// ���ϰ��� �ִ� �޼ҵ���
		ReturnMethod r1 = new ReturnMethod();
		
		// r1.getAnimal(); �� cat ������ ���� => ReturnMethod Ŭ������ void�� String���� �ٲ�
		String cat = r1.getAnimal();
		
		System.out.println("Ĺ ������ : " + cat); 
	}

}

