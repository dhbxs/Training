package club.dhbxs.test;

import club.dhbxs.bean.OrderDetail;
import club.dhbxs.dao.OrderDetailDao;
import club.dhbxs.dao.impl.OrderDetailDaoImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderDetailDaoImplTest {

    @Test
    public void addOrderDetail() {
        OrderDetailDao orderDetailDao = new OrderDetailDaoImpl();
        OrderDetail orderDetail = new OrderDetail(null, 1, 1, 1, new BigDecimal(10));
        orderDetailDao.addOrderDetail(orderDetail);
    }
}