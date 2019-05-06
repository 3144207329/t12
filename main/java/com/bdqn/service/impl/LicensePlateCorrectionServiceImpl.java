package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.LicensePlateCorrectionDao;
import com.bdqn.entity.LicensePlateCorrection;
import com.bdqn.service.LicensePlateCorrectionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class LicensePlateCorrectionServiceImpl extends BaseServiceImpl implements LicensePlateCorrectionService {

    @Resource
    LicensePlateCorrectionDao licensePlateCorrectionDao;

    @Override
    public List<LicensePlateCorrection> getAllByConfigCode(LicensePlateCorrection licensePlateCorrection) {
        return licensePlateCorrectionDao.getAllByConfigCode(licensePlateCorrection);
    }

    @Override
    public int getdeleOne(int id) {
        return licensePlateCorrectionDao.getdeleOne(id);
    }

    @Override
    public int getUpOne(LicensePlateCorrection licensePlateCorrection) {
        return licensePlateCorrectionDao.getUpOne(licensePlateCorrection);
    }

    @Override
    public int getAddOne(LicensePlateCorrection licensePlateCorrection) {
        return licensePlateCorrectionDao.getAddOne(licensePlateCorrection);
    }
}
