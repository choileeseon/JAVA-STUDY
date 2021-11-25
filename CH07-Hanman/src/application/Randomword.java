package application;

import java.util.Random;

public class Randomword {
	// �����̽��ٷ� ����� �ܾ���� ���ڿ��� str�� ����
	private String str = "concept software drama person introduction explanation cheek wedding requirement failure arrival year instance shopping advertising argument presentation meal art assistance perspective gene history instruction complaint mixture quantity computer speaker thanks independence chocolate inflation baseball desk owner administration media Click to save this word! photo blood politics girl product injury satisfaction society leadership member thought disaster";
	private String[] words = str.split(" "); // ���ڿ��� �����̽��� �߶� �迭�� �ܾ�� �Է�
	
	private String selectWord; // �������� ���õ� �ܾ�
	private char[] characters; //���ڹ迭 ����(ö�ڸ� ���߸� ����)
	private Random random = new Random();
	public Randomword() {
		// �����ڿ� ���� �ܾ ����
		selectWord = words[ random.nextInt(words.length)]; //1. �������� ���ü���
		characters = new char[selectWord.length()]; //���ôܾ��� ���̸�ŭ ���ڹ迭 ũ��� ����
	}
	public void getWords() { //���� words�迭�� �ִ� ��ü �ܾ ���
		for(String w : words) {
			System.out.println(w);
		}
	}
	public String toString() {
		// �ܾ _�� ����Ѵ�.
//		String text = "";
		StringBuilder sb = new StringBuilder();
//		characters[3] = 'x'; //�׽�Ʈ
		
		for(char c : characters) {
			
//			if(c=='\u0000') { //����('')�� �ʱⰪ�̸� ���� ������ ���� ����
//				sb.append('_');
//			}
//			else {
//				sb.append('c'); //���� ������ ���
//			}
			
			sb.append(c=='\u0000' ? '_' : c); // �����߸� _ ����� c
			sb.append(' '); //ö�ڸ� ��ĭ�� �����̽���
		}
//		System.out.println(selectWord); //�������(�׽�Ʈ��)
		return sb.toString(); //���õ� ���� �ܾ ������
	}
	public void addGuess(char c) {
		// �Ѿ�� ���ڸ� rja���ؼ� ���¤��ܾ �������� characters�迭�� ����
		for(int i = 0; i < selectWord.length(); i++) { //�ܾ� ���̸�ŭ �ݺ�
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
	public boolean inCompleted() {
		// ö�ڸ� �� ������� üũ�ؼ� true, false�� ����
		for(char c : characters) { // �ܾ� ��ü ö�� �ݺ��˻�
			if(c=='\u0000') {
				return false; //���� ������� ������ ����
			}
		}
		return true; // �� ����
	}
}
