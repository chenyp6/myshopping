package com.cyp.gp.single.dao;

public class EvaluationKey {
    private String userid;

    private String shoesid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getShoesid() {
        return shoesid;
    }

    public void setShoesid(String shoesid) {
        this.shoesid = shoesid == null ? null : shoesid.trim();
    }
}