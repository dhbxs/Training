package club.dhbxs.service.impl;

import club.dhbxs.bean.User;
import club.dhbxs.dao.UserDao;
import club.dhbxs.dao.impl.UserDaoImpl;
import club.dhbxs.service.UserSignUpService;

/**
 * @ClassName UserLoginService
 * @Description
 * @Author 17235
 * @Date 2020/6/17 下午 11:27
 * @Version 1.0
 **/
public class UserSignUpServiceImpl implements UserSignUpService {

    @Override
    public User verify(User u){
        User u1 = new User();
        UserDao user = new UserDaoImpl();
        u1 = user.queryUserByName(u.getUserName());
        if (u1 != null){
            if(u.getUserName().equals(u1.getUserName())){
                if (u.getUserPassword().equals(u1.getUserPassword())) {
                    return u1;
                }
            }
        }
        return null;
    }

    @Override
    public User verifyAdmin(User u) {
//        System.out.println(verify(u));
        if (verify(u) != null) {
            User u1 = new User();
            UserDao user = new UserDaoImpl();
            u1 = user.queryUserByName(u.getUserName());
            if (u1.getUserLevel() != null){
                if (u1.getUserLevel().equals("admin")) {
//                    System.out.println(u1);
                    return u1;
                }
            }
        }
        return null;
    }
}
