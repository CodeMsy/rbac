package com.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.UserLoginMapper;
import com.rbac.model.UserLogin;
import com.rbac.service.IUserLoginService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class UserLoginServiceImpl extends ServiceImpl<UserLoginMapper, UserLogin> implements IUserLoginService {

}
