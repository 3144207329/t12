package com.bdqn.controller;


import com.bdqn.common.web.BaseController;
import com.bdqn.entity.CheckCar;
import com.bdqn.service.CheckCarService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Che")
public class CheckCarController extends BaseController {
    @Resource
    CheckCarService checkCarService;

//    查
    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(CheckCar checkCar){
        List result = checkCarService.getAllByConfigCode(checkCar);
        return dealQueryResult(result,result);
    }
//    删
    @PostMapping("getdeleOne")
    public String getdeleOne(int id){
        int result = checkCarService.getdeleOne(id);
        return dealSuccessResult("删除成功!",result);
    }
//    改
    @PostMapping("getUpOne")
    public String  getUpOne(CheckCar checkCar){
        int result = checkCarService.getUpOne(checkCar);
        return dealSuccessResult("修改成功!",result);
    }

//    增
    @PostMapping("getAddOne")
    public String getAddOne(CheckCar checkCar){
        int result =checkCarService.getAddOne(checkCar);
        return dealSuccessResult("增加成功",result);
    }


}
