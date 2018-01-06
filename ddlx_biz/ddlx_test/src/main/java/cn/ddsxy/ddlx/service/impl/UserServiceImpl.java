package cn.ddsxy.ddlx.service.impl;

import cn.ddsxy.ddlx.model.User;
import cn.ddsxy.ddlx.service.UserService;
import cn.ddsxy.ddlx.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getId(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
