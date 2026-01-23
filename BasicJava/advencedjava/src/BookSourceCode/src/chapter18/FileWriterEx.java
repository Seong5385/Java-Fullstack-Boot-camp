package chapter18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = 
					new FileWriter("test3.txt");
			// 문자하나 출력
			fw.write('A');
			char[] buf = {'B','C','D'};
			// 문자배열 출력
			fw.write(buf);
			// 문자배열 off부터 len개수만큼 출력
			fw.write(buf,1,2);
			// 문자열 출력
			fw.write("저는 홍길동입니다.");
			
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
