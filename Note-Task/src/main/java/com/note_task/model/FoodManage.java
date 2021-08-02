package com.note_task.model;

import java.util.Date;

public class FoodManage {
    private Integer id;

    private Date createDate;

    private String customName;

    private String foodName;

    private String foodDate;

    private String foodWeek;

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

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(String foodDate) {
        this.foodDate = foodDate == null ? null : foodDate.trim();
    }

    public String getFoodWeek() {
        return foodWeek;
    }

    public void setFoodWeek(String foodWeek) {
        this.foodWeek = foodWeek == null ? null : foodWeek.trim();
    }

    @Override
    public String toString() {
        return "FoodManage{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", customName='" + customName + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodDate='" + foodDate + '\'' +
                ", foodWeek='" + foodWeek + '\'' +
                '}';
    }
}