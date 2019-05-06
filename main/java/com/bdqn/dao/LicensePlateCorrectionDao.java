package com.bdqn.dao;

import com.bdqn.entity.LicensePlateCorrection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LicensePlateCorrectionDao {

    //    查
    public List<LicensePlateCorrection> getAllByConfigCode(LicensePlateCorrection licensePlateCorrection);

    //    删
    public int getdeleOne(@Param("id") int id);

    //    改
    public int  getUpOne(LicensePlateCorrection licensePlateCorrection);

    //    增
    public int getAddOne(LicensePlateCorrection licensePlateCorrection);

}
