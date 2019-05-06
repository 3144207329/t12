package com.bdqn.dao;

import com.bdqn.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    //    查
    public List<Role> getAllByConfigCode(Role role);
    //    删
    public int getdeleOne(@Param("id") int id);
    //    改
    public int getUpOne(Role role);
    //    增
    public int getAddOne(Role role);
}
