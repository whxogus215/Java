package ch15;

import java.util.ArrayList;

public class Shelf {

		protected ArrayList<String> shelf;
		
		public Shelf() {
			shelf = new ArrayList<String>(); // �����ڰ� ������ �� ������ �ʱ�ȭ��
			
		}
		
		public ArrayList<String> getShlef(){
			return shelf;
		}
		
		public int getCount() {
			return shelf.size();
		}
}
