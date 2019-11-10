package com.jdwa.pojo;

import java.util.ArrayList;
import java.util.List;

public class MarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarkExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTmIsNull() {
            addCriterion("tm is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("tm is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(String value) {
            addCriterion("tm =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(String value) {
            addCriterion("tm <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(String value) {
            addCriterion("tm >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(String value) {
            addCriterion("tm >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(String value) {
            addCriterion("tm <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(String value) {
            addCriterion("tm <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLike(String value) {
            addCriterion("tm like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotLike(String value) {
            addCriterion("tm not like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<String> values) {
            addCriterion("tm in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<String> values) {
            addCriterion("tm not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(String value1, String value2) {
            addCriterion("tm between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(String value1, String value2) {
            addCriterion("tm not between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNull() {
            addCriterion("exam_name is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("exam_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("exam_name =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("exam_name <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("exam_name >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_name >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("exam_name <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("exam_name <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("exam_name like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("exam_name not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("exam_name in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("exam_name not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("exam_name between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("exam_name not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andChineseIsNull() {
            addCriterion("chinese is null");
            return (Criteria) this;
        }

        public Criteria andChineseIsNotNull() {
            addCriterion("chinese is not null");
            return (Criteria) this;
        }

        public Criteria andChineseEqualTo(Integer value) {
            addCriterion("chinese =", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotEqualTo(Integer value) {
            addCriterion("chinese <>", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThan(Integer value) {
            addCriterion("chinese >", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThanOrEqualTo(Integer value) {
            addCriterion("chinese >=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThan(Integer value) {
            addCriterion("chinese <", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThanOrEqualTo(Integer value) {
            addCriterion("chinese <=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseIn(List<Integer> values) {
            addCriterion("chinese in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotIn(List<Integer> values) {
            addCriterion("chinese not in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseBetween(Integer value1, Integer value2) {
            addCriterion("chinese between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotBetween(Integer value1, Integer value2) {
            addCriterion("chinese not between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andMathIsNull() {
            addCriterion("math is null");
            return (Criteria) this;
        }

        public Criteria andMathIsNotNull() {
            addCriterion("math is not null");
            return (Criteria) this;
        }

        public Criteria andMathEqualTo(Integer value) {
            addCriterion("math =", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotEqualTo(Integer value) {
            addCriterion("math <>", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThan(Integer value) {
            addCriterion("math >", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThanOrEqualTo(Integer value) {
            addCriterion("math >=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThan(Integer value) {
            addCriterion("math <", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThanOrEqualTo(Integer value) {
            addCriterion("math <=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathIn(List<Integer> values) {
            addCriterion("math in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotIn(List<Integer> values) {
            addCriterion("math not in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathBetween(Integer value1, Integer value2) {
            addCriterion("math between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotBetween(Integer value1, Integer value2) {
            addCriterion("math not between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("politics is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("politics is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(Integer value) {
            addCriterion("politics =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(Integer value) {
            addCriterion("politics <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(Integer value) {
            addCriterion("politics >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(Integer value) {
            addCriterion("politics >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(Integer value) {
            addCriterion("politics <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(Integer value) {
            addCriterion("politics <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<Integer> values) {
            addCriterion("politics in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<Integer> values) {
            addCriterion("politics not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(Integer value1, Integer value2) {
            addCriterion("politics between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(Integer value1, Integer value2) {
            addCriterion("politics not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("history is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("history is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(Integer value) {
            addCriterion("history =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(Integer value) {
            addCriterion("history <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(Integer value) {
            addCriterion("history >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("history >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(Integer value) {
            addCriterion("history <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(Integer value) {
            addCriterion("history <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<Integer> values) {
            addCriterion("history in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<Integer> values) {
            addCriterion("history not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(Integer value1, Integer value2) {
            addCriterion("history between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(Integer value1, Integer value2) {
            addCriterion("history not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andGeographyIsNull() {
            addCriterion("geography is null");
            return (Criteria) this;
        }

        public Criteria andGeographyIsNotNull() {
            addCriterion("geography is not null");
            return (Criteria) this;
        }

        public Criteria andGeographyEqualTo(Integer value) {
            addCriterion("geography =", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotEqualTo(Integer value) {
            addCriterion("geography <>", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyGreaterThan(Integer value) {
            addCriterion("geography >", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyGreaterThanOrEqualTo(Integer value) {
            addCriterion("geography >=", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyLessThan(Integer value) {
            addCriterion("geography <", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyLessThanOrEqualTo(Integer value) {
            addCriterion("geography <=", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyIn(List<Integer> values) {
            addCriterion("geography in", values, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotIn(List<Integer> values) {
            addCriterion("geography not in", values, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyBetween(Integer value1, Integer value2) {
            addCriterion("geography between", value1, value2, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotBetween(Integer value1, Integer value2) {
            addCriterion("geography not between", value1, value2, "geography");
            return (Criteria) this;
        }

        public Criteria andPhysicIsNull() {
            addCriterion("physic is null");
            return (Criteria) this;
        }

        public Criteria andPhysicIsNotNull() {
            addCriterion("physic is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicEqualTo(Integer value) {
            addCriterion("physic =", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicNotEqualTo(Integer value) {
            addCriterion("physic <>", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicGreaterThan(Integer value) {
            addCriterion("physic >", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicGreaterThanOrEqualTo(Integer value) {
            addCriterion("physic >=", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicLessThan(Integer value) {
            addCriterion("physic <", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicLessThanOrEqualTo(Integer value) {
            addCriterion("physic <=", value, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicIn(List<Integer> values) {
            addCriterion("physic in", values, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicNotIn(List<Integer> values) {
            addCriterion("physic not in", values, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicBetween(Integer value1, Integer value2) {
            addCriterion("physic between", value1, value2, "physic");
            return (Criteria) this;
        }

        public Criteria andPhysicNotBetween(Integer value1, Integer value2) {
            addCriterion("physic not between", value1, value2, "physic");
            return (Criteria) this;
        }

        public Criteria andChemistryIsNull() {
            addCriterion("chemistry is null");
            return (Criteria) this;
        }

        public Criteria andChemistryIsNotNull() {
            addCriterion("chemistry is not null");
            return (Criteria) this;
        }

        public Criteria andChemistryEqualTo(Integer value) {
            addCriterion("chemistry =", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotEqualTo(Integer value) {
            addCriterion("chemistry <>", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryGreaterThan(Integer value) {
            addCriterion("chemistry >", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryGreaterThanOrEqualTo(Integer value) {
            addCriterion("chemistry >=", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryLessThan(Integer value) {
            addCriterion("chemistry <", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryLessThanOrEqualTo(Integer value) {
            addCriterion("chemistry <=", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryIn(List<Integer> values) {
            addCriterion("chemistry in", values, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotIn(List<Integer> values) {
            addCriterion("chemistry not in", values, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryBetween(Integer value1, Integer value2) {
            addCriterion("chemistry between", value1, value2, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotBetween(Integer value1, Integer value2) {
            addCriterion("chemistry not between", value1, value2, "chemistry");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNull() {
            addCriterion("biology is null");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNotNull() {
            addCriterion("biology is not null");
            return (Criteria) this;
        }

        public Criteria andBiologyEqualTo(Integer value) {
            addCriterion("biology =", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotEqualTo(Integer value) {
            addCriterion("biology <>", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThan(Integer value) {
            addCriterion("biology >", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThanOrEqualTo(Integer value) {
            addCriterion("biology >=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThan(Integer value) {
            addCriterion("biology <", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThanOrEqualTo(Integer value) {
            addCriterion("biology <=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyIn(List<Integer> values) {
            addCriterion("biology in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotIn(List<Integer> values) {
            addCriterion("biology not in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyBetween(Integer value1, Integer value2) {
            addCriterion("biology between", value1, value2, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotBetween(Integer value1, Integer value2) {
            addCriterion("biology not between", value1, value2, "biology");
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