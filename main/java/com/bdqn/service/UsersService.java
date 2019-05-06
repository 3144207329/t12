package com.bdqn.service;

import com.bdqn.entity.User;

import java.util.List;

public interface UsersService {

    List<User> getMyAndShou(Integer id,String zhiWei);
    /**
     * 登录
     * @param userCode
     * @param password
     * @return
     */
    User getUser(String userCode, String password);

    /**
     * 根据条件查询
     * @param user
     * @return
     */
    List<User> getAll(User user);

    /**
     * 注销
     * @param id
     * @return
     */
    int delUpd(Integer id);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updById(User user);

    /**
     * 修改登录时间
     * @param id
     * @return
     */
    int updLoginDate(Integer id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
