package com.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.ErrorLogMapper;
import com.rbac.model.ErrorLog;
import com.rbac.service.IErrorLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统错误日志 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class ErrorLogServiceImpl extends ServiceImpl<ErrorLogMapper, ErrorLog> implements IErrorLogService {

}
