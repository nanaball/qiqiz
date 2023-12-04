package f03_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("C:\\temp\\file2.txt");
			int readBytes = 0;
			// 연결된 파일에서 읽어 들일 수 있는 데이터 크기(byte 크기)
			int size = is. available();
			
			byte[] bytes = new byte[100];
			
			String data = "";
			
			while(true) {
				readBytes = is.read(bytes);
				System.out.println("읽어들인 바이트 크기 : " + readBytes);
				if(readBytes == -1)break;
				data += new String(bytes, 0, readBytes);
			}
			System.out.println(data); 
			System.out.println(data.length());  // 5 : 문자가 몇개인지

			is.close();
			
			System.out.println(size);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
