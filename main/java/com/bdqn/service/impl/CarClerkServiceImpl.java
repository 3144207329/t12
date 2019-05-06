package com.bdqn.service.impl;


import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.CarClerkDao;
import com.bdqn.entity.CarClerk;
import com.bdqn.service.CarClerkService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CarClerkServiceImpl extends BaseServiceImpl implements CarClerkService {

    @Resource
    CarClerkDao carClerkDao;

    @Override
    public List<CarClerk> getAllByConfigCode(CarClerk carClerk) {
        return carClerkDao.getAllByConfigCode(carClerk);
    }

    @Override
    public int getdeleOne(int id) {
        return carClerkDao.getdeleOne(id);
    }

    @Override
    public int getUpOne(CarClerk carClerk) {
        return carClerkDao.getUpOne(carClerk);
    }

    @Override
    public int getAddOne(CarClerk carClerk) {
        return carClerkDao.getAddOne(carClerk);
    }
}
