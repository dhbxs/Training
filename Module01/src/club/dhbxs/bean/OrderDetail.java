package club.dhbxs.bean;

import java.math.BigDecimal;

/**
 * @ClassName OrderDetail
 * @Description
 * @Author 17235
 * @Date 2020/6/17 上午 11:44
 * @Version 1.0
 **/
public class OrderDetail {
    private Integer detailId;
    private Integer reId;
    private Integer orderId;
    private Integer detailNum;
    private BigDecimal detailMoney;

    public OrderDetail() {
    }

    public OrderDetail(Integer detailId, Integer reId, Integer orderId, Integer detailNum, BigDecimal detailMoney) {
        this.detailId = detailId;
        this.reId = reId;
        this.orderId = orderId;
        this.detailNum = detailNum;
        this.detailMoney = detailMoney;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDetailNum() {
        return detailNum;
    }

    public void setDetailNum(Integer detailNum) {
        this.detailNum = detailNum;
    }

    public BigDecimal getDetailMoney() {
        return detailMoney;
    }

    public void setDetailMoney(BigDecimal detailMoney) {
        this.detailMoney = detailMoney;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "detailId=" + detailId +
                ", reId=" + reId +
                ", orderId=" + orderId +
                ", detailNum=" + detailNum +
                ", detailMoney=" + detailMoney +
                '}';
    }
}
