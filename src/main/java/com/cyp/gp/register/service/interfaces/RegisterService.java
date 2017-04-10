package com.cyp.gp.register.service.interfaces;

import com.cyp.gp.register.dao.Users ;
/**
 * Created by admin on 2017/4/8.
 */
public interface RegisterService {
    public void AddUser(Users users) throws Exception;
    public int CheckUser(String id) throws Exception;
}
