package com.happy.gym.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class JobAddVo {
  /**
   * 职位ID
   */
  private Integer joId;

  /**
   * 职位名称
   */
  private String joTitle;

  /**
   * 招聘人数
   */
  private Integer joNum;

  /**
   * 工作地点
   */
  private String joCity;

  /**
   * 职位类型
   */
  private String joType;

  /**
   * 工作年限 0：无经验 1：1-3年 2：3-5年
   */
  private Integer joWkyear;

  /**
   * 最低学历要求
   */
  private String joDegree;

  /**
   * 基本要求
   */
  private String joRequire;

  /**
   * 工作内容描述
   */
  private String joContent;

  /**
   * 招聘截止日期
   */
  @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
  private Date joEndtime;

  /**
   * 职位所在部门
   */
  private String joDept;

}
