package com.cyp.gp.register.service.impl;

import com.cyp.gp.register.service.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyp.gp.register.dao.Users;
import com.cyp.gp.register.mapper.UsersMapper;

/**
 * Created by admin on 2017/4/8.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private UsersMapper usersMapper;
    public void AddUser(Users users) {
        usersMapper.insert(users);
    }
    public int CheckUser(String id){
        Users users=usersMapper.selectByPrimaryKey(id);
        if (users!=null){
            return 1;
        }
        else {
            return 0;
        }
    }
}
