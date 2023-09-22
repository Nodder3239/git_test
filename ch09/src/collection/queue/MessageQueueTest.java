package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		// Queue를 구현한 LinkedList를 자료구조로 사용
		Queue<Message> msgQueue = new LinkedList<>();
		
		//Message 객체 생성
		Message email = new Message("Email", "이순신");
		Message sms = new Message("SMS", "양만춘");
		Message katalk = new Message("KakaoTalk", "강감찬");
		
		//객체 저장 - offer()
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		//객체 꺼내기(삭제) - poll()
		//반복 - 확인(isEmpty())
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();	//1개 꺼냄
			switch(message.command) {
			case "Email":
				System.out.println(message.to + "님에게 이메일을 보냅니다.");
				break;
			case "SMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "KakaoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}//while 끝

	}

}
