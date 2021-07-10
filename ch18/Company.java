package ch18;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	} // �ܺο��� new Company �� �� ������ private �����ڸ� ����.
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		} // static���� �����ؾ� �ν��Ͻ��� ���� ������ ������ �� ����.
		  // �ܺο��� ����� �� �־�� �ϴ� �޼��� �̹Ƿ� public���� ����.
		return instance;
	}
	
}
