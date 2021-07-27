package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // Student 클래스를 기반으로 한 인스턴스(객체) 생성
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		
	}

}
