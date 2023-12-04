package f02_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {

	public static void main(String[] args) {

		String path = "C:\\Temp\\file2.txt";
		
		try {
			// OutputStream os = new FileOutputStream(path);
			// 두번째 boolean은 append로 기본값은 false임, 그래서 기존 파일의 내용을 삭제하고 씀. 
			// true면 기존 파일 내용에 이어서 값이 들어가있음
			OutputStream os = new FileOutputStream(path,true);
			String s = "한글";
			byte[] strs = s.getBytes();
			System.out.println(Arrays.toString(strs));
			
			/*
			for(int i = 0; i < strs.length; i++) {
				// 1byte 씩 출력
				os.write(strs[i]);
			}
			*/
			// 매개 변수로 넘겨받은 모든 byte 배열을 출력
			// os.write(strs);
			// [-19, -107, -100, -22, -72, -128] -> 한글
			os.write(strs ,3 ,3);
			// [-22, -72, -128] 만 출력 -> 글
			
			os.flush(); // 남아있는 파일 데이터 모두 출력
			os.close(); // 사용 끝났음!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // end main

}
