package com.example.springyouerdemo.mapper2;

import com.example.springyouerdemo.entity2.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Delete({
        "delete from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_user (id, username, ",
        "password, nickname, ",
        "age, sex, job, ",
        "face_image, province, ",
        "city, district, ",
        "address, auth_salt, ",
        "last_login_ip, last_login_time, ",
        "is_delete, regist_time)",
        "values (#{id,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER}, #{sex,jdbcType=INTEGER}, #{job,jdbcType=INTEGER}, ",
        "#{faceImage,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{district,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{authSalt,jdbcType=VARCHAR}, ",
        "#{lastLoginIp,jdbcType=VARCHAR}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{isDelete,jdbcType=INTEGER}, #{registTime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, username, password, nickname, age, sex, job, face_image, province, city, ",
        "district, address, auth_salt, last_login_ip, last_login_time, is_delete, regist_time",
        "from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="job", property="job", jdbcType=JdbcType.INTEGER),
        @Result(column="face_image", property="faceImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="auth_salt", property="authSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="regist_time", property="registTime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(String id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update sys_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=INTEGER},",
          "job = #{job,jdbcType=INTEGER},",
          "face_image = #{faceImage,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "auth_salt = #{authSalt,jdbcType=VARCHAR},",
          "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "is_delete = #{isDelete,jdbcType=INTEGER},",
          "regist_time = #{registTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}