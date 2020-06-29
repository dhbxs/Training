package club.dhbxs.dao;

import club.dhbxs.bean.OrderDetail;

/**
 * @author 17235
 */
public interface OrderDetailDao {

    /**
     * 向数据库中得order_detail表添加信息
     *
     * @param orderDetail
     * @return
     */
    int addOrderDetail(OrderDetail orderDetail);
}
