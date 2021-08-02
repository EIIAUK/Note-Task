package com.note_task.model;

import java.util.Date;

public class HotelIn {
    private Integer id;

    private Date createDate;

    private String customerName;

    private String customerAge;

    private String customerSex;

    private String idcard;

    private String roomid;

    private String buildingId;

    private String elderType;

    private Date checkinDate;

    private Date expirationDate;

    private String contacttel;

    private String bedId;

    private String psychosomaticstate;

    private String attention;

    private String status;

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge == null ? null : customerAge.trim();
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId == null ? null : buildingId.trim();
    }

    public String getElderType() {
        return elderType;
    }

    public void setElderType(String elderType) {
        this.elderType = elderType == null ? null : elderType.trim();
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId == null ? null : bedId.trim();
    }

    public String getPsychosomaticstate() {
        return psychosomaticstate;
    }

    public void setPsychosomaticstate(String psychosomaticstate) {
        this.psychosomaticstate = psychosomaticstate == null ? null : psychosomaticstate.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "HotelIn{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", customerName='" + customerName + '\'' +
                ", customerAge='" + customerAge + '\'' +
                ", customerSex='" + customerSex + '\'' +
                ", idcard='" + idcard + '\'' +
                ", roomid='" + roomid + '\'' +
                ", buildingId='" + buildingId + '\'' +
                ", elderType='" + elderType + '\'' +
                ", checkinDate=" + checkinDate +
                ", expirationDate=" + expirationDate +
                ", contacttel='" + contacttel + '\'' +
                ", bedId='" + bedId + '\'' +
                ", psychosomaticstate='" + psychosomaticstate + '\'' +
                ", attention='" + attention + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}