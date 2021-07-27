package ch15;

import java.util.ArrayList;

public class Shelf {

		protected ArrayList<String> shelf;
		
		public Shelf() {
			shelf = new ArrayList<String>(); // 생성자가 생성될 때 변수를 초기화함
			
		}
		
		public ArrayList<String> getShlef(){
			return shelf;
		}
		
		public int getCount() {
			return shelf.size();
		}
}
