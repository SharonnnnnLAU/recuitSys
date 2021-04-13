package com.happy.gym.model.vo;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * 新增器材
 */
@Data
public class ToolAddVo {

    /**
     * 器材种类
     */
    @NotBlank(message = "器材类型不能为空")
    private String tType;

    /**
     * 器材详情
     */
    @NotBlank(message = "器材详情不能为空")
    private String tDesc;

    /**
     * 器材保质期限 -year
     */
    @NotNull
    private Integer tShelfLife;

}
