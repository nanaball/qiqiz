package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerTask implements Runnable{

	// 현재 task에 등록된 client 정보를 저장
	Socket client;
	
	// client에게 메세지를 전달할 출력 스트림
	PrintWriter pw;
	
	// client에게 메세지를 입력받을 입력 스트림
	BufferedReader br;
	
	// 현재 client 사용자 닉네임(ID)
	String userID;
	
	/**
	 * server로부터 객체 생성 시 accept된 Clinet Socket정보를 생성자의 매개변수로 전달 받아 필드 초기화 진행
	 * @param client
	 */
	public ServerTask(Socket client) {
		this.client = client;
		
		try {
			// pw = new PrintWriter(기반스트림, autoFlush);
			// new OutputStream(File,append);
			pw = new PrintWriter(
				new BufferedWriter(
					new OutputStreamWriter(
						client.getOutputStream()
					)
				), true // true : autoFlush,자동배출 기능
			);
			
			br = new BufferedReader(
					new InputStreamReader(client.getInputStream())
					);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 사용자 아이디 입력 작업 수행
		Runnable run = new Runnable() {

			@Override
			public void run() {
				while(true) {
					System.out.println("ID 입력대기");
					
					try {
						// 사용자가 id 입력하여 출력 전까지 blocking
						userID = br.readLine();
					} catch (IOException e) {
						System.out.println("연결 종료 : " +e.getMessage());
						break;
					}
					System.out.println(userID);
					
					if(userID.trim().equals("") || ChatServer.ht.containsKey(userID)) {
						// 아이디를 입력한 Client에게 사용 불가능한 아이디라고 출력
						pw.println("사용할 수 없는 아이디입니다. 다시 요청해주세요.");
						// 다시 아이디를 입력받을 수 있도록 while 문으로 회귀
						continue;	
					}
					
					// 회원 관리용 hashtable에 client 정보 추가
					ChatServer.ht.put(userID, pw);
					ChatServer.serverPool.submit(ServerTask.this);
					broadCast(userID + "님이 입장하셨습니다. 방인원은 " +ChatServer.ht.size());
					// 사용자 아이디 입력 스레드 종료
					break;
				} // end while
			} // end run
			
		}; // end runnable
		ChatServer.serverPool.submit(run);
		
	}
	
	// client에서 출력되는 내용을 입력받는 receive 기능 수행 
	@Override
	public void run() {
		
		/*
		 * 	/w 아이디 메세지	=> 귓속말
		 *	/quit			=> 종료
		 *	나머지는 전체 메세지
		 */
		while(true) {
			
			try {
				// serverTask에 등록된 클라이언트가 전달하는 메세지를 입력받음
				String receiveData = br.readLine();
				if(receiveData.trim().equals("/quit")) {
					// client와 수신종료
					break;
				}else if(receiveData.trim().startsWith("/w")) {
					// 귓속말
					sendMessage(receiveData);
				}else {
					broadCast(userID+":"+receiveData);
				}
				
			} catch (IOException e) {
				System.out.println("client 통신오류");
				break;
			}
			
		} // end while => thread 기능 종료
		
		// 종료된 사용자 정보를 삭제 
		ChatServer.ht.remove(userID);	
		broadCast(userID+"님이 나가셨습니다. 방인원 : "+ChatServer.ht.size());
	} // end run

	// message를 전달 받아 등록된 모든 client에게 메세지 전달
	public void broadCast(String message) {
		// hashtable에 저장된 value들의 묶음을 순회하면서 등록된 모든 client에게 메세지 출력
		for(PrintWriter p : ChatServer.ht.values()) {
			// 메세지를 입력한 사용자는 제외하고 출력 
			if(this.pw != p)p.println(message);
		}
		
		
	}
	
	// 특정 사용자에게만 메세지 전달(귓속말)
	//		/w 아이디 메세지 - 등록된 사용자 중에 key값이 아이디와 일치하는 사용자에게만 출력
	public void sendMessage(String message) {
		int begin = message.indexOf(" ") + 1;
		int end = message.indexOf(" ", begin);
		
		// 두번째 공백까지 존재하면 
		if(end != -1) {
			String id = message.substring(begin,end);
			String msg = message.substring(end+1);
			
			PrintWriter pw = ChatServer.ht.get(id);
			
			if(pw != null) {
				// 아이디가 일치하는 사용자 존재
				pw.println(userID+"님의 귓속말 : " +  msg);
			}else {
				// 일치하는 사용자가 존재하지 않음
				this.pw.println(id+"님이 존재하지 않습니다.");
			} // end else
		} // end if(end != -1)
	} // end sendMessage
		
	
	
	
	
	
}
