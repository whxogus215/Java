package ch02;

public class VIPCustomer extends Customer {
	
//	private int customerID; // ���� ������ private���� �����Ǿ�� �ϹǷ�
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;  // ��ӹ��� ���� Ŭ������ ��� ������ ����
	
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
