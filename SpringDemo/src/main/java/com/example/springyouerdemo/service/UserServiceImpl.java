package com.example.springyouerdemo.service;

import com.example.springyouerdemo.entity.SysUser;
import com.example.springyouerdemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private SysUserMapper userMapper;
    @Override
    public void saveUser(SysUser user) throws Exception {
        userMapper.insert(user);
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
}
