package windowProgramming;

public class App {

	public static void main(String[] args) {
		// ������ ��ü�� ���� 
		// set �޼ҵ�� ���� �Է��ϰ� get�޼ҵ�� ���� ����϶�
		// ���� ������â�� ���α��� 300 ���α��� 600
		// ���� ���̵��� true, top 200, left 400
		
		Window w1 = new Window();
		w1.setWidth(300);
		System.out.println("���α��� "+w1.getWidth());
		
		w1.setHeight(600);
		System.out.println("���α��� "+w1.getHeigth());
		
		w1.setIsVisible(true);
		System.out.println("���纸�� "+w1.getIsVisible());
		
		w1.setTop(200);
		System.out.println("��ġtop "+w1.getTop());
		
		w1.setLeft(400);
		System.out.println("��ġleft "+w1.getLeft());
	}

}
