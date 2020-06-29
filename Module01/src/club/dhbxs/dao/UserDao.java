package club.dhbxs.dao;

import club.dhbxs.bean.User;

/**
 * @author 17235
 */
public interface UserDao {
    /**
     * 向数据库中得user表添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 更具用户姓名查询用户，返回用户封装对象
     *
     * @param name
     * @return
     */
    User queryUserByName(String name);
}
