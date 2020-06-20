package club.dhbxs.dao;

import club.dhbxs.bean.OrderBuy;
import club.dhbxs.bean.OrderDetail;

public interface OrderDetailDao {

    /**
     * 向数据库中得order_detail表添加信息
     *
     * @param orderDetail
     * @return
     */
    public int addOrderDetail(OrderDetail orderDetail);
}
