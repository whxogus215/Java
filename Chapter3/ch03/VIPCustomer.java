package ch03;

public class VIPCustomer extends Customer {
	

//	private int customerID; // ���� ������ private���� �����Ǿ�� �ϹǷ�
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;  // ��ӹ��� ���� Ŭ������ ��� ������ ����
	
	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		//super(0, null) ������ ȣ�� ����
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); // ���� Ŭ������ Customer�� �����!
		
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		salesRatio = 0.1;    
		
		System.out.println("VIPCustomer(int, String) call");
	} // default �����ڸ� ������� ���� �� ����� �� �ִ� ���!
	
	
	public String getAgentID() {
		return agentID;
	}
	
	
}
