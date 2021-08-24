package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer());  // int(4byte) : 4
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer());  // int(4byte) + double(8byte) = 12
		rf.writeUTF("안녕하세요");
		System.out.println("pos: " + rf.getFilePointer());  // int(4byte) + double(8byte) + 한글(글자당 3byte + null 2byte) = 29
		
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
