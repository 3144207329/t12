package com.bdqn.dao;

import com.bdqn.entity.Logs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogsDao {
//    查
    public List<Logs> getAllByConfigCode(Logs logs);
//    删
    public int getdeleOne(@Param("id") int id);
//    改
    public int getUpOne(Logs logs);
//    增
    public int getAddOne(Logs logs);
}
