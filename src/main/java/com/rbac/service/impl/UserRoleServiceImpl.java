package com.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.UserRoleMapper;
import com.rbac.model.UserRole;
import com.rbac.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 | 角色 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
