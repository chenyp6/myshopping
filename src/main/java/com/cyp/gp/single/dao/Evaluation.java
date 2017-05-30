package com.cyp.gp.single.dao;

public class Evaluation extends EvaluationKey {
    private String evaluation;

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }
}