package ch08_2;

public class DelInfo {
	
	public String orderNum;  // ��ȭ��ȣ ���� �� 0���� ���۵ǹǷ� ���ڿ��� �����ϱ�!
	public String phoneNum;
	public String delAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String menuId;
	
	
	public void delInfoShow() {
		
		System.out.println("�ֹ� ���� ��ȣ : " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNum);
		System.out.println("�ֹ� �� �ּ� : " + delAddress);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�޴� ��ȣ : " + menuId);
	} // ���ķ� ������� ����� ���� ������ ���� void�� �޼ҵ带 ���� �ذ�!
}
