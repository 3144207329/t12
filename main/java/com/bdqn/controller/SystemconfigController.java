package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.entity.Systemconfig;
import com.bdqn.service.SystemconfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/systemconfig")
public class SystemconfigController extends BaseController {
    @Resource
    private SystemconfigService systemconfigService;

    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(String configCode,Integer configValueId) {
        List<Systemconfig> list = systemconfigService.getAllByConfigCode(configCode,configValueId);
        return dealQueryResult(list, list);
    }

    @GetMapping("getAllByConfigCodeG")
    public List<Systemconfig> getAllByConfigCodeG(String configCode,Integer configValueId) {
        List<Systemconfig> list = systemconfigService.getAllByConfigCode(configCode,configValueId);
        return list;
    }

    //    模糊查询
    @PostMapping("getAll")
    public String getAll(Systemconfig systemconfig) {
        List result = systemconfigService.getAll(systemconfig);
        return dealQueryResult(result, result);
    }

    //    改
    @PostMapping("getUpOne")
    public String getUpOne(Systemconfig systemconfig) {
        int result = systemconfigService.getUpOne(systemconfig);
        return dealSuccessResult("修改成功!", result);
    }

    //    删除
    @PostMapping("getdeleOne")
    public String getdeleOne(int id) {
        int result = systemconfigService.getdeleOne(id);
        return dealSuccessResult("删除成功!", result);
    }

    //    增加
    @PostMapping("getAddOne")
    public String getAddOne(Systemconfig systemconfig) {
        int result = systemconfigService.getAddOne(systemconfig);
        return dealSuccessResult("增加成功!", result);
    }


}
