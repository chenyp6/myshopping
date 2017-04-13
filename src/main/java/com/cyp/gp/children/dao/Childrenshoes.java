package com.cyp.gp.children.dao;

public class Childrenshoes {
    private String shoesid;

    private String shoesname;

    private Integer price;

    private String introduction;

    private Integer shoeslevel;

    public String getShoesid() {
        return shoesid;
    }

    public void setShoesid(String shoesid) {
        this.shoesid = shoesid == null ? null : shoesid.trim();
    }

    public String getShoesname() {
        return shoesname;
    }

    public void setShoesname(String shoesname) {
        this.shoesname = shoesname == null ? null : shoesname.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getShoeslevel() {
        return shoeslevel;
    }

    public void setShoeslevel(Integer shoeslevel) {
        this.shoeslevel = shoeslevel;
    }
}