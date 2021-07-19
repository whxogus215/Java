package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
		
		/*customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);*/
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		/*customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);*/
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		// VIP 클래스가 일반 클래스의 상속을 받았기 때문에 Customer 클래스의 메서드를 사용할 수 있음
		
		Customer vc = new VIPCustomer(12345, "noname");
		// VIPCustomer로 생성했지만 Customer 데이터 타입으로 형변환 할 수 있음.
		// vc는 VIPCustomer 인스턴스로 생성되었지만 Customer 타입이므로 Customer 메서드만 사용 가능!
		
		
	}

}
