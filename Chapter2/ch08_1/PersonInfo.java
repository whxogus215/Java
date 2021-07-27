package ch08_1;

public class PersonInfo {
	
		public int height;
		public int weight;
		public String gender;
		public String name;
		public int age;
		
		public void personShowInfo() {
			System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다.");
			System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다.");
		} // 두 줄 이상으로 출력할 땐 void로 하여서 구현!
}
