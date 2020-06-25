package club.dhbxs.service.impl;

import club.dhbxs.bean.User;
import club.dhbxs.dao.UserDao;
import club.dhbxs.dao.impl.UserDaoImpl;
import club.dhbxs.service.UserSignUpService;

/**
 * @ClassName UserSignUpServiceImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/17 下午 11:27
 * @Version 1.0
 **/
public class UserSignUpServiceImpl implements UserSignUpService {
    @Override
    public Boolean add(User u){
        UserDao u1 = new UserDaoImpl();
        u1.addUser(u);
        return true;
    }
}
