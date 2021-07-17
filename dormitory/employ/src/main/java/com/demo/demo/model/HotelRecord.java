package com.demo.demo.model;

import java.util.Date;

public class HotelRecord {
    private Integer id;

    private String customerName;

    private String outgoingReason;

    private Date outgoingTime;

    private Date expectedreturnTime;

    private Date actualreturnTime;

    private String escorted;

    private String relation;

    private String escortedtel;

    private String auditStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getOutgoingReason() {
        return outgoingReason;
    }

    public void setOutgoingReason(String outgoingReason) {
        this.outgoingReason = outgoingReason == null ? null : outgoingReason.trim();
    }

    public Date getOutgoingTime() {
        return outgoingTime;
    }

    public void setOutgoingTime(Date outgoingTime) {
        this.outgoingTime = outgoingTime;
    }

    public Date getExpectedreturnTime() {
        return expectedreturnTime;
    }

    public void setExpectedreturnTime(Date expectedreturnTime) {
        this.expectedreturnTime = expectedreturnTime;
    }

    public Date getActualreturnTime() {
        return actualreturnTime;
    }

    public void setActualreturnTime(Date actualreturnTime) {
        this.actualreturnTime = actualreturnTime;
    }

    public String getEscorted() {
        return escorted;
    }

    public void setEscorted(String escorted) {
        this.escorted = escorted == null ? null : escorted.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getEscortedtel() {
        return escortedtel;
    }

    public void setEscortedtel(String escortedtel) {
        this.escortedtel = escortedtel == null ? null : escortedtel.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    @Override
    public String toString() {
        return "HotelRecord{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", outgoingReason='" + outgoingReason + '\'' +
                ", outgoingTime=" + outgoingTime +
                ", expectedreturnTime=" + expectedreturnTime +
                ", actualreturnTime=" + actualreturnTime +
                ", escorted='" + escorted + '\'' +
                ", relation='" + relation + '\'' +
                ", escortedtel='" + escortedtel + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                '}';
    }
}