package com.bdqn.service.impl;


import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.SystemconfigDao;
import com.bdqn.entity.Systemconfig;
import com.bdqn.service.SystemconfigService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SystemconfigServiceImpl extends BaseServiceImpl implements SystemconfigService {

    @Resource
    private SystemconfigDao systemconfigDao;


    @Override
    public List<Systemconfig> getAllByConfigCode(String configCode,Integer configValueId) {
        return systemconfigDao.getAllByConfigCode(configCode,configValueId);
    }

    @Override
    public List<Systemconfig> getAll(Systemconfig systemconfig) {
        return systemconfigDao.getAll(systemconfig);
    }

    @Override
    public int getUpOne(Systemconfig systemconfig) {
        return systemconfigDao.getUpOne(systemconfig);
    }

    @Override
    public int getdeleOne(int id) {
        return systemconfigDao.getdeleOne(id);
    }

    @Override
    public int getAddOne(Systemconfig systemconfig) {
        return systemconfigDao.getAddOne(systemconfig);
    }
}
