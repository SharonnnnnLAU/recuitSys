package com.happy.gym.service;

import com.happy.gym.manager.result.R;
import com.happy.gym.model.vo.ToolAddVo;

public interface ToolService {
    /**
     * 获取器材分页管理信息
     * @param page 需求页
     * @param limit 每页条数
     * @return 器材信息列表
     */
    R listTool(Integer page, Integer limit);

    /**
     * 更改器材报废状态
     * @param id 器材id
     * @return 修改结果
     */
    R modToolStatus(Integer id);

    /**
     * 通过器材id获取器材基本信息
     * @param id 器材id
     * @return 器材基本信息
     */
    R findToolDetail(Integer id);

    /**
     * 通过id删除一条器材记录
     * @param id 要删除的器材的id
     * @return 删除结果
     */
    R delTool(Integer id);

    /**
     * 新增器材信息
     * @param toolAddVo 器材信息
     * @return 新增结果
     */
    R addTool(ToolAddVo toolAddVo);
}
