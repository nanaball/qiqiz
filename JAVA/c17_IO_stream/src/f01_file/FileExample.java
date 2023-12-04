package f01_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) {
		
		// 뒤에 확장자 없으면 폴더 의미
		String dir = "C:/Temp/dir/aaa";
		
		// 위도우는 \ 인데 \는 문자가 아닌 이스케이프로 받아 들여서 \\ 써서 문자로 사용가능하게 함 
		dir = "C:\\Temp\\dir\\aaa";
		
		// 프로그램 디렉토리 구분자 - 상수가 아니라 소문자임 
		String separator = File.separator;
		System.out.println(separator);
		
		dir = "C:"+File.separator+"dir"+File.separator+"aaa";
		System.out.println(dir);
		
		char separatorChar = File.separatorChar;
		System.out.println(separatorChar);
		
		dir = "";
		
		System.out.println("dir : " +dir);
		
		File file = new File(dir);
		// 절대 경로
		System.out.println(file.getAbsolutePath());
		// 저장된 경로
		System.out.println(file.getPath()); // 출력이 안된게 아니라 빈칸이 출력
		
		// 매개변수가 두개이면 앞에꺼는 상위 디렉, 뒤에껀 하위 파일 or 폴더
		file = new File(dir, "Temp"); // C:\Temp
		
		// 절대 경로
		System.out.println(file.getAbsolutePath());
		// 저장된 경로
		System.out.println(file.getPath());
		
		// file.exists()
		// 해당 위치에 파일아나 폴더가 존재하면 true 존재하지 않으면 false
		if(!file.exists()) {
			// 디렉토리 또는 파일이 존재하지 않음
			// 지정된 경로에 있는 디렉토리 중 마지막에 정의된 디렉토리 생성
			// 중간에 지정된 폴더가 없으면 생성 불가 
			boolean isMake = file.mkdir();
			System.out.println("디렉토리 생성 여부 : " + isMake);
		}
		
		file = new File(file, "dir"+File.separator+"aaa");
		System.out.println("absolute : " + file.getAbsolutePath());
		
		if(!file.exists()) {
			System.out.println("디렉토리가 존재하지 않음");
			// 생성되지 않은 디렉토리가 1개면 mkdir - 여러개면 생성x, 여러개면 mkdirs
			boolean isMake = file.mkdir();
			System.out.println("디렉토리 생성 여부 : " + isMake);
			boolean isMakes = file.mkdirs();
			System.out.println("디렉토리 생성 여부 : " + isMakes);
		}
		
		String fileName = "test.txt";
		
		file = new File(file, fileName);
		System.out.println("absolute : " + file.getAbsolutePath());

		if(file.exists() == false) {
			// 확장자가 있어도 해당 확장자 파일이 아닌 모든걸 디렉토리로 생성
			// = 확장자명 상관없이 경로 상에 정의된 모든걸 디렉토리로 생성
			// file.mkdirs();
			System.out.println("파일이 존재하지 않음");
			
			try {
				file.createNewFile();	// 새 파일 생성
				System.out.println("새 파일 생성 완료");
			} catch (IOException e) {
				System.out.println("파일 생성 실패 : " + e.getMessage());
				e.printStackTrace();
			}	
			
		}
		
		File file1 = new File("C:\\Temp\\file1.txt");
		if(!file1.exists()) {
			
			try {
				// try catch 블록 지정 : alt + s+ w
				boolean isMake = file1.createNewFile();
				System.out.println("파일 생성 여부 : " + isMake);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		String path = file1.getAbsolutePath();
		System.out.println("absolute : "+path);
		
		File temp = new File("C:\\temp");
		File[] temps = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		for(File f : temps) {
			// 폴더나 파일의 마지막 수정 시간을 millis seconds 로 반환
			long modified = f.lastModified();
			Date date = new Date(modified);
			
			String lastModified = sdf.format(date);
			System.out.print(lastModified);
			
			if(f.isDirectory()) {	// 디렉토리 인가
				System.out.println("\t<dir>\t\t\t"+f.getName());
			}else {
				System.out.println("\t<FILE>\t\t\t"+f.getName());
				
			}
		} // end for
		
		File file2 = new File("C:\\Temp\\dir\\aaa\\test.txt");
		
		boolean isDeleted = false;
		isDeleted = file2.delete();
		System.out.println("파일 삭제 여부 : "+ isDeleted);
		
		file2 = new File("C:\\Temp\\dir\\aaa");
		isDeleted = file2.delete();
		System.out.println("디렉토리 삭제 여부 : " +isDeleted);
		
	} // end main

}
