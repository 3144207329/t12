package com.bdqn.dao;

import com.bdqn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
   /**
    * 获取自己与自己的手下
    * @param id
    * @param zhiWei
    * @return
    */
   List<User> getMyAndShou(@Param("id") Integer id,@Param("zhiWei") String zhiWei);
   /**
    * 登录
    * @param userCode
    * @param password
    * @return
    */
   User getUser(@Param("userCode") String userCode, @Param("password") String password);

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
   int delUpd(@Param("id") Integer id);

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
   int updLoginDate(@Param("id") Integer id);

   /**
    * 添加用户
    * @param user
    * @return
    */
   int addUser(User user);
}
