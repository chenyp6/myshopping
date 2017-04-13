package com.cyp.gp.login.service.impl;

import com.cyp.gp.register.dao.Users;
import com.cyp.gp.register.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.login.service.interfaces.LoginService;
import com.cyp.gp.login.dto.UsersDTO ;

/**
 * Created by admin on 2017/4/10.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UsersMapper usersMapper;

   public int CheckUser(UsersDTO usersDTO){
       int i=0;
       Users users=usersMapper.selectByPrimaryKey(usersDTO.getUserid());
       if(users!=null&&users.getPwd().equals(usersDTO.getPwd())){
           i=1;
       }
       return i;
    }
}
