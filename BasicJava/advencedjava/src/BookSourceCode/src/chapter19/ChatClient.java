package chapter19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ChatClient extends Frame implements ActionListener {
	
	static int port = 6000;
	Socket client = null;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String userId;
	Button btnExit, btnSend,btnConnect;
	TextArea taList;
	TextField tfIp, tfName,tfInput;
	CardLayout c1;
	
	ChatClient() {
		super("채팅프로그램");
		c1 = new CardLayout();
		setLayout(c1);
		Panel connect = new Panel();
		connect.setLayout(new BorderLayout());
		connect.add("North",new Label("채팅접속화면 ",Label.CENTER));
		Panel conn_sub = new Panel();
		conn_sub.setLayout(new GridLayout(10,1));
		conn_sub.add(new Label("서버 IP",Label.CENTER));
		tfIp = new TextField("127.0.0.1",15);
		conn_sub.add(tfIp);
		conn_sub.add(new Label("사용자 ID",Label.CENTER));
		tfName = new TextField("홍길동",15);
		conn_sub.add(tfName);
		connect.add("Center", conn_sub);
		btnConnect = new Button("서버접속");
		connect.add("South", btnConnect);
		btnConnect.addActionListener(this);
		Panel chat = new Panel();
		chat.setLayout(new BorderLayout());
		chat.add("North",new Label("채팅 ver1.0"));
		taList = new TextArea();
		chat.add("Center", taList);
		Panel chat_sub = new Panel();
		tfInput = new TextField("",25);
		btnExit = new Button("종료");
		btnSend = new Button("전송");
		chat_sub.add(tfInput);
		chat_sub.add(btnExit);
		chat_sub.add(btnSend);
		tfInput.addActionListener(this);
		btnExit.addActionListener(this);
		btnSend.addActionListener(this);
		chat.add("South", chat_sub);
		add(connect,"접속창");
		add(chat,"채팅창");
		c1.show(this, "접속창"); // 초기화면
		setSize(300,300);
		setVisible(true);// 화면에 표시됨
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();
			if (obj == btnConnect) {
				init();
			} else if (obj == btnExit) {
				System.exit(0);
			} else if (obj == btnSend || obj == tfInput) {
				String sendData = tfInput.getText();
				oos.writeObject(sendData);
				oos.flush();
				tfInput.setText("");
				tfInput.requestFocus();
			}
		} catch(IOException e2) {
			System.out.println(e2.getMessage());
		}
	}
	
	void init() {
		try {
			String ipAddr = tfIp.getText();
			client = new Socket(ipAddr,port);
			oos = new ObjectOutputStream (client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			userId = tfName.getText();
			oos.writeObject(userId);
			oos.flush();
			ReceiveDataThread rt = new ReceiveDataThread();
			rt.setDaemon(true);
			rt.start();
			c1.show(this, "채팅창");
			setTitle(userId + "채팅창");
			tfInput.requestFocus();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	class ReceiveDataThread extends Thread {
		String rcvData;
		public void run() {
			try {
				while(true) {
					rcvData = (String)ois.readObject();
					taList.append(rcvData + "\n");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}