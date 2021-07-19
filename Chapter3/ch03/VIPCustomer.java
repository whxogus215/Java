package ch03;

public class VIPCustomer extends Customer {
	

//	private int customerID; // 고객의 정보는 private으로 관리되어야 하므로
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;  // 상속받은 상위 클래스의 멤버 변수와 같음
	
	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		//super(0, null) 등으로 호출 가능
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); // 상위 클래스인 Customer로 연결됨!
		
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		salesRatio = 0.1;    
		
		System.out.println("VIPCustomer(int, String) call");
	} // default 생성자를 사용하지 않을 때 사용할 수 있는 방법!
	
	
	public String getAgentID() {
		return agentID;
	}
	
	
}
