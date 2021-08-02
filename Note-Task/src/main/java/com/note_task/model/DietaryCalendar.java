package com.note_task.model;

import java.util.Date;

public class DietaryCalendar {
    private Integer id;

    private Date createDate;

    private String foodName;

    private String foodType;

    private String foodTag;

    private String foodPrice;

    private String foodPicture;

    private String mamalFlag;

    private String supplyDate;

    private String supplyType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public String getFoodTag() {
        return foodTag;
    }

    public void setFoodTag(String foodTag) {
        this.foodTag = foodTag == null ? null : foodTag.trim();
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice == null ? null : foodPrice.trim();
    }

    public String getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(String foodPicture) {
        this.foodPicture = foodPicture == null ? null : foodPicture.trim();
    }

    public String getMamalFlag() {
        return mamalFlag;
    }

    public void setMamalFlag(String mamalFlag) {
        this.mamalFlag = mamalFlag == null ? null : mamalFlag.trim();
    }

    public String getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(String supplyDate) {
        this.supplyDate = supplyDate == null ? null : supplyDate.trim();
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }

    @Override
    public String toString() {
        return "DietaryCalendar{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodTag='" + foodTag + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", foodPicture='" + foodPicture + '\'' +
                ", mamalFlag='" + mamalFlag + '\'' +
                ", supplyDate='" + supplyDate + '\'' +
                ", supplyType='" + supplyType + '\'' +
                '}';
    }
}