package com.cyp.gp.hall.dao;

public class Image {
    private String imageid;

    private String imageshow;

    private String imageshow1;

    private String imageshow2;

    private String imageshow3;

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid == null ? null : imageid.trim();
    }

    public String getImageshow() {
        return imageshow;
    }

    public void setImageshow(String imageshow) {
        this.imageshow = imageshow == null ? null : imageshow.trim();
    }

    public String getImageshow1() {
        return imageshow1;
    }

    public void setImageshow1(String imageshow1) {
        this.imageshow1 = imageshow1 == null ? null : imageshow1.trim();
    }

    public String getImageshow2() {
        return imageshow2;
    }

    public void setImageshow2(String imageshow2) {
        this.imageshow2 = imageshow2 == null ? null : imageshow2.trim();
    }

    public String getImageshow3() {
        return imageshow3;
    }

    public void setImageshow3(String imageshow3) {
        this.imageshow3 = imageshow3 == null ? null : imageshow3.trim();
    }
}