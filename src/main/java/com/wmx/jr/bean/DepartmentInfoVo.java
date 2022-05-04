package com.wmx.jr.bean;

import java.util.Date;

public class DepartmentInfoVo {
    private Long id;

    private String departmentId;

    private String departmentName;

    private String superDepartmentId;

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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getSuperDepartmentId() {
        return superDepartmentId;
    }

    public void setSuperDepartmentId(String superDepartmentId) {
        this.superDepartmentId = superDepartmentId == null ? null : superDepartmentId.trim();
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