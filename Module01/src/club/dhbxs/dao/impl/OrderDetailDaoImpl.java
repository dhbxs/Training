package club.dhbxs.dao.impl;

import club.dhbxs.bean.OrderDetail;
import club.dhbxs.dao.OrderDetailDao;


/**
 * @ClassName OrderDetailDaoImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/18 下午 8:21
 * @Version 1.0
 **/
public class OrderDetailDaoImpl extends BaseDao implements OrderDetailDao {
    @Override
    public int addOrderDetail(OrderDetail orderDetail) {
        String sql = "INSERT INTO order_detail (detail_id,re_id,order_id,detail_num,detail_money) VALUES (?,?,?,?,?);";
        return update(sql, orderDetail.getDetailId(), orderDetail.getReId(), orderDetail.getOrderId(), orderDetail.getDetailNum(), orderDetail.getDetailMoney());
    }
}
