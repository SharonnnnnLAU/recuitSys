package com.happy.gym.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume
 * @author 
 */
@Data
public class Resume implements Serializable {
    /**
     * 简历ID
     */
    private Integer rsmId;

    /**
     * 真实姓名
     */
    private String rsmRealname;

    /**
     * 1：女 0：男
     */
    private Boolean rsmSex;

    /**
     * 民族
     */
    private String rsmNation;

    /**
     * 出生日期
     */
    private Date rsmBirth;

    private Integer rsmCerid;

    /**
     * 联系电话
     */
    private Integer rsmTel;

    /**
     * 毕业院校
     */
    private String rsmColle;

    /**
     * 最高学历
     */
    private String rsmDegree;

    /**
     * 工作年限 0：无经验 1：1-3年 2：3-5年 3：5-10年 4：10年以上
     */
    private Boolean rsmWkyear;

    /**
     * 专业名称
     */
    private String rsmMajor;

    /**
     * 简历备注信息
     */
    private String rsmNote;

    /**
     * 教育背景ID
     */
    private Integer rsmEduId;

    /**
     * 工作经历ID
     */
    private Integer rsmWkepId;

    private static final long serialVersionUID = 1L;
}