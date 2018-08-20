package com.rbac.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.RoleMenuMapper;
import com.rbac.model.RoleMenu;
import com.rbac.service.IRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 | 菜单 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

}
