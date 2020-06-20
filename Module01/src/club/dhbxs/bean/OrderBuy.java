package club.dhbxs.bean;

import java.sql.Timestamp;

/**
 * @ClassName OrderBuy
 * @Description
 * @Author 17235
 * @Date 2020/6/17 上午 11:38
 * @Version 1.0
 **/
public class OrderBuy {
    private Integer orderId;
    private String orderNumber;
    private Integer userId;
    private String orderState;
    private Timestamp orderTime;
    private Timestamp orderGettime;
    private String orderAddress;

    public OrderBuy() {
    }

    public OrderBuy(Integer orderId, String orderNumber, Integer userId, String orderState, Timestamp orderTime, Timestamp orderGettime, String orderAddress) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.userId = userId;
        this.orderState = orderState;
        this.orderTime = orderTime;
        this.orderGettime = orderGettime;
        this.orderAddress = orderAddress;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public Timestamp getOrderGettime() {
        return orderGettime;
    }

    public void setOrderGettime(Timestamp orderGettime) {
        this.orderGettime = orderGettime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override
    public String toString() {
        return "OrderBuy{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", userId=" + userId +
                ", orderState='" + orderState + '\'' +
                ", orderTime=" + orderTime +
                ", orderGettime=" + orderGettime +
                ", orderAddress='" + orderAddress + '\'' +
                '}';
    }
}
