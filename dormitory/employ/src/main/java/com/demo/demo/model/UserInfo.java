package com.demo.demo.model;

public class UserInfo {
    private Integer id;

    private String staffname;

    private String staffsex;

    private String staffage;

    private String stafftype;

    private String phonenumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public String getStaffage() {
        return staffage;
    }

    public void setStaffage(String staffage) {
        this.staffage = staffage == null ? null : staffage.trim();
    }



    public String getStafftype() {
        return stafftype;
    }

    public void setStafftype(String stafftype) {
        this.stafftype = stafftype == null ? null : stafftype.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
}