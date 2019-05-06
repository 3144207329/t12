package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.Logs;
import com.bdqn.service.LogsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Logs")
public class LogsController extends BaseController {
    @Resource
    LogsService logsService;

    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(Logs logs){
        List result = logsService.getAllByConfigCode(logs);
        return dealQueryResult(result,result);
    }
    @PostMapping("getdeleOne")
    public String getdeleOne(int id){
        int result = logsService.getdeleOne(id);
        return dealSuccessResult("删除成功!",result);
    }
    @PostMapping("getUpOne")
    public String getUpOne(Logs logs){
        int result = logsService.getUpOne(logs);
        return dealSuccessResult("修改成功!",result);
    }
    @PostMapping("getAddOne")
    public String getAddOne(Logs logs) {
        int reslult = logsService.getAddOne(logs);
        return dealSuccessResult("增加成功!",reslult);
    }

}
