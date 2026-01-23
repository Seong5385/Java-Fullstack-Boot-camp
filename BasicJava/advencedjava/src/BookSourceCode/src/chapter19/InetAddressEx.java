package chapter19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			// getByName메서드로 InetAddress 객체 생성
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("hostname:" + ip.getHostName());
			System.out.println("ip :" + ip.getHostAddress());
			
			// getAllByName메서드로 InetAddress 객체배열 생성
			InetAddress[] ips = 
					InetAddress.getAllByName("www.google.co.kr");
			for (InetAddress i : ips) {
				System.out.println("ip 주소 :" + i);
			}
			
			// ip 주소값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress();
			// byte 자료형의 표현 범위 : 128 ~ 127
			// 127 이상의 값은 음수로 표현됨
			for (byte b : ipAddr) {
				System.out.print(((b < 0) ? b + 256 : b) + ".");
			}
			System.out.println();
			
			// getLocalHost 메서드로 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP:" + local);
			
			// getByAddress 메서드로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + " 주소 :" + ip2);
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}

	}

}
