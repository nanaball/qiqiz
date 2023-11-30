package c6_queue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	
	String order; 		// 명령
	String to;			// 받은 이
	
	// alt + s+ a
	public Message(String order, String to) {
		super();
		this.order = order;
		this.to = to;
	}

	// alt + s+ s+ s
	@Override
	public String toString() {
		return "Message [order=" + order + ", to=" + to + "]";
	}
	
}

public class QueueExample {

	public static void main(String[] args) {

		// 선입선출 
		Queue<Message> messageQueue = new LinkedList<>();
		messageQueue.offer(new Message("sendMail", "최기근"));
		messageQueue.offer(new Message("sendSMS", "박보영"));
		messageQueue.offer(new Message("sendKAKAOTALK", "조정석"));
		System.out.println(messageQueue.size());
		
		// 다음 작업 뭔지 확인
		Message peekMessage = messageQueue.peek();
		System.out.println(peekMessage);
		System.out.println(messageQueue.size());
		
		while(!messageQueue.isEmpty()) {
			Message m = messageQueue.poll(); // Queue에서 수행할 작업을 꺼내온다.
			switch(m.order) {
				case "sendMail" : 
					System.out.println(m.to + "님에게 메일을 전송합니다.");
					break;
				case "sendSMS" : 
					System.out.println(m.to + "님에게 문자를 전송합니다.");
					break;
				case "sendKAKAOTALK" : 
					System.out.println(m.to + "님에게 톡을 전송합니다.");
					break;
			}
			
		} // end while
		
		System.out.println(messageQueue.size());
		
		
	}

}
