package ch18;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	} // 외부에서 new Company 할 수 없도록 private 생성자를 만듦.
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		} // static으로 선언해야 인스턴스의 생성 유무에 제약을 안 받음.
		  // 외부에서 사용할 수 있어야 하는 메서드 이므로 public으로 선언.
		return instance;
	}
	
}
