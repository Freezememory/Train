package com.wlj.service.impl;


import com.wlj.dao.UserDao;
import com.wlj.model.User;
import com.wlj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public String  getUserName(String id ) {

        return userDao.queryById(id);
    }

       @Override
    public  void  regit(User user){
           userDao.addUser(user);
    }

        @Override
    public User login(User user) {
         return  userDao.findUserByNameAndPwd(user);
    }
}
