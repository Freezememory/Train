package com.wlj.service;


import com.wlj.model.User;

public interface UserService {

     String getUserName(String id );

     void  regit(User user);

     User login(User user);

}
