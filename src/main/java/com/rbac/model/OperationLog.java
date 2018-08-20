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
 * 系统操作日志
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@TableName("sys_operation_log")
public class OperationLog extends Model<OperationLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 操作人IP
     */
    @TableField("request_ip")
    private String requestIp;
    /**
     * 操作人请求URL
     */
    @TableField("request_url")
    private String requestUrl;
    /**
     * 请求参数
     */
    @TableField("request_params")
    private String requestParams;
    /**
     * 类路径
     */
    @TableField("class_path")
    private String classPath;
    /**
     * 请求方法名称
     */
    @TableField("method_name")
    private String methodName;
    /**
     * 方法参数
     */
    @TableField("method_params")
    private String methodParams;
    /**
     * 业务类型：0其它1新增2修改3删除4授权5导出6导入7登录8退出登录9禁止访问
     */
    @TableField("business_type")
    private Integer businessType;
    /**
     * 业务名称：如用户管理
     */
    @TableField("business_name")
    private String businessName;
    /**
     * 业务状态：0其它1成功2失败
     */
    @TableField("business_status")
    private Integer businessStatus;
    /**
     * 业务备注
     */
    @TableField("business_remarks")
    private String businessRemarks;
    /**
     * 操作用户类型：0其它1后台用户2手机端用户
     */
    @TableField("operator_type")
    private Integer operatorType;
    /**
     * 更新前JSOn对象
     */
    @TableField("before_update_json")
    private String beforeUpdateJson;
    /**
     * 更新后JSOn对象
     */
    @TableField("after_update_json")
    private String afterUpdateJson;
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

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(String methodParams) {
        this.methodParams = methodParams;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessRemarks() {
        return businessRemarks;
    }

    public void setBusinessRemarks(String businessRemarks) {
        this.businessRemarks = businessRemarks;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getBeforeUpdateJson() {
        return beforeUpdateJson;
    }

    public void setBeforeUpdateJson(String beforeUpdateJson) {
        this.beforeUpdateJson = beforeUpdateJson;
    }

    public String getAfterUpdateJson() {
        return afterUpdateJson;
    }

    public void setAfterUpdateJson(String afterUpdateJson) {
        this.afterUpdateJson = afterUpdateJson;
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
        return "OperationLog{" +
        "id=" + id +
        ", requestIp=" + requestIp +
        ", requestUrl=" + requestUrl +
        ", requestParams=" + requestParams +
        ", classPath=" + classPath +
        ", methodName=" + methodName +
        ", methodParams=" + methodParams +
        ", businessType=" + businessType +
        ", businessName=" + businessName +
        ", businessStatus=" + businessStatus +
        ", businessRemarks=" + businessRemarks +
        ", operatorType=" + operatorType +
        ", beforeUpdateJson=" + beforeUpdateJson +
        ", afterUpdateJson=" + afterUpdateJson +
        ", deleted=" + deleted +
        ", creator=" + creator +
        ", createDate=" + createDate +
        ", modifier=" + modifier +
        ", modifyDate=" + modifyDate +
        "}";
    }
}
