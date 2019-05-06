package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Systemconfig implements Serializable {

    private Integer id;//主键ID
    private String configCode;//配置类型编码
    private String configName;//配置类型名称
    private Integer configValueId;//具体配置类型的配置参数ID
    private String configValueName;//具体配置类型的配置参数NAME
    private Integer status;//0为启用1为不启用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public Integer getConfigValueId() {
        return configValueId;
    }

    public void setConfigValueId(Integer configValueId) {
        this.configValueId = configValueId;
    }

    public String getConfigValueName() {
        return configValueName;
    }

    public void setConfigValueName(String configValueName) {
        this.configValueName = configValueName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
