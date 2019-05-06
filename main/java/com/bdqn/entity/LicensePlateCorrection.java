package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class LicensePlateCorrection implements Serializable {

    private Integer id;//主键Id
    private String businessNum;//业务编号
    private Integer companyId;//业务归属公司id：对应系统配置表systemconfig中configCode =‘COMPANY’的configValueId
    private String companyName;//业务公司名字，来自（“ps_systemconfig”中的configCode =’COMPANY‘的configValueName）
    private String customerName;//客户姓名
    private String phone;//电话号码
    private String carPlateNum;//车牌号
    private String deliveryNum;//交强保单号
    private String commerciaNum;//商业险保单号
    private Integer correctId;//批改状态id：对应系统配置表systemconfig中configCode =‘CORRECT’的configValueId
    private String correctName;//批改状态name：对应系统配置表systemconfig中configCode =‘CORRECT’的configValueName
    private String correctUserName;//批改人
    private Date correctTime;//批改时间
    private Integer insurerTypeId;//被保险人类型id：对应系统配置表systemconfig中configCode =‘INSURER-TYPE’的configValueId
    private String insurerTypeName;//被保险人类型id：对应系统配置表systemconfig中configCode =‘INSURER-TYPE’的configValueId
    private Integer submitId;//提交状态id：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueId
    private String submitName;//提交状态name：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueName
    private String submitUserName;//提交人
    private Date submitTime;//提交时间
    private Date creationTime;//录入时间（当前时间）
    private String createdBy;//录入人：user表中的userName
    private Integer createdId;//录入人id：user表中主键id
    private Integer status;//是否注销：1是，0否
    private String lastUpdateBy;//最后修改人
    private Date lastUpdateTime;//最后修改时间

    private String boHui;
    private Integer jieGuoId;
    private String jieGuoName;

    public Integer getJieGuoId() {
        return jieGuoId;
    }

    public void setJieGuoId(Integer jieGuoId) {
        this.jieGuoId = jieGuoId;
    }

    public String getJieGuoName() {
        return jieGuoName;
    }

    public void setJieGuoName(String jieGuoName) {
        this.jieGuoName = jieGuoName;
    }

    public String getBoHui() {
        return boHui;
    }

    public void setBoHui(String boHui) {
        this.boHui = boHui;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public String getCarPlateNum() {
        return carPlateNum;
    }

    public void setCarPlateNum(String carPlateNum) {
        this.carPlateNum = carPlateNum;
    }

    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public String getCommerciaNum() {
        return commerciaNum;
    }

    public void setCommerciaNum(String commerciaNum) {
        this.commerciaNum = commerciaNum;
    }

    public Integer getCorrectId() {
        return correctId;
    }

    public void setCorrectId(Integer correctId) {
        this.correctId = correctId;
    }

    public String getCorrectName() {
        return correctName;
    }

    public void setCorrectName(String correctName) {
        this.correctName = correctName;
    }

    public String getCorrectUserName() {
        return correctUserName;
    }

    public void setCorrectUserName(String correctUserName) {
        this.correctUserName = correctUserName;
    }

    public Date getCorrectTime() {
        return correctTime;
    }

    public void setCorrectTime(Date correctTime) {
        this.correctTime = correctTime;
    }

    public Integer getInsurerTypeId() {
        return insurerTypeId;
    }

    public void setInsurerTypeId(Integer insurerTypeId) {
        this.insurerTypeId = insurerTypeId;
    }

    public String getInsurerTypeName() {
        return insurerTypeName;
    }

    public void setInsurerTypeName(String insurerTypeName) {
        this.insurerTypeName = insurerTypeName;
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public String getSubmitName() {
        return submitName;
    }

    public void setSubmitName(String submitName) {
        this.submitName = submitName;
    }

    public String getSubmitUserName() {
        return submitUserName;
    }

    public void setSubmitUserName(String submitUserName) {
        this.submitUserName = submitUserName;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
