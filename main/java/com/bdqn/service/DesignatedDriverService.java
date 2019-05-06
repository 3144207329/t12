package com.bdqn.service;

import com.bdqn.entity.DesignatedDriver;

import java.util.List;

public interface DesignatedDriverService {
    //    增
    public List<DesignatedDriver> getAllByConfigCode(DesignatedDriver designatedDriver);
    //    删
    public int getdeleOne(int id);
    //    改
    public int getUpOne(DesignatedDriver designatedDriver);
    //    查
    public int getAddOne(DesignatedDriver designatedDriver);
}
