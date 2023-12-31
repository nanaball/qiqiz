package n2_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 프로그램 
public class ClientExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("[Server에 연결 요청]");
			Socket socket = new Socket("10.100.205.92", 5001);
			// client output => server
			// client input <= server
			System.out.println("[Server와 연결 성공]");
			
			// server 에서 발신된 message 수신
			InputStream is = socket.getInputStream();
			
			byte[] bytes = new byte[100];
			String message = "";
			
			// 서버에서 출력된 데이터를 입력받기위해 데이터가 수신될 때까지 blocking
			System.out.println("Blocking");
			int readBytes = is.read(bytes);
			message = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println("[데이터받기 완료 : ] " + message);
			
			// client에서 message 발신 
			OutputStream os = socket.getOutputStream();
			message = "배고프네요ㅠ";
			bytes = message.getBytes("UTF-8");

			os.write(bytes);
			os.flush();
			System.out.println("[데이터 발신 완료]");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
	} // end main

}
