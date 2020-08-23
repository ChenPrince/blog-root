package com.zerodg.serviceImpl.service;

import com.zerodg.vwentity.entity.User;

public interface LoginService {
    User login(String userName, String userPassword);


    Integer regist(String userName, String userPassword, String email);
}
