package com.wmx.jr.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DepartmentInfoVoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentInfoVoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdIsNull() {
            addCriterion("super_department_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdIsNotNull() {
            addCriterion("super_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdEqualTo(String value) {
            addCriterion("super_department_id =", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdNotEqualTo(String value) {
            addCriterion("super_department_id <>", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdGreaterThan(String value) {
            addCriterion("super_department_id >", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("super_department_id >=", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdLessThan(String value) {
            addCriterion("super_department_id <", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("super_department_id <=", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdLike(String value) {
            addCriterion("super_department_id like", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdNotLike(String value) {
            addCriterion("super_department_id not like", value, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdIn(List<String> values) {
            addCriterion("super_department_id in", values, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdNotIn(List<String> values) {
            addCriterion("super_department_id not in", values, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdBetween(String value1, String value2) {
            addCriterion("super_department_id between", value1, value2, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSuperDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("super_department_id not between", value1, value2, "superDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateProperIsNull() {
            addCriterion("create_proper is null");
            return (Criteria) this;
        }

        public Criteria andCreateProperIsNotNull() {
            addCriterion("create_proper is not null");
            return (Criteria) this;
        }

        public Criteria andCreateProperEqualTo(String value) {
            addCriterion("create_proper =", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperNotEqualTo(String value) {
            addCriterion("create_proper <>", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperGreaterThan(String value) {
            addCriterion("create_proper >", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperGreaterThanOrEqualTo(String value) {
            addCriterion("create_proper >=", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperLessThan(String value) {
            addCriterion("create_proper <", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperLessThanOrEqualTo(String value) {
            addCriterion("create_proper <=", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperLike(String value) {
            addCriterion("create_proper like", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperNotLike(String value) {
            addCriterion("create_proper not like", value, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperIn(List<String> values) {
            addCriterion("create_proper in", values, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperNotIn(List<String> values) {
            addCriterion("create_proper not in", values, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperBetween(String value1, String value2) {
            addCriterion("create_proper between", value1, value2, "createProper");
            return (Criteria) this;
        }

        public Criteria andCreateProperNotBetween(String value1, String value2) {
            addCriterion("create_proper not between", value1, value2, "createProper");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateProperIsNull() {
            addCriterion("update_proper is null");
            return (Criteria) this;
        }

        public Criteria andUpdateProperIsNotNull() {
            addCriterion("update_proper is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateProperEqualTo(String value) {
            addCriterion("update_proper =", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperNotEqualTo(String value) {
            addCriterion("update_proper <>", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperGreaterThan(String value) {
            addCriterion("update_proper >", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperGreaterThanOrEqualTo(String value) {
            addCriterion("update_proper >=", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperLessThan(String value) {
            addCriterion("update_proper <", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperLessThanOrEqualTo(String value) {
            addCriterion("update_proper <=", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperLike(String value) {
            addCriterion("update_proper like", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperNotLike(String value) {
            addCriterion("update_proper not like", value, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperIn(List<String> values) {
            addCriterion("update_proper in", values, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperNotIn(List<String> values) {
            addCriterion("update_proper not in", values, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperBetween(String value1, String value2) {
            addCriterion("update_proper between", value1, value2, "updateProper");
            return (Criteria) this;
        }

        public Criteria andUpdateProperNotBetween(String value1, String value2) {
            addCriterion("update_proper not between", value1, value2, "updateProper");
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