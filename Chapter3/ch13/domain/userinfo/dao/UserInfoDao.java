package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo; // 같은 패키지가 아니므로 import 해줘야 함.

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
