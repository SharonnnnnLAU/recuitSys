package com.happy.gym.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ToolListVo {

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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date tLastFixTime;

    /**
     * 器材保质期限 -year
     */
    private Integer tShelfLife;

    /**
     * 器材是否报废 0-否  1-报废
     */
    private Boolean tScrap;


}
