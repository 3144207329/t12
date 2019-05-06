package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;//
    private String userCode;//账号
    private String password;//密码：初始密码1234
    private String userName;//姓名
    private Integer groupId;//所属组id：对应系统配置role中的主键id
    private String groupName;//所属组name：对应系统配置role中roleCode
    private Integer companyId;//所属公司id：对应系统配置systemconfig中configCode =‘COMPANY’的configValueId
    private String companyName;//所属公司name：对应系统配置systemconfig中configCode =‘COMPANY’的configValueName
    private String sex;//性别
    private String phone;//电话号码
    private String email;//邮箱
    private Integer age;//年龄
    private Date lastLoginTime;//最后登录时间
    private Integer status;//0为启用1为不启用
    private String lastUpdateBy;//最后修改人
    private Date lastUpdateTime;//最后修改时间
    private Integer zhiWei;//所属职位：对应系统配置systemconfig中configCode =‘ZHIWU’的configValueId
    private Integer submitId;//提交状态id：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueId
    private String submitName;//提交状态name：对应系统配置表systemconfig中configCode =‘SUBMIT’的configValueName
    private String submitUserName;//提交人name：对应用户表user中userName
    private Date submitTime;//提交时间

    public String getSubmitUserName() {
		System.out.println("hello world");
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

    public Integer getZhiWei() {
        return zhiWei;
    }

    public void setZhiWei(Integer zhiWei) {
        this.zhiWei = zhiWei;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
