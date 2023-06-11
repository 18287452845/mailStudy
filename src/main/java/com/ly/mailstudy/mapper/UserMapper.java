package com.ly.mailstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.mailstudy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where username=#{username}")
    public User selectById(String username);
}
