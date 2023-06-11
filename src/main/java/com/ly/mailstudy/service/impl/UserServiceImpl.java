package com.ly.mailstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.mailstudy.entity.User;
import com.ly.mailstudy.mapper.UserMapper;
import com.ly.mailstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
@Autowired UserMapper userMapper;
    @Override
    public boolean login(User user) {
        User user1 = userMapper.selectById(user.getUsername());
        if (user1!=null){
            if (user.getUsername().equals(user1.getUsername())&&user.getPassword().equals(user1.getPassword())){
                return true;
            }
        }

        return false;
    }

    public User addRole(User user,String role){
        user.setRoles(user.getRoles()+","+role);
        return user;
    }

    public List<String> getRoles(User user){
        String roles=user.getRoles();
        String[] split = roles.split(",");
        List<String> roleList= Arrays.asList(split);
        return roleList;
    }

}
