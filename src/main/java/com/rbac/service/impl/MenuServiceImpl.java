package com.rbac.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.MenuMapper;
import com.rbac.model.Menu;
import com.rbac.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单 服务实现类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
