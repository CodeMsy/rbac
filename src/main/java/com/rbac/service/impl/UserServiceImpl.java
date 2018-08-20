package com.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.UserMapper;
import com.rbac.model.User;
import com.rbac.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
