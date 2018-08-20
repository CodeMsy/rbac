package com.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbac.mapper.UserMapper;
import com.rbac.model.User;
import com.rbac.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        if(null!=user.getId()){
            return userMapper.updateById(user)>0;
        }else{
           return userMapper.insert(user)>0;
        }
    }
}
