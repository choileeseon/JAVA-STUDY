package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 텍스트 읽고 쓰기

		String text = "헬로우! \n  하 와 유?"; //적을 내용
		
		Path path = Paths.get("C:\\java502\\최이선\\java\\new.txt"); 
		//파일의 경로 (C:\java502\최이선\java\JAVA-STUDY\CH20_Reading_Writing\text.txt)
		
		//쓰기 : text.txt 에 위의 text내용을 적기
		//Files클래스의 스테틱 메소드 write로 (적을파일의 경로,적을내용(byte단위))
		//파일이 없을경우 만듬
		Files.write(path, text.getBytes()); //새 txt파일에 text 덮어씌움
		
		//읽기
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		
	}

}
