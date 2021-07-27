package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.getSerialNum()); // static 변수의 값을 쓸 땐 인스턴스 참조 변수가 아닌 클래스 이름을 사용한다!
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		// serialNum은 Static 변수로 공유되는 값이기 때문에 serialNum으로 출력하면 모든 인스턴스가 같은 값을 가지게 된다.)
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId()); // 두 인스턴스가 하나의 메모리를 공유하고 있어서 둘 다 증가함!
		System.out.println(Employee.getSerialNum());
	}

}
