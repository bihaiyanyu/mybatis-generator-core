package test.entity;

import java.util.Date;

public class LanshaPatch {
    /**����*/
    private Integer id;
    /**0���� 1TV*/
    private Byte appType;
    /**��׿1 ios 2*/
    private Byte ostype;
    /**APP�汾��*/
    private String version;
    /**�Ȳ����汾��*/
    private Integer patchversion;
    /**�Ȳ�����ַ*/
    private String address;
    /**�Ȳ����ļ���С*/
    private Integer size;
    /**�Ȳ���˵��*/
    private String remark;
    /**�ϴ���*/
    private String creater;
    /**�ϴ�����*/
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