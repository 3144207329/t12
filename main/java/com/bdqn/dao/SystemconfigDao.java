package com.bdqn.dao;

import com.bdqn.entity.Systemconfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SystemconfigDao {

    /**
     * 根据configCode查询全部
     *
     * @param configCode
     * @return
     */

    //   查询全部
    public List<Systemconfig> getAllByConfigCode(@Param("configCode") String configCode,@Param("configValueId") Integer configValueId);

    //    模糊查询
    public List<Systemconfig> getAll(Systemconfig systemconfig);

    //    修改
    public int getUpOne(Systemconfig systemconfig);

    //    删除
    public int getdeleOne(@Param("id") int id);

    //    增加
    public int getAddOne(Systemconfig systemconfig);

}
