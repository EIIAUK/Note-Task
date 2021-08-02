package com.note_task.model;

import java.util.Date;

public class BedManage {
    private Integer id;

    private Date createDate;

    private String roomNumber;

    private String bedStatus;

    private String name;

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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(String bedStatus) {
        this.bedStatus = bedStatus == null ? null : bedStatus.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "BedManage{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedStatus='" + bedStatus + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}