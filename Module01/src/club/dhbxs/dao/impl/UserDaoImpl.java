package club.dhbxs.dao.impl;

import club.dhbxs.bean.User;
import club.dhbxs.dao.UserDao;
import club.dhbxs.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName UserDaoImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/17 下午 11:14
 * @Version 1.0
 **/
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO user(user_id,user_name,user_password,user_position,user_email,user_level) VALUES (?,?,?,?,?,?);";
        return update(sql, user.getUserId(), user.getUserName(), user.getUserPassword(), user.getUserPosition(), user.getUserEmail(), user.getUserLevel());
    }

    @Override
    public User queryUserByName(String name) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        User user = null;

        try {
            con = JdbcUtils.getConnection();
            String sql = "select * from user where user_name=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            rs = pstm.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setUserPassword(rs.getString("user_password"));
                user.setUserPosition(rs.getString("user_position"));
                user.setUserEmail(rs.getString("user_email"));
                user.setUserLevel(rs.getString("user_level"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closePreparedStatement(pstm);
            JdbcUtils.closeConnection(con);
        }
        return user;
    }
}
