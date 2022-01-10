package DaoInterface.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import DaoInterface.domain.userinfo.UserInfo;
import DaoInterface.domain.userinfo.dao.UserInfoDao;
import DaoInterface.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import DaoInterface.domain.userinfo.dao.oracle.UserInfoOracle;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");
        
        // Properties는 쌍으로 이루어져있는 데이터를 읽을 수 있는 객체
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("password");
        userInfo.setUsername("유저이름");
        UserInfoDao userInfoDao = null;

        if(dbType.equals("Oracle"))
            userInfoDao = new UserInfoOracle();

        else if (dbType.equals("MYSQL")) 
            userInfoDao = new UserInfoMySqlDao();

        else {
            System.out.println("db not found");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
