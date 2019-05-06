package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.CheckCarDao;
import com.bdqn.entity.CheckCar;
import com.bdqn.service.CheckCarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CheckCarServiceImpl extends BaseServiceImpl implements CheckCarService {

    @Resource
    CheckCarDao checkCarDao;


    @Override
    public List<CheckCarDao> getAllByConfigCode(CheckCar checkCar) {
        return checkCarDao.getAllByConfigCode(checkCar);
    }

    @Override
    public int getUpOne(CheckCar checkCar) {
        return checkCarDao.getUpOne(checkCar);
    }

    @Override
    public int getdeleOne(int id) {
        return checkCarDao.getdeleOne(id);
    }

    @Override
    public int getAddOne(CheckCar checkCar) {
        return checkCarDao.getAddOne(checkCar);
    }
}
