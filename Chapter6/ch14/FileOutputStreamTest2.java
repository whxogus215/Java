package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// fos�� ������ ���, FileNotFound ����ó���� �ؾ� ������, �̸� Throw�ϰ� fos�� ����ϴ� ���忡�� try-catch�� ����Ͽ���.
		// (IOException ��� : IOException�� FileNotFoundException�� ���� Ŭ�����̴�.) 
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
	
