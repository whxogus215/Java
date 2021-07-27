package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "¤±12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "kim");
		System.out.println(userKim.showUserInfo());
	}

}
