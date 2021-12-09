package example;

import java.io.File;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이떄 리스트는 단어가 중복 되지않는다. 알파벳 순으로 저장 => TreeSet
		File book = new File("book.txt");
		//C:\Java502\java\JAVA-STUDY\CH22_CollectionsAPI\book.txt
		System.out.println(book.exists()); //파일이 있는지 확인
	
	}

}
