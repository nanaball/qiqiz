package f03_input;

import java.io.*;
import java.util.Arrays;

public class ReadExample2 {

	public static void main(String[] args) throws IOException{

		InputStream is = new FileInputStream("C:\\Temp\\file2.txt");
		byte[] bytes = new byte[100];
		int readBytes = is.read(bytes);
		
		System.out.println(Arrays.toString(bytes));
		System.out.println(readBytes);
		String result = new String(bytes);
		System.out.println(result);
		
		is.close();
		
		// 한번 연결이 끊긴 스트림은 재사용 불가
		is = new FileInputStream("c:\\temp\\file2.txt");
		int available = is.available();
		System.out.println("읽어 들일 수 있는 파일의 크기 : " + available);
		bytes = new byte[available];
		
		readBytes = is.read(bytes, 0, bytes.length);
		System.out.println(Arrays.toString(bytes));
		System.out.println(readBytes);
		
		// available : 파일의 크기를 고정적으로 가지고 있는것이 아님 - 앞으로 읽을 파일의 크기가 얼마인지 알려줌
		available = is.available();
		System.out.println("읽어 들일 수 있는 파일의 크기 : " + available);
		
		is.close();
				
	}

}
