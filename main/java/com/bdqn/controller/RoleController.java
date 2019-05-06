package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.Role;
import com.bdqn.service.RoleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Role")
public class RoleController extends BaseController {

    @Resource
    RoleService roleService;

    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(Role role){
        List result = roleService.getAllByConfigCode(role);
        return dealQueryResult(result,result);
    }

    @PostMapping("getdeleOne")
    public String getdeleOne(int id){
        int result = roleService.getdeleOne(id);
        return dealSuccessResult("删除成功!",result);
    }

    @PostMapping("getUpOne")
    public String getUpOne(Role role){
        int result = roleService.getUpOne(role);
        return dealSuccessResult("更改成功!",result);
    }

    @PostMapping("getAddOne")
    public String getAddOne(Role role){
        int result = roleService.getAddOne(role);
        return dealSuccessResult("增加成功!",result);
    }



}
