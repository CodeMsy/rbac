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
 * 系统功能
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@TableName("sys_function")
public class Function extends Model<Function> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 功能编码
     */
    private String code;
    /**
     * 类型：0通用功能/1专属功能
     */
    private Integer type;
    /**
     * 状态：0管理员增加/1系统初始化
     */
    private Integer source;
    /**
     * 状态：0启用/1关闭
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer orderby;
    /**
     * 是否删除:0:否 ,1:是
     */
    private Integer deleted;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 修改时间
     */
    @TableField("modify_date")
    private Date modifyDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Function{" +
        "id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", type=" + type +
        ", source=" + source +
        ", status=" + status +
        ", orderby=" + orderby +
        ", deleted=" + deleted +
        ", creator=" + creator +
        ", createDate=" + createDate +
        ", modifier=" + modifier +
        ", modifyDate=" + modifyDate +
        "}";
    }
}
