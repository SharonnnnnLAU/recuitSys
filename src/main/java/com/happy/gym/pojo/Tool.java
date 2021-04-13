package com.happy.gym.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tool
 * @author 
 */
@Data
public class Tool implements Serializable {
    /**
     * 器材id
     */
    private Integer tId;

    /**
     * 器材种类
     */
    private String tType;

    /**
     * 器材详情
     */
    private String tDesc;

    /**
     * 该器材最后一次维修时间
     */
    private Date tLastFixTime;

    /**
     * 器材保质期限 -year
     */
    private Integer tShelfLife;

    /**
     * 器材是否报废 0-否  1-报废
     */
    private Boolean tScrap;

    /**
     * 数量（默认值为0）
     */
    private Integer count;

    /**
     * 创建时间
     */
    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    private static final long serialVersionUID = 1L;
}