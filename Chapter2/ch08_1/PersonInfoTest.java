package ch08_1;

public class PersonInfoTest {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo();
		
		person.height = 180;
		person.weight = 78;
		person.gender = "����";
		person.name = "Tomas";
		person.age = 37;
		
		person.personShowInfo(); // ��ȯ�Ǵ� ���� ���� ������ System.out ���� �ٷ� ��� ����!
		
		
	}

}
