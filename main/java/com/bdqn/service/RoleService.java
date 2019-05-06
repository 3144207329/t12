package com.bdqn.service;

import com.bdqn.entity.Role;

import java.util.List;

public interface RoleService {
    //    查
    public List<Role> getAllByConfigCode(Role role);
    //    删
    public int getdeleOne(int id);
    //    改
    public int getUpOne(Role role);
    //    增
    public int getAddOne(Role role);
}
