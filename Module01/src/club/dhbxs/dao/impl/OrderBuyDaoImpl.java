package club.dhbxs.dao.impl;

import club.dhbxs.bean.OrderBuy;
import club.dhbxs.bean.Repository;
import club.dhbxs.dao.OrderBuyDao;
import club.dhbxs.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName OrderBuyDaoImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/18 下午 8:10
 * @Version 1.0
 **/
public class OrderBuyDaoImpl extends BaseDao implements OrderBuyDao {

    @Override
    public int addOrderBuy(OrderBuy buy) {
        String sql = "INSERT INTO orderbuy(order_id,order_number,user_id,order_state,order_time,order_gettime,order_address) VALUES (?,?,?,?,?,?,?);";
        return update(sql, buy.getOrderId(), buy.getOrderNumber(), buy.getUserId(), buy.getOrderState(), buy.getOrderTime(), buy.getOrderGettime(), buy.getOrderAddress());
    }

    @Override
    public OrderBuy queryOrderBuyByOrderTime(String orderNumber) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        OrderBuy orderBuy = null;

        try {
            con = JdbcUtils.getConnection();
            String sql = "select * from orderbuy where order_number=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, orderNumber);
            rs = pstm.executeQuery();
            while (rs.next()) {
                orderBuy = new OrderBuy();
                orderBuy.setOrderId(rs.getInt("order_id"));
                orderBuy.setOrderTime(rs.getTimestamp("order_time"));
                orderBuy.setOrderState(rs.getString("order_state"));
                orderBuy.setUserId(rs.getInt("user_id"));
                orderBuy.setOrderNumber(rs.getString("order_number"));
                orderBuy.setOrderGettime(rs.getTimestamp("order_gettime"));
                orderBuy.setOrderAddress(rs.getString("order_address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closePreparedStatement(pstm);
            JdbcUtils.closeConnection(con);
        }
        return orderBuy;
    }
}
