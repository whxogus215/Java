package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A'); // ���� �ϳ� ���
			fw.write('\n');
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf); // ���� �迭 ���
			fw.write('\n');
			fw.write("�ȳ��ϼ���. �� �����׿�"); // String ���
			fw.write('\n');
			fw.write(buf, 3, 3); // ���� �迭�� �Ϻ� ���
			fw.write('\n');
			fw.write("�ȳ��ϼ���", 1, 3); // String�� �Ϻ� ���
			fw.write('\n');
			fw.write("65"); // ���ڸ� �״�� ���(String)
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
