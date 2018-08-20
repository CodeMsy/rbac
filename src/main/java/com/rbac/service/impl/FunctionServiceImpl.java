package com.rbac.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.FunctionMapper;
import com.rbac.model.Function;
import com.rbac.service.IFunctionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统功能 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class FunctionServiceImpl extends ServiceImpl<FunctionMapper, Function> implements IFunctionService {

}
