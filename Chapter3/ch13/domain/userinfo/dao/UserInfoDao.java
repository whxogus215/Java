package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo; // ���� ��Ű���� �ƴϹǷ� import ����� ��.

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
