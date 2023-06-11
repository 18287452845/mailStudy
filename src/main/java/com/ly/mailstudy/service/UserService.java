package com.ly.mailstudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.mailstudy.entity.User;

public interface UserService extends IService<User> {
    public boolean login(User user);
}
