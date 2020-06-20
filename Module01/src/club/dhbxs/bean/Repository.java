package club.dhbxs.bean;

import java.math.BigDecimal;

/**
 * @ClassName Repository
 * @Description
 * @Author 17235
 * @Date 2020/6/17 上午 11:31
 * @Version 1.0
 **/
public class Repository {
    private Integer reId;
    private String reName;
    private Integer reNum;
    private BigDecimal rePrice;
    private Integer reBuyNum;
    private String reDescrip;
    private String imgUrl = "https://i.loli.net/2020/06/17/z9BTaSbgZnroMIw.jpg";

    public Repository() {
    }

    public Repository(Integer reId, String reName, Integer reNum, BigDecimal rePrice, Integer reBuyNum, String reDescrip, String imgUrl) {
        this.reId = reId;
        this.reName = reName;
        this.reNum = reNum;
        this.rePrice = rePrice;
        this.reBuyNum = reBuyNum;
        this.reDescrip = reDescrip;
        this.imgUrl = imgUrl;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }

    public Integer getReNum() {
        return reNum;
    }

    public void setReNum(Integer reNum) {
        this.reNum = reNum;
    }

    public BigDecimal getRePrice() {
        return rePrice;
    }

    public void setRePrice(BigDecimal rePrice) {
        this.rePrice = rePrice;
    }

    public Integer getReBuyNum() {
        return reBuyNum;
    }

    public void setReBuyNum(Integer reBuyNum) {
        this.reBuyNum = reBuyNum;
    }

    public String getReDescrip() {
        return reDescrip;
    }

    public void setReDescrip(String reDescrip) {
        this.reDescrip = reDescrip;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "reId=" + reId +
                ", reName='" + reName + '\'' +
                ", reNum=" + reNum +
                ", rePrice=" + rePrice +
                ", reBuyNum=" + reBuyNum +
                ", reDescrip='" + reDescrip + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}

