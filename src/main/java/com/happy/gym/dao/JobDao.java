package com.happy.gym.dao;

import com.happy.gym.model.vo.JobAddVo;
import com.happy.gym.model.vo.JobUserSerVo;
import com.happy.gym.pojo.Job;

import java.util.List;

public interface JobDao {
    int deleteByPrimaryKey(Integer joId);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer joId);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

  List<Job> listJob(String type);

    JobUserSerVo jobDetail(Integer id);

  Integer jobInfoUpdate(JobAddVo jobAddVo);

  Integer jobAdd(JobAddVo jobAddVo);

  List<Job> listAllJob();

  Integer delJob(Integer id);
}
