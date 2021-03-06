package com.fwf.ssoServer.service.impl;

import com.fwf.ssoServer.entity.User;
import com.fwf.ssoServer.mapper.UserMapper;
import com.fwf.ssoServer.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Alan_
 * @since 2021-02-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
