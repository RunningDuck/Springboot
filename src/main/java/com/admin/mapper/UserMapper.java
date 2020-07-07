package com.admin.mapper;

import com.admin.model.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getUserById(Integer userId);
}
