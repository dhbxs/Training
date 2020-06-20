package club.dhbxs.service.impl;

import club.dhbxs.bean.User;
import club.dhbxs.dao.UserDao;
import club.dhbxs.dao.impl.UserDaoImpl;
import club.dhbxs.service.UserSignInService;

/**
 * @ClassName UserSignInService
 * @Description
 * @Author 17235
 * @Date 2020/6/18 上午 8:29
 * @Version 1.0
 **/
public class UserSignInServiceImpl implements UserSignInService {
    @Override
    public Boolean add(User u){
        UserDao u1 = new UserDaoImpl();
        u1.addUser(u);
        return true;
    }
}
