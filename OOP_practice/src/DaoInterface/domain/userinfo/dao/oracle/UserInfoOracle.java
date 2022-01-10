package DaoInterface.domain.userinfo.dao.oracle;

import DaoInterface.domain.userinfo.UserInfo;
import DaoInterface.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracle implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
        
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID = " + userInfo.getUserId());
        
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = " + userInfo.getUserId());
        
    }
}
