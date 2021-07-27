package ch08_1;

public class PersonInfoTest {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo();
		
		person.height = 180;
		person.weight = 78;
		person.gender = "남성";
		person.name = "Tomas";
		person.age = 37;
		
		person.personShowInfo(); // 반환되는 값이 없기 때문에 System.out 없이 바로 사용 가능!
		
		
	}

}
