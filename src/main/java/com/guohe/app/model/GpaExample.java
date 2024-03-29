package com.guohe.app.model;

import java.util.ArrayList;
import java.util.List;

public class GpaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GpaExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSemester1IsNull() {
            addCriterion("semester1 is null");
            return (Criteria) this;
        }

        public Criteria andSemester1IsNotNull() {
            addCriterion("semester1 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester1EqualTo(String value) {
            addCriterion("semester1 =", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotEqualTo(String value) {
            addCriterion("semester1 <>", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1GreaterThan(String value) {
            addCriterion("semester1 >", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1GreaterThanOrEqualTo(String value) {
            addCriterion("semester1 >=", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1LessThan(String value) {
            addCriterion("semester1 <", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1LessThanOrEqualTo(String value) {
            addCriterion("semester1 <=", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1Like(String value) {
            addCriterion("semester1 like", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotLike(String value) {
            addCriterion("semester1 not like", value, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1In(List<String> values) {
            addCriterion("semester1 in", values, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotIn(List<String> values) {
            addCriterion("semester1 not in", values, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1Between(String value1, String value2) {
            addCriterion("semester1 between", value1, value2, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester1NotBetween(String value1, String value2) {
            addCriterion("semester1 not between", value1, value2, "semester1");
            return (Criteria) this;
        }

        public Criteria andSemester2IsNull() {
            addCriterion("semester2 is null");
            return (Criteria) this;
        }

        public Criteria andSemester2IsNotNull() {
            addCriterion("semester2 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester2EqualTo(String value) {
            addCriterion("semester2 =", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotEqualTo(String value) {
            addCriterion("semester2 <>", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2GreaterThan(String value) {
            addCriterion("semester2 >", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2GreaterThanOrEqualTo(String value) {
            addCriterion("semester2 >=", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2LessThan(String value) {
            addCriterion("semester2 <", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2LessThanOrEqualTo(String value) {
            addCriterion("semester2 <=", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2Like(String value) {
            addCriterion("semester2 like", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotLike(String value) {
            addCriterion("semester2 not like", value, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2In(List<String> values) {
            addCriterion("semester2 in", values, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotIn(List<String> values) {
            addCriterion("semester2 not in", values, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2Between(String value1, String value2) {
            addCriterion("semester2 between", value1, value2, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester2NotBetween(String value1, String value2) {
            addCriterion("semester2 not between", value1, value2, "semester2");
            return (Criteria) this;
        }

        public Criteria andSemester3IsNull() {
            addCriterion("semester3 is null");
            return (Criteria) this;
        }

        public Criteria andSemester3IsNotNull() {
            addCriterion("semester3 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester3EqualTo(String value) {
            addCriterion("semester3 =", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotEqualTo(String value) {
            addCriterion("semester3 <>", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3GreaterThan(String value) {
            addCriterion("semester3 >", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3GreaterThanOrEqualTo(String value) {
            addCriterion("semester3 >=", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3LessThan(String value) {
            addCriterion("semester3 <", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3LessThanOrEqualTo(String value) {
            addCriterion("semester3 <=", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3Like(String value) {
            addCriterion("semester3 like", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotLike(String value) {
            addCriterion("semester3 not like", value, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3In(List<String> values) {
            addCriterion("semester3 in", values, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotIn(List<String> values) {
            addCriterion("semester3 not in", values, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3Between(String value1, String value2) {
            addCriterion("semester3 between", value1, value2, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester3NotBetween(String value1, String value2) {
            addCriterion("semester3 not between", value1, value2, "semester3");
            return (Criteria) this;
        }

        public Criteria andSemester4IsNull() {
            addCriterion("semester4 is null");
            return (Criteria) this;
        }

        public Criteria andSemester4IsNotNull() {
            addCriterion("semester4 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester4EqualTo(String value) {
            addCriterion("semester4 =", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotEqualTo(String value) {
            addCriterion("semester4 <>", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4GreaterThan(String value) {
            addCriterion("semester4 >", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4GreaterThanOrEqualTo(String value) {
            addCriterion("semester4 >=", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4LessThan(String value) {
            addCriterion("semester4 <", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4LessThanOrEqualTo(String value) {
            addCriterion("semester4 <=", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4Like(String value) {
            addCriterion("semester4 like", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotLike(String value) {
            addCriterion("semester4 not like", value, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4In(List<String> values) {
            addCriterion("semester4 in", values, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotIn(List<String> values) {
            addCriterion("semester4 not in", values, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4Between(String value1, String value2) {
            addCriterion("semester4 between", value1, value2, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester4NotBetween(String value1, String value2) {
            addCriterion("semester4 not between", value1, value2, "semester4");
            return (Criteria) this;
        }

        public Criteria andSemester5IsNull() {
            addCriterion("semester5 is null");
            return (Criteria) this;
        }

        public Criteria andSemester5IsNotNull() {
            addCriterion("semester5 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester5EqualTo(String value) {
            addCriterion("semester5 =", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotEqualTo(String value) {
            addCriterion("semester5 <>", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5GreaterThan(String value) {
            addCriterion("semester5 >", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5GreaterThanOrEqualTo(String value) {
            addCriterion("semester5 >=", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5LessThan(String value) {
            addCriterion("semester5 <", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5LessThanOrEqualTo(String value) {
            addCriterion("semester5 <=", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5Like(String value) {
            addCriterion("semester5 like", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotLike(String value) {
            addCriterion("semester5 not like", value, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5In(List<String> values) {
            addCriterion("semester5 in", values, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotIn(List<String> values) {
            addCriterion("semester5 not in", values, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5Between(String value1, String value2) {
            addCriterion("semester5 between", value1, value2, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester5NotBetween(String value1, String value2) {
            addCriterion("semester5 not between", value1, value2, "semester5");
            return (Criteria) this;
        }

        public Criteria andSemester6IsNull() {
            addCriterion("semester6 is null");
            return (Criteria) this;
        }

        public Criteria andSemester6IsNotNull() {
            addCriterion("semester6 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester6EqualTo(String value) {
            addCriterion("semester6 =", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotEqualTo(String value) {
            addCriterion("semester6 <>", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6GreaterThan(String value) {
            addCriterion("semester6 >", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6GreaterThanOrEqualTo(String value) {
            addCriterion("semester6 >=", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6LessThan(String value) {
            addCriterion("semester6 <", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6LessThanOrEqualTo(String value) {
            addCriterion("semester6 <=", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6Like(String value) {
            addCriterion("semester6 like", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotLike(String value) {
            addCriterion("semester6 not like", value, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6In(List<String> values) {
            addCriterion("semester6 in", values, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotIn(List<String> values) {
            addCriterion("semester6 not in", values, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6Between(String value1, String value2) {
            addCriterion("semester6 between", value1, value2, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester6NotBetween(String value1, String value2) {
            addCriterion("semester6 not between", value1, value2, "semester6");
            return (Criteria) this;
        }

        public Criteria andSemester7IsNull() {
            addCriterion("semester7 is null");
            return (Criteria) this;
        }

        public Criteria andSemester7IsNotNull() {
            addCriterion("semester7 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester7EqualTo(String value) {
            addCriterion("semester7 =", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7NotEqualTo(String value) {
            addCriterion("semester7 <>", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7GreaterThan(String value) {
            addCriterion("semester7 >", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7GreaterThanOrEqualTo(String value) {
            addCriterion("semester7 >=", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7LessThan(String value) {
            addCriterion("semester7 <", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7LessThanOrEqualTo(String value) {
            addCriterion("semester7 <=", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7Like(String value) {
            addCriterion("semester7 like", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7NotLike(String value) {
            addCriterion("semester7 not like", value, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7In(List<String> values) {
            addCriterion("semester7 in", values, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7NotIn(List<String> values) {
            addCriterion("semester7 not in", values, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7Between(String value1, String value2) {
            addCriterion("semester7 between", value1, value2, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester7NotBetween(String value1, String value2) {
            addCriterion("semester7 not between", value1, value2, "semester7");
            return (Criteria) this;
        }

        public Criteria andSemester8IsNull() {
            addCriterion("semester8 is null");
            return (Criteria) this;
        }

        public Criteria andSemester8IsNotNull() {
            addCriterion("semester8 is not null");
            return (Criteria) this;
        }

        public Criteria andSemester8EqualTo(String value) {
            addCriterion("semester8 =", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8NotEqualTo(String value) {
            addCriterion("semester8 <>", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8GreaterThan(String value) {
            addCriterion("semester8 >", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8GreaterThanOrEqualTo(String value) {
            addCriterion("semester8 >=", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8LessThan(String value) {
            addCriterion("semester8 <", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8LessThanOrEqualTo(String value) {
            addCriterion("semester8 <=", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8Like(String value) {
            addCriterion("semester8 like", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8NotLike(String value) {
            addCriterion("semester8 not like", value, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8In(List<String> values) {
            addCriterion("semester8 in", values, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8NotIn(List<String> values) {
            addCriterion("semester8 not in", values, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8Between(String value1, String value2) {
            addCriterion("semester8 between", value1, value2, "semester8");
            return (Criteria) this;
        }

        public Criteria andSemester8NotBetween(String value1, String value2) {
            addCriterion("semester8 not between", value1, value2, "semester8");
            return (Criteria) this;
        }

        public Criteria andAverageIsNull() {
            addCriterion("average is null");
            return (Criteria) this;
        }

        public Criteria andAverageIsNotNull() {
            addCriterion("average is not null");
            return (Criteria) this;
        }

        public Criteria andAverageEqualTo(String value) {
            addCriterion("average =", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotEqualTo(String value) {
            addCriterion("average <>", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThan(String value) {
            addCriterion("average >", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThanOrEqualTo(String value) {
            addCriterion("average >=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThan(String value) {
            addCriterion("average <", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThanOrEqualTo(String value) {
            addCriterion("average <=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLike(String value) {
            addCriterion("average like", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotLike(String value) {
            addCriterion("average not like", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageIn(List<String> values) {
            addCriterion("average in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotIn(List<String> values) {
            addCriterion("average not in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageBetween(String value1, String value2) {
            addCriterion("average between", value1, value2, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotBetween(String value1, String value2) {
            addCriterion("average not between", value1, value2, "average");
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