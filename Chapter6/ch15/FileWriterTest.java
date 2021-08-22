package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A'); // 문자 하나 출력
			fw.write('\n');
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf); // 문자 배열 출력
			fw.write('\n');
			fw.write("안녕하세요. 잘 써지네요"); // String 출력
			fw.write('\n');
			fw.write(buf, 3, 3); // 문자 배열의 일부 출력
			fw.write('\n');
			fw.write("안녕하세요", 1, 3); // String의 일부 출력
			fw.write('\n');
			fw.write("65"); // 숫자를 그대로 출력(String)
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
