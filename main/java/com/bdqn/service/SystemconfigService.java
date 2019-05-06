package com.bdqn.service;

import com.bdqn.entity.Systemconfig;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SystemconfigService {
    /**
     * 根据configCode查询全部
     * @param configCode
     * @return
     */
    //   查询全部
    public List<Systemconfig> getAllByConfigCode( String configCode,Integer configValueId);

    //    模糊查询
    public List<Systemconfig> getAll(Systemconfig systemconfig);

    //    修改
    public int getUpOne(Systemconfig systemconfig);

    //    删除
    public int getdeleOne(int id);

    //    增加
    public int getAddOne(Systemconfig systemconfig);
}
