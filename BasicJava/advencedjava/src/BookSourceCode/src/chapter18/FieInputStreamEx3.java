package chapter18;

import java.io.FileInputStream;
import java.io.IOException;

public class FieInputStreamEx3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/chapter17/InputStreamEx.java");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data=fis.read(buf, 0, buf.length)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
			
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
