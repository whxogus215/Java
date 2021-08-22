package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// fos를 생성할 경우, FileNotFound 예외처리를 해야 하지만, 이를 Throw하고 fos를 사용하는 문장에서 try-catch를 사용하였다.
		// (IOException 사용 : IOException은 FileNotFoundException의 상위 클래스이다.) 
		FileOutputStream fos = new FileOutputStream("output2.txt");
		try(fos){
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i =0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}
	
}
	
