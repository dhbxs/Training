package club.dhbxs.test;

import club.dhbxs.bean.User;
import club.dhbxs.dao.UserDao;
import club.dhbxs.dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @ClassName UserDaoTest
 * @Description
 * @Author 17235
 * @Date 2020/6/18 上午 8:11
 * @Version 1.0
 **/
public class UserDaoTest {
    @Test
    public void testAdd() {
        User user = new User(null, "002", "123456", "上海", "123@qq.com", "admin");
        UserDao userDao = new UserDaoImpl();
        userDao.addUser(user);
    }

    @Test
    public void testRequryUser() {
        User user = null;
        UserDao userDao = new UserDaoImpl();
        System.out.println(user = userDao.queryUserByName("001"));
    }
}
