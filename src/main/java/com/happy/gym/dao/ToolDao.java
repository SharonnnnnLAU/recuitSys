package com.happy.gym.dao;

import com.happy.gym.model.vo.ToolListVo;
import com.happy.gym.pojo.Tool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ToolDao {
    int deleteByPrimaryKey(Integer tId);

    int insert(Tool record);

    int insertSelective(Tool record);

    Tool selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);

    List<ToolListVo> listTool();

    Integer modToolStatus(Integer id);

    ToolListVo findToolDetail(Integer id);

    Integer delTool(Integer id);

    Integer addTool(@Param("tType") String tType,
                    @Param("tDesc") String tDesc,
                    @Param("tShelfLife") Integer tShelfLife);
}
