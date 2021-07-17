package com.demo.demo.model;

import java.util.Date;

public class NurseRecord {
    private Integer id;

    private String customername;

    private String nursingname;

    private Date time;

    private String count;

    private String staffname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getNursingname() {
        return nursingname;
    }

    public void setNursingname(String nursingname) {
        this.nursingname = nursingname == null ? null : nursingname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }
}