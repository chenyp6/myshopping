package com.cyp.gp.login.service.impl;

import com.cyp.gp.register.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.login.service.interfaces.LoginService;
/**
 * Created by admin on 2017/4/10.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UsersMapper usersMapper;

   public int CheckUser(String userid){
       int i=0;
       if(usersMapper.selectByPrimaryKey(userid)!=null){
           i=1;
       }
       return i;
    }
}
