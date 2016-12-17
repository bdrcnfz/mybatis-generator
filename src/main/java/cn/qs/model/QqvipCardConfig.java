package cn.qs.model;

import java.util.Date;

public class QqvipCardConfig {
    private Integer id;

    private String giftsetId;

    private Integer giftAmount;

    private String newuserGift;

    private String olduserGift;

    private String newuserCard;

    private String olduserCard;

    private Boolean isavailable;

    private Date createTime;

    private Date timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiftsetId() {
        return giftsetId;
    }

    public void setGiftsetId(String giftsetId) {
        this.giftsetId = giftsetId == null ? null : giftsetId.trim();
    }

    public Integer getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Integer giftAmount) {
        this.giftAmount = giftAmount;
    }

    public String getNewuserGift() {
        return newuserGift;
    }

    public void setNewuserGift(String newuserGift) {
        this.newuserGift = newuserGift == null ? null : newuserGift.trim();
    }

    public String getOlduserGift() {
        return olduserGift;
    }

    public void setOlduserGift(String olduserGift) {
        this.olduserGift = olduserGift == null ? null : olduserGift.trim();
    }

    public String getNewuserCard() {
        return newuserCard;
    }

    public void setNewuserCard(String newuserCard) {
        this.newuserCard = newuserCard == null ? null : newuserCard.trim();
    }

    public String getOlduserCard() {
        return olduserCard;
    }

    public void setOlduserCard(String olduserCard) {
        this.olduserCard = olduserCard == null ? null : olduserCard.trim();
    }

    public Boolean getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(Boolean isavailable) {
        this.isavailable = isavailable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}