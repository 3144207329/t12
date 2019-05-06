package com.bdqn.dao;

import com.bdqn.entity.CheckCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckCarDao {

//    增
    public List<CheckCarDao>getAllByConfigCode(CheckCar checkCar);
//    删
    public int getUpOne(CheckCar checkCar);
//    改
    public int getdeleOne(@Param("id") int id);
//    查
    public int getAddOne(CheckCar checkCar);
}
