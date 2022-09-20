package com.example.springyouerdemo.service;

import com.example.springyouerdemo.entity.SysUser;
import com.example.springyouerdemo.entity2.User;
import com.example.springyouerdemo.mapper.SysUserMapper;
import com.example.springyouerdemo.mapper.SysUserMapperCustom;
import com.example.springyouerdemo.mapper2.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private UserMapper userMapper2;
    @Autowired
    private SysUserMapperCustom userMapperCustom;

    @Override
    public void saveUser(SysUser user) throws Exception {
        userMapper.insert(user);
    }

    @Override
    public void saveUser2(User user) throws Exception {
        userMapper2.insert(user);
    }

    @Override
    public void updateUser(SysUser user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUser(String userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public SysUser queryUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> queryUserList(SysUser user) {
        return null;
    }

    @Override
    public void saveUserTransactional(SysUser user) {
    }

    @Override
    public SysUser queryUserByIdCustom(String userId) {
        List<SysUser> userList = userMapperCustom.queryUserSimplyInfoById(userId);
        if (userList != null && !userList.isEmpty()) {
            return userList.get(0);
        }
        return null;
    }
}
