package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNull() {
            addCriterion("user_1_id is null");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNotNull() {
            addCriterion("user_1_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser1IdEqualTo(Integer value) {
            addCriterion("user_1_id =", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotEqualTo(Integer value) {
            addCriterion("user_1_id <>", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThan(Integer value) {
            addCriterion("user_1_id >", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_1_id >=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThan(Integer value) {
            addCriterion("user_1_id <", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThanOrEqualTo(Integer value) {
            addCriterion("user_1_id <=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIn(List<Integer> values) {
            addCriterion("user_1_id in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotIn(List<Integer> values) {
            addCriterion("user_1_id not in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdBetween(Integer value1, Integer value2) {
            addCriterion("user_1_id between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_1_id not between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNull() {
            addCriterion("user_2_id is null");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNotNull() {
            addCriterion("user_2_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser2IdEqualTo(Integer value) {
            addCriterion("user_2_id =", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotEqualTo(Integer value) {
            addCriterion("user_2_id <>", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThan(Integer value) {
            addCriterion("user_2_id >", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_2_id >=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThan(Integer value) {
            addCriterion("user_2_id <", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThanOrEqualTo(Integer value) {
            addCriterion("user_2_id <=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIn(List<Integer> values) {
            addCriterion("user_2_id in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotIn(List<Integer> values) {
            addCriterion("user_2_id not in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdBetween(Integer value1, Integer value2) {
            addCriterion("user_2_id between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_2_id not between", value1, value2, "user2Id");
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