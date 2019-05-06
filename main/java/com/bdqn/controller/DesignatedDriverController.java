package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.DesignatedDriver;
import com.bdqn.service.DesignatedDriverService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/Desig")
public class DesignatedDriverController extends BaseController {

    @Resource
    DesignatedDriverService designatedDriverService;
//    查
    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(DesignatedDriver designatedDriver){
        System.err.println(toString());
        List result = designatedDriverService.getAllByConfigCode(designatedDriver);
        return dealQueryResult(result, result);
    }
//    删
    @PostMapping("getdeleOne")
    public String getdeleOne (int id){
        int result = designatedDriverService.getdeleOne(id);
        return dealSuccessResult("删除成功!",result);
    }
//    改
    @PostMapping("getUpOne")
    public String getUpOne(DesignatedDriver designatedDriver){
        int result = designatedDriverService.getUpOne(designatedDriver);
        return dealSuccessResult("更改成功1", result);
    }
//    增
    @PostMapping("getAddOne")
    public String getAddOne(DesignatedDriver designatedDriver){
        int result = designatedDriverService.getAddOne(designatedDriver);
        return dealSuccessResult("增加成功!", result);
    }

}
