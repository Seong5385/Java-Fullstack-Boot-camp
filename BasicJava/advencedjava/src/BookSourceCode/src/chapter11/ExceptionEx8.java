package chapter11;

import java.util.Scanner;

public class ExceptionEx8 {
	
	static String user_id = "seo";
	static String user_pw = "smg1234";

	public static void main(String[] args) throws Exception {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 : ");
			String input_id = scan.nextLine();
			
			System.out.print("비밀번호 : ");
			String input_pw = scan.nextLine();
			
			if (!user_id.equals(input_id)) {
				throw new LoginException("아이디가 올바르지 않습니다.");
			} else if (!user_pw.equals(input_pw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다.");
			} else {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
