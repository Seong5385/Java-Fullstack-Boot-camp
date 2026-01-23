package chapter19;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class ChatServer {
	
	static ServerSocket server;
	static int port = 6000;

	public static void main(String[] args) {
		
		try {
			server = new ServerSocket(port);
			System.out.println("채팅 서버 시작");
			
			while(true) {
				System. out.println("클라이언트 접속 대기 중");
				Socket client = server.accept();
				ChatServerThread ct =new ChatServerThread(client);
				ct.start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

class ChatServerThread extends Thread {
	Socket client;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String userId;
	static Hashtable<String, ObjectOutputStream> hm;
	
	ChatServerThread(Socket client) {
		this.client = client;
		hm=new Hashtable<String, ObjectOutputStream>();
		try {
			System.out.println(client.getInetAddress() + "접속");
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(client.getOutputStream());
			userId = (String)ois.readObject();
			System.out.println ("User_ID:" + userId + "접속");
			hm.put(userId, oos);
			broadcast(userId + "님이 입장하셨습니다");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void broadcast(String msg) {
		try {
			for(ObjectOutputStream o : hm.values()){
				o.writeObject(msg);
				o.flush();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String rcvData;
		try {
			while(true) {
				rcvData = (String)ois.readObject();
				if(rcvData.equals("/bye")) {
					break;
				} else if(rcvData.startsWith("/to")) {
					sendMsg(rcvData);
				} else {
					broadcast(userId+":"+rcvData);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			broadcast(userId + " 님이 퇴장하셨습니다");
			hm.remove(userId);
			try {
				if(client != null) client.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void sendMsg(String rcvData) {
		int begin = rcvData.indexOf(" ") + 1;
		int end = rcvData.indexOf(" ",begin);
		if(end != 1) {
			String id = rcvData.substring(begin, end);
			String msg=rcvData.substring(end+1);
			ObjectOutputStream oos = hm.get(id);
			ObjectOutputStream oos2 = hm.get(userId);
			if(oos != null) {
				try {
				oos.writeObject(userId+" 님의 귀속말 :" +msg);
				oos.flush();
				oos2.writeObject (id+"님에게 귀속말전송 :" +msg);
				oos2.flush();
				} catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
}
