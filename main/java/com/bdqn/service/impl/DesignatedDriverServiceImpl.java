package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.DesignatedDriverDao;
import com.bdqn.entity.DesignatedDriver;
import com.bdqn.service.DesignatedDriverService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DesignatedDriverServiceImpl extends BaseServiceImpl implements DesignatedDriverService {

    @Resource
    DesignatedDriverDao designatedDriverDao;
    @Override
    public List<DesignatedDriver> getAllByConfigCode(DesignatedDriver designatedDriver) {
        return designatedDriverDao.getAllByConfigCode(designatedDriver);
    }

    @Override
    public int getdeleOne(int id) {
        return designatedDriverDao.getdeleOne(id);
    }

    @Override
    public int getUpOne(DesignatedDriver designatedDriver) {
        return designatedDriverDao.getUpOne(designatedDriver);
    }

    @Override
    public int getAddOne(DesignatedDriver designatedDriver) {
        return designatedDriverDao.getAddOne(designatedDriver);
    }
}
