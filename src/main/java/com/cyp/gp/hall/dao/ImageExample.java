package com.cyp.gp.hall.dao;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageidIsNull() {
            addCriterion("imageid is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageid is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(String value) {
            addCriterion("imageid =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(String value) {
            addCriterion("imageid <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(String value) {
            addCriterion("imageid >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(String value) {
            addCriterion("imageid >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(String value) {
            addCriterion("imageid <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(String value) {
            addCriterion("imageid <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLike(String value) {
            addCriterion("imageid like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotLike(String value) {
            addCriterion("imageid not like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<String> values) {
            addCriterion("imageid in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<String> values) {
            addCriterion("imageid not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(String value1, String value2) {
            addCriterion("imageid between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(String value1, String value2) {
            addCriterion("imageid not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageshowIsNull() {
            addCriterion("imageshow is null");
            return (Criteria) this;
        }

        public Criteria andImageshowIsNotNull() {
            addCriterion("imageshow is not null");
            return (Criteria) this;
        }

        public Criteria andImageshowEqualTo(String value) {
            addCriterion("imageshow =", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowNotEqualTo(String value) {
            addCriterion("imageshow <>", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowGreaterThan(String value) {
            addCriterion("imageshow >", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowGreaterThanOrEqualTo(String value) {
            addCriterion("imageshow >=", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowLessThan(String value) {
            addCriterion("imageshow <", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowLessThanOrEqualTo(String value) {
            addCriterion("imageshow <=", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowLike(String value) {
            addCriterion("imageshow like", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowNotLike(String value) {
            addCriterion("imageshow not like", value, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowIn(List<String> values) {
            addCriterion("imageshow in", values, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowNotIn(List<String> values) {
            addCriterion("imageshow not in", values, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowBetween(String value1, String value2) {
            addCriterion("imageshow between", value1, value2, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshowNotBetween(String value1, String value2) {
            addCriterion("imageshow not between", value1, value2, "imageshow");
            return (Criteria) this;
        }

        public Criteria andImageshow1IsNull() {
            addCriterion("imageshow1 is null");
            return (Criteria) this;
        }

        public Criteria andImageshow1IsNotNull() {
            addCriterion("imageshow1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageshow1EqualTo(String value) {
            addCriterion("imageshow1 =", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1NotEqualTo(String value) {
            addCriterion("imageshow1 <>", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1GreaterThan(String value) {
            addCriterion("imageshow1 >", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1GreaterThanOrEqualTo(String value) {
            addCriterion("imageshow1 >=", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1LessThan(String value) {
            addCriterion("imageshow1 <", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1LessThanOrEqualTo(String value) {
            addCriterion("imageshow1 <=", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1Like(String value) {
            addCriterion("imageshow1 like", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1NotLike(String value) {
            addCriterion("imageshow1 not like", value, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1In(List<String> values) {
            addCriterion("imageshow1 in", values, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1NotIn(List<String> values) {
            addCriterion("imageshow1 not in", values, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1Between(String value1, String value2) {
            addCriterion("imageshow1 between", value1, value2, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow1NotBetween(String value1, String value2) {
            addCriterion("imageshow1 not between", value1, value2, "imageshow1");
            return (Criteria) this;
        }

        public Criteria andImageshow2IsNull() {
            addCriterion("imageshow2 is null");
            return (Criteria) this;
        }

        public Criteria andImageshow2IsNotNull() {
            addCriterion("imageshow2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageshow2EqualTo(String value) {
            addCriterion("imageshow2 =", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2NotEqualTo(String value) {
            addCriterion("imageshow2 <>", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2GreaterThan(String value) {
            addCriterion("imageshow2 >", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2GreaterThanOrEqualTo(String value) {
            addCriterion("imageshow2 >=", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2LessThan(String value) {
            addCriterion("imageshow2 <", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2LessThanOrEqualTo(String value) {
            addCriterion("imageshow2 <=", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2Like(String value) {
            addCriterion("imageshow2 like", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2NotLike(String value) {
            addCriterion("imageshow2 not like", value, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2In(List<String> values) {
            addCriterion("imageshow2 in", values, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2NotIn(List<String> values) {
            addCriterion("imageshow2 not in", values, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2Between(String value1, String value2) {
            addCriterion("imageshow2 between", value1, value2, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow2NotBetween(String value1, String value2) {
            addCriterion("imageshow2 not between", value1, value2, "imageshow2");
            return (Criteria) this;
        }

        public Criteria andImageshow3IsNull() {
            addCriterion("imageshow3 is null");
            return (Criteria) this;
        }

        public Criteria andImageshow3IsNotNull() {
            addCriterion("imageshow3 is not null");
            return (Criteria) this;
        }

        public Criteria andImageshow3EqualTo(String value) {
            addCriterion("imageshow3 =", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3NotEqualTo(String value) {
            addCriterion("imageshow3 <>", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3GreaterThan(String value) {
            addCriterion("imageshow3 >", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3GreaterThanOrEqualTo(String value) {
            addCriterion("imageshow3 >=", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3LessThan(String value) {
            addCriterion("imageshow3 <", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3LessThanOrEqualTo(String value) {
            addCriterion("imageshow3 <=", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3Like(String value) {
            addCriterion("imageshow3 like", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3NotLike(String value) {
            addCriterion("imageshow3 not like", value, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3In(List<String> values) {
            addCriterion("imageshow3 in", values, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3NotIn(List<String> values) {
            addCriterion("imageshow3 not in", values, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3Between(String value1, String value2) {
            addCriterion("imageshow3 between", value1, value2, "imageshow3");
            return (Criteria) this;
        }

        public Criteria andImageshow3NotBetween(String value1, String value2) {
            addCriterion("imageshow3 not between", value1, value2, "imageshow3");
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