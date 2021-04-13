package com.happy.gym.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * job
 * @author 
 */
@Data
public class Job implements Serializable {
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
     * 职位类型 0：校招 1：社招
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
     * 限制专业
     */
    private String joMajor;

    /**
     * 基本要求
     */
    private String joRequire;

    /**
     * 工作内容描述
     */
    private String joContent;

    /**
     * 发布日期
     */
    private Date joStarttime;

    /**
     * 招聘截止日期
     */
    private Date joEndtime;

    private Boolean joIsdel;

    /**
     * 职位所在部门
     */
    private String joDept;

    private static final long serialVersionUID = 1L;
}