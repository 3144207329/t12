package com.bdqn.service.impl;


import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.UserDao;
import com.bdqn.entity.User;
import com.bdqn.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl implements UsersService {

    @Resource
    private UserDao usersDao;


    @Override
    public List<User> getMyAndShou(Integer id, String zhiWei) {
        return usersDao.getMyAndShou(id, zhiWei);
    }

    @Override
    public User getUser(String userCode, String password) {
        return usersDao.getUser(userCode,password);
    }

    @Override
    public List<User> getAll(User user) {
        return usersDao.getAll(user);
    }

    @Override
    public int delUpd(Integer id) {
        return usersDao.delUpd(id);
    }

    @Override
    public int updById(User user) {
        return usersDao.updById(user);
    }

    @Override
    public int updLoginDate(Integer id) {
        return usersDao.updLoginDate(id);
    }

    @Override
    public int addUser(User user) {
        return usersDao.addUser(user);
    }
}
