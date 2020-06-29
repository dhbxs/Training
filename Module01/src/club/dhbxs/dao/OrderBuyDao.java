package club.dhbxs.dao;

import club.dhbxs.bean.OrderBuy;

/**
 * @author 17235
 */
public interface OrderBuyDao {

    /**
     * 向数据库中order_buy表添加信息
     *
     * @param buy
     * @return
     */
    int addOrderBuy(OrderBuy buy);

    OrderBuy queryOrderBuyByOrderTime(String orderNumber);
}
