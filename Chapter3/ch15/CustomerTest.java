package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // 업 캐스팅 ( 먼저 구현이 다 된 Customer 인스턴스로 선언하고 후에 인터페이스 타입으로 명시적 형 변환하는 방법 )
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
