package application;

public class MultiArray {

	public static void main(String[] args) {
		// ���߹迭[][]
		String[][] texts = {
				{"�ϳ�","��","��"}, 	//�迭1��
				{"��","�ټ�","����"}, 	//�迭2��
				{"�ϰ�","����","��ȩ"}	//�迭3��
		};

		for(int i = 0; i<texts.length; i++) {	// �迭�� ���� (��3��)
			System.out.printf("%d��° �迭 %s \n",i,texts[i]);  // �� �ּҰ� ��������...
			String[] inArray = texts[i]; // �迭�� inArray�� �ֱ�
			
			for(int j = 0; j<texts[i].length; j++) { // �迭[0].length --> �ϳ� �� ��
				System.out.printf("%s \t",texts[i][j]);
			}
			System.out.println(); // �ι��� for���� ���������� �����ٷ� �Ѿ ù��° for������ �ٽ� ����
			
		}
	}

}
