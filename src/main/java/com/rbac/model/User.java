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
 * 系统用户
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 头像
     */
    @TableField("image_face")
    private String imageFace;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 姓名
     */
    private String name;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别:0男，1女
     */
    private Integer sex;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 固话
     */
    private String phone;
    /**
     * QQ号
     */
    private String qq;
    /**
     * 微信
     */
    private String weixin;
    /**
     * 支付宝
     */
    private String alipay;
    /**
     * 地址
     */
    private String address;
    /**
     * 类型:0平台会员1后台管理员
     */
    private Integer type;
    /**
     * 状态:0启用1锁定/冻结
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;
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

    public String getImageFace() {
        return imageFace;
    }

    public void setImageFace(String imageFace) {
        this.imageFace = imageFace;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "User{" +
        "id=" + id +
        ", imageFace=" + imageFace +
        ", nickname=" + nickname +
        ", name=" + name +
        ", email=" + email +
        ", sex=" + sex +
        ", mobile=" + mobile +
        ", phone=" + phone +
        ", qq=" + qq +
        ", weixin=" + weixin +
        ", alipay=" + alipay +
        ", address=" + address +
        ", type=" + type +
        ", status=" + status +
        ", remark=" + remark +
        ", deleted=" + deleted +
        ", creator=" + creator +
        ", createDate=" + createDate +
        ", modifier=" + modifier +
        ", modifyDate=" + modifyDate +
        "}";
    }
}
