package com.rbac.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.OperationLogMapper;
import com.rbac.model.OperationLog;
import com.rbac.service.IOperationLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
