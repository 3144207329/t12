package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {
    private Integer id;//主键id
    private Integer  userId;//处理人工作账号号：处理该业务人员id（来自“user”中的主键id）
    private String userCode;//处理人工作账号号：处理该业务人员的工作号（来自“user”中的“userCode”）
    private String userName;//处理人：处理该业务人员的姓名（来自“user”中的“userName”）
    private String businessNum;//业务编码
    private String businessType;//操作类型：车主秘书、新车牌照批改、酒后代驾、代检车
    private String businessStatus;//业务状态：提交、未提交、处理、未处理、批改、为批改等
    private String operateMess;//操作信息：登录、登出、添加、修改等
    private Date operateDate;//操作时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getOperateMess() {
        return operateMess;
    }

    public void setOperateMess(String operateMess) {
        this.operateMess = operateMess;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }
}
