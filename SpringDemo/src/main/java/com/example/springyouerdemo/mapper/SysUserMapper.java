package com.example.springyouerdemo.mapper;

import com.example.springyouerdemo.entity.SysUser;
import com.example.springyouerdemo.utils.MyMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysUserMapper extends MyMapper<SysUser> {
}