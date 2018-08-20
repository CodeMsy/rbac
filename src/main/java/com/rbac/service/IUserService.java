package com.rbac.service;

import com.baomidou.mybatisplus.service.IService;
import com.rbac.model.User;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
public interface IUserService extends IService<User> {

    boolean save(User user);
}
