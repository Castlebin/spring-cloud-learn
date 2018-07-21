package com.heller.spring.mapper;

import com.heller.spring.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, email) VALUES(#{name}, #{email})")
    int insert(@Param("name") String name, @Param("email") String email);

    @Select("SELECT * FROM user WHERE id = ${id}")
    User findById(@Param("id") Long id);

    @Select("SELECT * FROM user WHERE name = #{name}")
    List<User> findByName(@Param("name") String name);

}
