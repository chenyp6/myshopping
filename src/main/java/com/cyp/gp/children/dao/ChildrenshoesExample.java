package com.cyp.gp.children.dao;

import java.util.ArrayList;
import java.util.List;

public class ChildrenshoesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChildrenshoesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShoesidIsNull() {
            addCriterion("shoesid is null");
            return (Criteria) this;
        }

        public Criteria andShoesidIsNotNull() {
            addCriterion("shoesid is not null");
            return (Criteria) this;
        }

        public Criteria andShoesidEqualTo(String value) {
            addCriterion("shoesid =", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidNotEqualTo(String value) {
            addCriterion("shoesid <>", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidGreaterThan(String value) {
            addCriterion("shoesid >", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidGreaterThanOrEqualTo(String value) {
            addCriterion("shoesid >=", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidLessThan(String value) {
            addCriterion("shoesid <", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidLessThanOrEqualTo(String value) {
            addCriterion("shoesid <=", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidLike(String value) {
            addCriterion("shoesid like", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidNotLike(String value) {
            addCriterion("shoesid not like", value, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidIn(List<String> values) {
            addCriterion("shoesid in", values, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidNotIn(List<String> values) {
            addCriterion("shoesid not in", values, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidBetween(String value1, String value2) {
            addCriterion("shoesid between", value1, value2, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesidNotBetween(String value1, String value2) {
            addCriterion("shoesid not between", value1, value2, "shoesid");
            return (Criteria) this;
        }

        public Criteria andShoesnameIsNull() {
            addCriterion("shoesname is null");
            return (Criteria) this;
        }

        public Criteria andShoesnameIsNotNull() {
            addCriterion("shoesname is not null");
            return (Criteria) this;
        }

        public Criteria andShoesnameEqualTo(String value) {
            addCriterion("shoesname =", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameNotEqualTo(String value) {
            addCriterion("shoesname <>", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameGreaterThan(String value) {
            addCriterion("shoesname >", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameGreaterThanOrEqualTo(String value) {
            addCriterion("shoesname >=", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameLessThan(String value) {
            addCriterion("shoesname <", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameLessThanOrEqualTo(String value) {
            addCriterion("shoesname <=", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameLike(String value) {
            addCriterion("shoesname like", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameNotLike(String value) {
            addCriterion("shoesname not like", value, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameIn(List<String> values) {
            addCriterion("shoesname in", values, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameNotIn(List<String> values) {
            addCriterion("shoesname not in", values, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameBetween(String value1, String value2) {
            addCriterion("shoesname between", value1, value2, "shoesname");
            return (Criteria) this;
        }

        public Criteria andShoesnameNotBetween(String value1, String value2) {
            addCriterion("shoesname not between", value1, value2, "shoesname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andShoeslevelIsNull() {
            addCriterion("shoeslevel is null");
            return (Criteria) this;
        }

        public Criteria andShoeslevelIsNotNull() {
            addCriterion("shoeslevel is not null");
            return (Criteria) this;
        }

        public Criteria andShoeslevelEqualTo(Integer value) {
            addCriterion("shoeslevel =", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelNotEqualTo(Integer value) {
            addCriterion("shoeslevel <>", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelGreaterThan(Integer value) {
            addCriterion("shoeslevel >", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoeslevel >=", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelLessThan(Integer value) {
            addCriterion("shoeslevel <", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelLessThanOrEqualTo(Integer value) {
            addCriterion("shoeslevel <=", value, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelIn(List<Integer> values) {
            addCriterion("shoeslevel in", values, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelNotIn(List<Integer> values) {
            addCriterion("shoeslevel not in", values, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelBetween(Integer value1, Integer value2) {
            addCriterion("shoeslevel between", value1, value2, "shoeslevel");
            return (Criteria) this;
        }

        public Criteria andShoeslevelNotBetween(Integer value1, Integer value2) {
            addCriterion("shoeslevel not between", value1, value2, "shoeslevel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}