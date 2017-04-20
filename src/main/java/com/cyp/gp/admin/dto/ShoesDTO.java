package com.cyp.gp.admin.dto;

/**
 * Created by admin on 2017/4/19.
 */
public class ShoesDTO {
    private String shoesid;

    private String shoesname;

    private Integer price;

    private String introduction;

    private Integer shoeslevel;

    private String shoestype;

    public String getShoestype() {
        return shoestype;
    }

    public void setShoestype(String shoestype) {
        this.shoestype = shoestype;
    }

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
