package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(Employee.getSerialNum()); // static ������ ���� �� �� �ν��Ͻ� ���� ������ �ƴ� Ŭ���� �̸��� ����Ѵ�!
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId());
		// serialNum�� Static ������ �����Ǵ� ���̱� ������ serialNum���� ����ϸ� ��� �ν��Ͻ��� ���� ���� ������ �ȴ�.)
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId()); // �� �ν��Ͻ��� �ϳ��� �޸𸮸� �����ϰ� �־ �� �� ������!
		System.out.println(Employee.getSerialNum());
	}

}
