package club.dhbxs.dao.impl;

import club.dhbxs.bean.OrderBuy;
import club.dhbxs.dao.OrderBuyDao;

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
}
