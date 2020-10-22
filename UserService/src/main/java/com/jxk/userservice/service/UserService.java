package com.jxk.userservice.service;

import com.jxk.userservice.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jxk
 * @since 2020-10-21
 */
public interface UserService extends IService<User> {
    public List<User> getAllUser();
}
