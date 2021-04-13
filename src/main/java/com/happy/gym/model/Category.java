package com.happy.gym.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Marveal
 * @date 2020/6/9 15:13
 */

@Data
@JsonIgnoreProperties(value = "handler")
public class Category implements Serializable {
    private Integer meId;

    /**
     * 菜单名
     */
    private String meName;

    /**
     * 父id
     */
    private Integer fatherId;

    /**
     * 权限id
     */
    private Integer aId;

    /**
     * 菜单对应的路径
     */
    private String url;

    private List<Category> children;
}
