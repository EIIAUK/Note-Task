package com.note_task.model;

import java.util.Date;

public class HotelOut {
    private Integer id;

    private String customerName;

    private Date retreatTime;

    private String retreatReason;

    private String status;

    private Date askTime;

    private String auditopinion;

    private String auditperson;

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

    public Date getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(Date retreatTime) {
        this.retreatTime = retreatTime;
    }

    public String getRetreatReason() {
        return retreatReason;
    }

    public void setRetreatReason(String retreatReason) {
        this.retreatReason = retreatReason == null ? null : retreatReason.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAskTime() {
        return askTime;
    }

    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }

    public String getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(String auditopinion) {
        this.auditopinion = auditopinion == null ? null : auditopinion.trim();
    }

    public String getAuditperson() {
        return auditperson;
    }

    public void setAuditperson(String auditperson) {
        this.auditperson = auditperson == null ? null : auditperson.trim();
    }

    @Override
    public String toString() {
        return "HotelOut{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", retreatTime=" + retreatTime +
                ", retreatReason='" + retreatReason + '\'' +
                ", status='" + status + '\'' +
                ", askTime=" + askTime +
                ", auditopinion='" + auditopinion + '\'' +
                ", auditperson='" + auditperson + '\'' +
                '}';
    }
}