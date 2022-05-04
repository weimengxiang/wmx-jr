package com.wmx.jr.bean;

import java.util.Date;

public class UserInfoVo {
    private Long id;

    private String userName;

    private String userPassword;

    private String departmentId;

    private Integer times;

    private Date createDate;

    private String createProper;

    private Date updateDate;

    private String updateProper;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateProper() {
        return createProper;
    }

    public void setCreateProper(String createProper) {
        this.createProper = createProper == null ? null : createProper.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateProper() {
        return updateProper;
    }

    public void setUpdateProper(String updateProper) {
        this.updateProper = updateProper == null ? null : updateProper.trim();
    }
}