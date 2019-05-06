package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class CheckCar implements Serializable {
    private Integer id;//主键id
    private String businessNum;//业务编码
    private Integer companyId;//业务归属公司id：对应系统配置表systemconfig中configCode =‘COMPANY’的configValueId
    private String companyName;//业务归属公司name：对应系统配置表systemconfig中configCode =‘COMPANY’的configValueName
    private String customerName;//客户姓名
    private String phone;//电话号码
    private String carType;//车型
    private String carPlateNum;//车牌号
    private String deliveryNum;//交强保单号
    private String monitoringStation;//监测站名称
    private String reservationTime;//预约时间
    private Integer submitId;//提交状态id：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueId
    private String submitName;//提交状态name：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueName
    private String submitUserName;//提交人name：对应用户表user中userName
    private Date submitTime;//提交时间
    private Integer disposeId;//处理状态id：对应系统配置表systemconfig中configCode =‘DISPOSE’的configValueId
    private String disposeName;//处理状态Name：对应系统配置表systemconfig中configCode =‘DISPOSE’的configValueName
    private String disposeUserName;//处理人name：对应用户表user中userName
    private String disposeTime;//处理时间
    private Date creationTime;//录入时间：当前时间
    private String createdBy;//录入人：user表中的userName
    private Integer createdId;//录入人Id：user表的主键id
    private Integer status;//0为启用1为不启用
    private String lastUpdateBy;//最后修改人
    private Date lastUpdateTime;//最后修改时间

    private Integer lingQuId;
    private String  lingQuName;
    private String lingQuTime;
    private String lingQuUserName;
    private Integer lingQuUserId;



    private String boHui;
    private Integer jieGuoId;
    private String jieGuoName;


    public Integer getLingQuId() {
        return lingQuId;
    }

    public void setLingQuId(Integer lingQuId) {
        this.lingQuId = lingQuId;
    }

    public String getLingQuName() {
        return lingQuName;
    }

    public void setLingQuName(String lingQuName) {
        this.lingQuName = lingQuName;
    }

    public String getLingQuTime() {
        return lingQuTime;
    }

    public void setLingQuTime(String lingQuTime) {
        this.lingQuTime = lingQuTime;
    }

    public String getLingQuUserName() {
        return lingQuUserName;
    }

    public void setLingQuUserName(String lingQuUserName) {
        this.lingQuUserName = lingQuUserName;
    }

    public Integer getLingQuUserId() {
        return lingQuUserId;
    }

    public void setLingQuUserId(Integer lingQuUserId) {
        this.lingQuUserId = lingQuUserId;
    }

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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
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

    public Integer getDisposeId() {
        return disposeId;
    }

    public void setDisposeId(Integer disposeId) {
        this.disposeId = disposeId;
    }

    public String getDisposeName() {
        return disposeName;
    }

    public void setDisposeName(String disposeName) {
        this.disposeName = disposeName;
    }

    public String getDisposeUserName() {
        return disposeUserName;
    }

    public void setDisposeUserName(String disposeUserName) {
        this.disposeUserName = disposeUserName;
    }

    public String getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(String disposeTime) {
        this.disposeTime = disposeTime;
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

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
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
