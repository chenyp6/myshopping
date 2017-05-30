package com.cyp.gp.single.dto;

/**
 * Created by admin on 2017/5/5.
 */
public class EvaluationDTO {
    private String userid;

    private String shoesid;

    private String evaluation;

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

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
