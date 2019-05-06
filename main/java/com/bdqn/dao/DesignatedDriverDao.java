package com.bdqn.dao;

import com.bdqn.entity.DesignatedDriver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignatedDriverDao {
//    查
    public List<DesignatedDriver> getAllByConfigCode(DesignatedDriver designatedDriver);
//    删
    public int getdeleOne(@Param("id") int id);
//    改
    public int getUpOne(DesignatedDriver designatedDriver);
//    增
    public int getAddOne(DesignatedDriver designatedDriver);
}
