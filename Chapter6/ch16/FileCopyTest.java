package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long millisecond = 0;
		
		try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("����Ž��.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.zip"))){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			// ����Ʈ ������ �� �д� �ڵ�
			while( (i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			
			millisecond = System.currentTimeMillis() - millisecond;
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(millisecond + " �ҿ�Ǿ����ϴ�.");
	}

}
