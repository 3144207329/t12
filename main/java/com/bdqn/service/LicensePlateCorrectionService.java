package com.bdqn.service;

import com.bdqn.entity.LicensePlateCorrection;

import java.util.List;

public interface LicensePlateCorrectionService {
    //    查
    public List<LicensePlateCorrection> getAllByConfigCode(LicensePlateCorrection licensePlateCorrection);

    //    删
    public int getdeleOne(int id);

    //    改
    public int  getUpOne(LicensePlateCorrection licensePlateCorrection);

    //    增
    public int getAddOne(LicensePlateCorrection licensePlateCorrection);


}
