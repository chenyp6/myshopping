package com.cyp.gp.admin.dto;

/**
 * Created by admin on 2017/4/26.
 */
public class AdminDTO {
    private String userid;

    private String pwd;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}
