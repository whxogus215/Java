package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // �� ĳ���� ( ���� ������ �� �� Customer �ν��Ͻ��� �����ϰ� �Ŀ� �������̽� Ÿ������ ����� �� ��ȯ�ϴ� ��� )
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
