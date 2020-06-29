package club.dhbxs.dao;

import club.dhbxs.bean.OrderBuy;

public interface OrderBuyDao {

    /**
     * 向数据库中order_buy表添加信息
     *
     * @param buy
     * @return
     */
    public int addOrderBuy(OrderBuy buy);

    public OrderBuy queryOrderBuyByOrderTime(String orderNumber);
}
