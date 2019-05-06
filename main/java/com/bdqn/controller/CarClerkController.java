package com.bdqn.controller;


import com.bdqn.common.web.BaseController;
import com.bdqn.entity.CarClerk;
import com.bdqn.service.CarClerkService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Car")
public class CarClerkController extends BaseController {

    @Resource
    CarClerkService carClerkService;

    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(CarClerk carClerk){
        List result= carClerkService.getAllByConfigCode(carClerk);
        return dealQueryResult(result,result);
    }

    @PostMapping("getdeleOne")
    public String getdeleOne(int id){
        int result = carClerkService.getdeleOne(id);
        return dealSuccessResult("删除成功!",result);
    }
    @PostMapping("getUpOne")
    public String getUpOne(CarClerk carClerk){
        int result = carClerkService.getUpOne(carClerk);
        return dealSuccessResult("修改成功!",result);
    }
    @PostMapping("getAddOne")
    public String getAddOne(CarClerk carClerk) {
        int result = carClerkService.getAddOne(carClerk);
        return dealSuccessResult("添加成功!", result);
    }
}
