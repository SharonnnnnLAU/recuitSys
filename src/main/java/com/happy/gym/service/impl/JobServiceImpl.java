package com.happy.gym.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.gym.dao.JobDao;
import com.happy.gym.manager.result.R;
import com.happy.gym.manager.result.Status;
import com.happy.gym.model.vo.JobAddVo;
import com.happy.gym.model.vo.JobUserSerVo;
import com.happy.gym.pojo.Job;
import com.happy.gym.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

  @Autowired
  private JobDao jobDao;

  @Override
  public R listJob(Integer page, Integer limit, String type) {
    Page<Job> pg = PageHelper.startPage(page,limit);
    List<Job> tools = jobDao.listJob(type);
    return R.Success((int)pg.getTotal(), tools);
  }

  @Override
  public R jobDetail(Integer id) {
    JobUserSerVo jobUserSerVo = jobDao.jobDetail(id);
    if (jobUserSerVo == null) {
      return R.Error(Status.ARGS_NOT_ALLOW_NULL);
    }
    return R.Success(jobUserSerVo);
  }

  @Override
  public R jobInfoUpdate(JobAddVo jobAddVo) {
    Integer res = jobDao.jobInfoUpdate(jobAddVo);
    if (res == 1)
      return R.Success();
    else
      return R.Warn(Status.DB_OPERATE_FAILED);
  }

  @Override
  public R jobAdd(JobAddVo jobAddVo) {
    Integer res = jobDao.jobAdd(jobAddVo);
    if (res == 1)
      return R.Success();
    else
      return R.Warn(Status.DB_OPERATE_FAILED);
  }

  @Override
  public R listAllJob(Integer page, Integer limit) {
    Page<Job> pg = PageHelper.startPage(page,limit);
    List<Job> tools = jobDao.listAllJob();
    return R.Success((int)pg.getTotal(), tools);
  }

  @Override
  public R delJob(Integer id) {
    Integer is_del = jobDao.delJob(id);
    if (is_del == 1) {
      return R.Success();
    } else {
      return R.Error(Status.DB_OPERATE_FAILED);
    }
  }
}
