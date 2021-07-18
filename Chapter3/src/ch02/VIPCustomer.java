package ch02;

public class VIPCustomer extends Customer {
	
//	private int customerID; // 고객의 정보는 private으로 관리되어야 하므로
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;  // 상속받은 상위 클래스의 멤버 변수와 같음
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	public String getAgentID() {
		return agentID;
	}
	
	
}
