package com.happy.gym.controller;

import com.happy.gym.manager.result.R;
import com.happy.gym.model.vo.JobAddVo;
import com.happy.gym.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {

  @Autowired
  private JobService jobService;

  @RequestMapping("/listJob")
  public R listJob(Integer page, Integer limit) {
    return jobService.listAllJob(page, limit);
  }

  @RequestMapping("/listJobSchool")
  public R listJobSchool(Integer page, Integer limit) {
    String type = "校园招聘";
    return jobService.listJob(page, limit, type);
  }

  @RequestMapping("/listJobSocial")
  public R listJobSocial(Integer page, Integer limit) {
    String type = "社会招聘";
    return jobService.listJob(page, limit, type);
  }


  @RequestMapping("/jobDetail")
  public R jobDetail(Integer id) {
    return jobService.jobDetail(id);
  }

  @RequestMapping("/update")
  public R jobInfoUpdate(JobAddVo jobAddVo) {
    return jobService.jobInfoUpdate(jobAddVo);
  }

  @RequestMapping("/add")
  public R jobAdd(JobAddVo jobAddVo) {
    return jobService.jobAdd(jobAddVo);
  }

  @RequestMapping("/del")
  public R jobDel(Integer id) {
//    Integer id = Integer.parseInt(joId);
    return jobService.delJob(id);
  }
}
