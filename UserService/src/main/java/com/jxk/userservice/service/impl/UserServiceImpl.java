package com.jxk.userservice.service.impl;

import com.jxk.userservice.entity.User;
import com.jxk.userservice.mapper.UserMapper;
import com.jxk.userservice.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jxk
 * @since 2020-10-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }
}
