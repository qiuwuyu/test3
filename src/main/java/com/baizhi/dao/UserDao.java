package com.baizhi.dao;


import com.baizhi.entity.Users;

import java.util.List;

public interface UserDao {
    //查询所有带模糊查询
    List<Users> getUser(String username);
    //修改查询
    Users getUserById(int id);
    //修改
    void updateUser(Users user);
    //添加
    void addUser(Users user);
    //删除
    void deleteUser(int[] id);
}
