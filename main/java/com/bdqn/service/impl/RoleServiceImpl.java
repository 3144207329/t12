package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.RoleDao;
import com.bdqn.entity.Role;
import com.bdqn.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl extends BaseServiceImpl implements RoleService {
    @Resource
    RoleDao roleDao;

    @Override
    public List<Role> getAllByConfigCode(Role role) {
        return roleDao.getAllByConfigCode(role);
    }

    @Override
    public int getdeleOne(int id) {
        return roleDao.getdeleOne(id);
    }

    @Override
    public int getUpOne(Role role) {
        return roleDao.getUpOne(role);
    }

    @Override
    public int getAddOne(Role role) {
        return roleDao.getAddOne(role);
    }
}
