package com.happy.gym.service;

import com.happy.gym.manager.result.R;
import com.happy.gym.model.vo.JobAddVo;

public interface JobService {

  /**
   * 获取岗位分类信息
   * @param page
   * @param limit
   * @return
   */
  R listJob(Integer page, Integer limit, String type);

  /**
   * 通过岗位id获取岗位详细信息
   * @param id
   * @return
   */
  R jobDetail(Integer id);

  /**
   * 编辑岗位信息
   * @param jobAddVo
   * @return
   */
  R jobInfoUpdate(JobAddVo jobAddVo);

  /**
   * 新增岗位信息
   * @param jobAddVo
   * @return
   */
  R jobAdd(JobAddVo jobAddVo);

  /**
   * 查询所有岗位
   * @param page
   * @param limit
   * @return
   */
  R listAllJob(Integer page, Integer limit);

  /**
   * 删除
   * @param id
   * @return
   */
  R delJob(Integer id);
}
