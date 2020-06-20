package club.dhbxs.service.impl;

import club.dhbxs.bean.OrderBuy;
import club.dhbxs.bean.OrderDetail;
import club.dhbxs.bean.Repository;
import club.dhbxs.bean.User;
import club.dhbxs.dao.OrderBuyDao;
import club.dhbxs.dao.OrderDetailDao;
import club.dhbxs.dao.impl.OrderBuyDaoImpl;
import club.dhbxs.dao.impl.OrderDetailDaoImpl;
import club.dhbxs.service.OrdeService;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrdeServiceImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/18 下午 10:19
 * @Version 1.0
 **/
public class OrdeServiceImpl implements OrdeService {
    @Override
    public void buy(List<Repository> repositories, String[] address, User user) {

        /**
         * 生成并添加orderBuy信息到数据库
         */
        OrderBuy orderBuy = new OrderBuy();
        orderBuy.setUserId(user.getUserId());
        orderBuy.setOrderTime(new Timestamp(System.currentTimeMillis()));
        orderBuy.setOrderAddress(address[0]);
        //获取当前的日期
        Date date = new Date();
        //设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取String类型的时间
        String createdate = sdf.format(date);
        String orderNumber = orderBuy.getUserId() + createdate;
        orderBuy.setOrderNumber(orderNumber);
        orderBuy.setOrderState("have paid");
        OrderBuyDao orderBuyDao = new OrderBuyDaoImpl();
        orderBuyDao.addOrderBuy(orderBuy);

        /**
         * 生成并添加orderDetail信息到数据库
         */
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(orderBuy.getOrderId());
        orderDetail.setDetailNum(1);
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        for (Repository repository : repositories) {
            orderDetail.setReId(repository.getReId());
            bigDecimal=bigDecimal.add(repository.getRePrice());
        }
        orderDetail.setDetailMoney(bigDecimal);
        OrderDetailDao orderDetailDao = new OrderDetailDaoImpl();
        orderDetailDao.addOrderDetail(orderDetail);
    }
}
