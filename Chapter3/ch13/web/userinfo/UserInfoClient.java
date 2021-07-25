package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("db.properties"); // db파일을 여는 객체
		
		Properties prop = new Properties();
		// properties 파일을 쌍으로(a=b일때, a:b) 읽어내는 객체
		prop.load(fis);
		// db파일을 연 객체 내용을 읽어냄 
		
		String dbType = prop.getProperty("DBTYPE"); // db.properties의 DBTYPE Value를 반환 (MYSQL)
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
	    userInfo.setPassword("1234");
	    userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;
		
		// 인터페이스 타입으로 선언하고, db 파일의 값에 따라 Dao를 생성하는 코드이다.
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
