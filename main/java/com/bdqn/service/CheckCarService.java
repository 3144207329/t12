package com.bdqn.service;

import com.bdqn.dao.CheckCarDao;
import com.bdqn.entity.CheckCar;

import java.util.List;

public interface CheckCarService {

    //    增
    public List<CheckCarDao> getAllByConfigCode(CheckCar checkCar);

    //    删
    public int getUpOne(CheckCar checkCar);

    //    改
    public int getdeleOne(int id);

    //    查
    public int getAddOne(CheckCar checkCar);

}
