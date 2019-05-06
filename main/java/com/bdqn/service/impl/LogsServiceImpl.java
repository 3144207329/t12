package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.LogsDao;
import com.bdqn.entity.Logs;
import com.bdqn.service.LogsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class LogsServiceImpl extends BaseServiceImpl implements LogsService {
    @Resource
    LogsDao logsDao;
    @Override
    public List<Logs> getAllByConfigCode(Logs logs) {
        return logsDao.getAllByConfigCode(logs);
    }

    @Override
    public int getdeleOne(int id) {
        return logsDao.getdeleOne(id);
    }

    @Override
    public int getUpOne(Logs logs) {
        return logsDao.getUpOne(logs);
    }

    @Override
    public int getAddOne(Logs logs) {
        return logsDao.getAddOne(logs);
    }
}
