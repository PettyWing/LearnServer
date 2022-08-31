package com.example.springyouerdemo.mapper;

import com.example.springyouerdemo.entity.SysUser;

import java.util.List;

public interface SysUserMapperCustom {
    List<SysUser> queryUserSimplyInfoById(String userId);
}
