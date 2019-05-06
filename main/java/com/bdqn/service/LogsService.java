package com.bdqn.service;

import com.bdqn.entity.Logs;

import java.util.List;

public interface LogsService {
    //    查
    public List<Logs> getAllByConfigCode(Logs logs);
    //    删
    public int getdeleOne(int id);
    //    改
    public int getUpOne(Logs logs);
    //    增
    public int getAddOne(Logs logs);
}
