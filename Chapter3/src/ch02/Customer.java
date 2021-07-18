package ch02;

public class Customer {
	
	protected int customerID; // 고객의 정보는 private으로 관리되어야 하므로
	protected String customerName;
	protected  String customerGrade;
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	int bonusPoint;
	double bonusRatio;
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;    // 각 인스턴스마다 공통적인 데이터
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
