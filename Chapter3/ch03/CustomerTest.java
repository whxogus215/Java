package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"�̼���");
		
		/*customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);*/
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		
		/*customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);*/
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		// VIP Ŭ������ �Ϲ� Ŭ������ ����� �޾ұ� ������ Customer Ŭ������ �޼��带 ����� �� ����
		
		Customer vc = new VIPCustomer(12345, "noname");
		// VIPCustomer�� ���������� Customer ������ Ÿ������ ����ȯ �� �� ����.
		// vc�� VIPCustomer �ν��Ͻ��� �����Ǿ����� Customer Ÿ���̹Ƿ� Customer �޼��常 ��� ����!
		
		
	}

}
