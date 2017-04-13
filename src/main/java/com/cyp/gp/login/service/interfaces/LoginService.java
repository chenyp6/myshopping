package com.cyp.gp.login.service.interfaces;

import com.cyp.gp.login.dto.UsersDTO;

/**
 * Created by admin on 2017/4/10.
 */
public interface LoginService {
    int CheckUser(UsersDTO usersDTO)throws Exception;
}
