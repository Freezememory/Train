package com.wlj.dao;


import com.wlj.model.User;

import org.springframework.stereotype.Repository;


/**
 * 实现用户登录注册
 */

@Repository
public interface  UserDao {

      //注册用户
    void  addUser(User user);


     //通过用户名字和密码查询用户
     User findUserByNameAndPwd(User user);

    //通过ID查询名字
     String queryById(String id);


}
