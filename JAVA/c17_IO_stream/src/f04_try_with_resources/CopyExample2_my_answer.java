package f04_try_with_resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyExample2_my_answer {

	/**
	 * C:\Temp\cat1.jpg 이미지를 c:\Temp\images\copy.jpg 파일로 복사 하여 새로운 파일로 생성
	 */
	public static void main(String[] args) throws IOException {

		String images = "C:/Temp/images";

		images = "C:\\Temp\\images";

		File file = new File(images);

		file = new File(images);
		
		if(!file.exists()) {
			boolean isMake = file.mkdir();
			System.out.println("디렉토리 생성 여부 : " + isMake);
		}
		
		
		File cat = new File("C:\\temp\\cat1.jpg");
		File newcat = new File("c:\\Temp\\images\\copy.jpg");
			
	    Files.copy(cat.toPath(), newcat.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        
	
	} // end main

}
