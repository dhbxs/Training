package club.dhbxs.test;

import club.dhbxs.bean.OrderBuy;
import club.dhbxs.bean.OrderDetail;
import club.dhbxs.dao.OrderBuyDao;
import club.dhbxs.dao.OrderDetailDao;
import club.dhbxs.dao.impl.OrderBuyDaoImpl;
import club.dhbxs.dao.impl.OrderDetailDaoImpl;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.sql.Timestamp;

public class OrderBuyDaoTest {

    @Test
    public void addOrderBuy() {
        OrderBuyDao orderBuyDao = new OrderBuyDaoImpl();
        orderBuyDao.addOrderBuy(new OrderBuy(null, "41421", 1, "if", new Timestamp(19575636), new Timestamp(543252), "faff"));
    }
}