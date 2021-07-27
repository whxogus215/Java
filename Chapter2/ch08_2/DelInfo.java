package ch08_2;

public class DelInfo {
	
	public String orderNum;  // 전화번호 같은 건 0으로 시작되므로 문자열로 선언하기!
	public String phoneNum;
	public String delAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String menuId;
	
	
	public void delInfoShow() {
		
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + delAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuId);
	} // 병렬로 결과값을 출력할 때는 다음과 같이 void로 메소드를 만들어서 해결!
}
