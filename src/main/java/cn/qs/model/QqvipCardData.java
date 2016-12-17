package cn.qs.model;

import java.util.Date;

public class QqvipCardData {
    private Integer id;

    private String giftsetId;

    private String name;

    private Integer bonusValue;

    private String useStartTime;

    private String useEndTime;

    private String description;

    private String useLimit;

    private String fissionId;

    private String exchangeUrl;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(Integer bonusValue) {
        this.bonusValue = bonusValue;
    }

    public String getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(String useStartTime) {
        this.useStartTime = useStartTime == null ? null : useStartTime.trim();
    }

    public String getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(String useEndTime) {
        this.useEndTime = useEndTime == null ? null : useEndTime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(String useLimit) {
        this.useLimit = useLimit == null ? null : useLimit.trim();
    }

    public String getFissionId() {
        return fissionId;
    }

    public void setFissionId(String fissionId) {
        this.fissionId = fissionId == null ? null : fissionId.trim();
    }

    public String getExchangeUrl() {
        return exchangeUrl;
    }

    public void setExchangeUrl(String exchangeUrl) {
        this.exchangeUrl = exchangeUrl == null ? null : exchangeUrl.trim();
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