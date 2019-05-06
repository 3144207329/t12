package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class DesignatedDriver implements Serializable {
    private Integer id;//主键id
    private String businessNum;//业务编码
    private Integer companyId;//业务归属公司id：对应系统配置表systemconfig中configCode =‘COMPANY’的configValueId
    private String companyName;//业务归属公司name：对应系统配置表systemconfig中configCode =‘COMPANY’的configValueName
    private String customerName;//客户姓名
    private String phone;//电话号码
    private String location;//所在地
    private String destination;//目的地
    private String carPlateNum;//代驾车牌号
    private String appointmentBookingTime;//预约代驾时间
    private Integer consumptionTypeId;//消费类型id：对应系统配置表systemconfig中configCode =‘CONSUMPTION-TYPE’的configValueId
    private String consumptionTypeName;//消费类型name：对应系统配置systemconfig中configCode =‘CONSUMPTION-TYPE’的configValueName
    private Integer threeInOneId;//是否三合一录入id：对应系统配置表systemconfig中configCode =‘THREE-IN-ONE’的configValueId
    private String threeInOneName;//是否三合一录入name：对应系统配置表systemconfig中configCode =‘THREE-IN-ONE’的configValueName
    private Integer submitId;//提交状态id：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueId
    private String submitName;//提交状态name：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueName
    private String submitUserName;//提交人name：对应用户表user中userName
    private String submitTime;//提交时间
    private Integer disposeId;//处理状态id：对应系统配置表systemconfig中configCode =‘DISPOSE’的configValueId
    private String disposeName;//处理状态Name：对应系统配置表systemconfig中configCode =‘DISPOSE’的configValueName
    private String disposeUserName;//处理人name：对应用户表user中userName
    private String disposeTime;//处理时间
    private String creationTime;//录入时间：当前时间
    private String createdBy;//录入人：user表中的userName
    private Integer createdId;//录入人id:user表的主键id
    private Integer status;//0为启用1为不启用
    private String lastUpdateBy;//最后修改人
    private String lastUpdateTime;//最后修改时间
    private Integer lingQu;//领取状态：对应系统配置表systemconfig中configCode =‘LINGQU’的configValueName

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

    public String getAppointmentBookingTime() {
        return appointmentBookingTime;
    }

    public void setAppointmentBookingTime(String appointmentBookingTime) {
        this.appointmentBookingTime = appointmentBookingTime;
    }

    public Integer getLingQu() {
        return lingQu;
    }

    public void setLingQu(Integer lingQu) {
        this.lingQu = lingQu;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
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

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCarPlateNum() {
        return carPlateNum;
    }

    public void setCarPlateNum(String carPlateNum) {
        this.carPlateNum = carPlateNum;
    }

   /* public Date getAppointmentBookingTime() {
        return appointmentBookingTime;
    }

    public void setAppointmentBookingTime(Date appointmentBookingTime) {
        this.appointmentBookingTime = appointmentBookingTime;
    }*/

    public Integer getConsumptionTypeId() {
        return consumptionTypeId;
    }

    public void setConsumptionTypeId(Integer consumptionTypeId) {
        this.consumptionTypeId = consumptionTypeId;
    }

    public String getConsumptionTypeName() {
        return consumptionTypeName;
    }

    public void setConsumptionTypeName(String consumptionTypeName) {
        this.consumptionTypeName = consumptionTypeName;
    }

    public Integer getThreeInOneId() {
        return threeInOneId;
    }

    public void setThreeInOneId(Integer threeInOneId) {
        this.threeInOneId = threeInOneId;
    }

    public String getThreeInOneName() {
        return threeInOneName;
    }

    public void setThreeInOneName(String threeInOneName) {
        this.threeInOneName = threeInOneName;
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

}
