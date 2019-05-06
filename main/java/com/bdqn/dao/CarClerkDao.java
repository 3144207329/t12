package com.bdqn.dao;

import com.bdqn.entity.CarClerk;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarClerkDao {
    //    增
    public List<CarClerk> getAllByConfigCode(CarClerk carClerk);

    //    删
    public int getdeleOne(@Param("id") int id);

    //    改
    public int getUpOne(CarClerk carClerk);

    //    增
    public int getAddOne(CarClerk carClerk);

}
