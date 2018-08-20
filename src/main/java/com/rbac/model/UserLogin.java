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
 * 用户登录
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@TableName("sys_user_login")
public class UserLogin extends Model<UserLogin> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 登录账号
     */
    private String account;
    /**
     * 登录密码
     */
    private String password;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "UserLogin{" +
                "id=" + id +
                ", userId=" + userId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
