package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			//서버에 연결 요청 및 객체 생성
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기(송신)
			String sendMessage = "자바 네트워크 프로그래밍";
			//OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터를 보냄: " + sendMessage);
			
			//데이터 받기(수신)
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터를 받음: " + receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");

		} catch (UnknownHostException e) {	//host 컴퓨터 이름이 잘못 될 경우
			e.printStackTrace();
		} catch (IOException e) {	//IP또는 port번호에 에러 발생한 경우
			e.printStackTrace();
		}

	}
	
	

}
