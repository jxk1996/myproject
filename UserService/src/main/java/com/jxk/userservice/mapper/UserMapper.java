package com.jxk.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxk.userservice.entity.User;

public interface UserMapper extends BaseMapper<User> {
    public User selectById(Long id);

}
