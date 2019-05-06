package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.User;
import com.bdqn.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UsersController extends BaseController {
    @Resource
    private UsersService usersService;

    /**
     * 登录
     * @param userCode
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String getUser(String userCode, String password){
        User user = usersService.getUser(userCode,password);
        if (user != null && user.getStatus()==0) return dealQueryResult(user,user);
        return dealQueryResult(user,null);
    }

    @PostMapping("/getAll")
    public String getAll(User user) {
        List<User> userList = usersService.getAll(user);
        return dealQueryResult(userList,userList);
    }

    @PostMapping("/getMyAndShou")
    public String getMyAndShou(Integer id,String zhiWei) {
        List<User> userList = usersService.getMyAndShou(id, zhiWei);
        return dealQueryResult(userList,userList);
    }

    @PostMapping("/delUpd")
    public String delUpd(Integer id) {
        int row = usersService.delUpd(id);
        return dealSuccessResult("注销",row);
    }

    @PostMapping("/updById")
    public String updById(User user) {
        int row = usersService.updById(user);
        return  dealSuccessResult("修改",row);
    }

    @PostMapping("/updLoginDate")
    public String updLoginDate(Integer id) {
        int row = usersService.updLoginDate(id);
        return dealSuccessResult("登录时间",row);
    }

    @PostMapping("/addUser")
    public String addUser(User user) {
        int row = usersService.addUser(user);
        return dealSuccessResult("添加",row);
    }
}
