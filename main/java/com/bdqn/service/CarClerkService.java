package com.bdqn.service;

import com.bdqn.entity.CarClerk;

import java.util.List;

public interface CarClerkService {
    //    增
    public List<CarClerk> getAllByConfigCode(CarClerk carClerk);

    //    删
    public int getdeleOne(int id);

    //    改
    public int getUpOne(CarClerk carClerk);

    //    查
    public int getAddOne(CarClerk carClerk);


}
