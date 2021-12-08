package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\java502\\최이선\\java\\JAVA-STUDY\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		//파일 쓰기
		//트라이 안에 넣으면 reader.close 자동 
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("오렌지");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
			br.newLine();
			
		} catch (Exception e) {
			//파일 쓸 수 없음
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		} 

	}

}
