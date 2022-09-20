package com.example.springyouerdemo.service;

import com.example.springyouerdemo.entity.SysUser;
import com.example.springyouerdemo.entity2.User;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserService {
    public void saveUser(SysUser user) throws Exception;

    public void saveUser2(User user) throws Exception;

    public void updateUser(SysUser user);

    public void deleteUser(String userId);

    public SysUser queryUserById(String userId);

    public List<SysUser> queryUserList(SysUser user);

    public void saveUserTransactional(SysUser user);

    public SysUser queryUserByIdCustom(String userId);
}
