package ch08_2;

public class DelInfoTest {

	public static void main(String[] args) {
		
		DelInfo userKim = new DelInfo();
		
		userKim.orderNum = "202011020003";
		userKim.phoneNum = "01023450001";
		userKim.delAddress = "서울시 강남구 역삼동 111-333";
		userKim.orderDate = "20201102";
		userKim.orderTime = "130258";
		userKim.orderPrice = 35000;
		userKim.menuId = "0003";
		
		userKim.delInfoShow();
	}

}
