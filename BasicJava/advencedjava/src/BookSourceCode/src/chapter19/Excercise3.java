package chapter19;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Excercise3 {

	public static void main(String[] args) {
		
		try {
			URL url = null;
			url = new URL("https://www.google.co.kr");

			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while ((data = is.read()) != -1) {
					System.out.print((char) data);
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
