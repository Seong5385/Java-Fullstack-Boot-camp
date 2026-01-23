package chapter18;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		try {
			OutputStream out = System.out;
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('2');
			out.write('3');
			out.write('가');
			out.write('나');
			out.write('다');
			out.flush();
			out.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
