package com.bdqn.controller;


import com.bdqn.common.web.BaseController;
import com.bdqn.entity.LicensePlateCorrection;
import com.bdqn.service.LicensePlateCorrectionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Licen")
public class LicensePlateCorrectionController extends BaseController {

    @Resource
    LicensePlateCorrectionService licensePlateCorrectionService;

    //    查
    @PostMapping("getAllByConfigCode")
    public String getAllByConfigCode(LicensePlateCorrection licensePlateCorrection) {
        List result = licensePlateCorrectionService.getAllByConfigCode(licensePlateCorrection);
        return dealQueryResult(result, result);
    }

    //    删
    @PostMapping("getdeleOne")
    public String getdeleOne(int id) {
        int result = licensePlateCorrectionService.getdeleOne(id);
        return dealSuccessResult("删除成功!", result);
    }

    //    改
    @PostMapping("getUpOne")
    public String getUpOne(LicensePlateCorrection licensePlateCorrection) {
        int result = licensePlateCorrectionService.getUpOne(licensePlateCorrection);
        return dealSuccessResult("修改成功!", result);
    }

    //    增
    @PostMapping("getAddOne")
    public String getAddOne(LicensePlateCorrection licensePlateCorrection) {
        int result = licensePlateCorrectionService.getAddOne(licensePlateCorrection);
        return dealSuccessResult("增加成功!", result);
    }
}
