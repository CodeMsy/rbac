package com.rbac.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统菜单
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@TableName("sys_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 父节点ID
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 功能ID
     */
    @TableField("function_id")
    private Long functionId;
    /**
     * 名称
     */
    private String name;
    /**
     * URL
     */
    private String url;
    /**
     * 是否展开:0:是 ,1:否
     */
    private Integer isopen;
    /**
     * 类型：0菜单/1目录/2功能
     */
    private Integer type;
    /**
     * 菜单层级
     */
    private Integer level;
    /**
     * 状态：0启用/1禁用
     */
    private Integer status;

    /**
     * 是否删除:0:否 ,1:是
     */
    private Integer deleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", functionId=" + functionId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", isopen=" + isopen +
                ", type=" + type +
                ", level=" + level +
                ", status=" + status +
                ", deleted=" + deleted +
                '}';
    }
}
