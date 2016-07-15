package test.entity;

import java.util.Date;

public class LanshaPatch {
    /**主键*/
    private Integer id;
    /**0伴侣 1TV*/
    private Byte appType;
    /**安卓1 ios 2*/
    private Byte ostype;
    /**APP版本号*/
    private String version;
    /**热补丁版本号*/
    private Integer patchversion;
    /**热补丁地址*/
    private String address;
    /**热补丁文件大小*/
    private Integer size;
    /**热补丁说明*/
    private String remark;
    /**上传人*/
    private String creater;
    /**上传日期*/
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getAppType() {
        return appType;
    }

    public void setAppType(Byte appType) {
        this.appType = appType;
    }

    public Byte getOstype() {
        return ostype;
    }

    public void setOstype(Byte ostype) {
        this.ostype = ostype;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getPatchversion() {
        return patchversion;
    }

    public void setPatchversion(Integer patchversion) {
        this.patchversion = patchversion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}