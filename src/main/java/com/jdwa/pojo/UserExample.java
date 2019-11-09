package com.jdwa.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andTsIdIsNull() {
            addCriterion("ts_id is null");
            return (Criteria) this;
        }

        public Criteria andTsIdIsNotNull() {
            addCriterion("ts_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsIdEqualTo(Integer value) {
            addCriterion("ts_id =", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotEqualTo(Integer value) {
            addCriterion("ts_id <>", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThan(Integer value) {
            addCriterion("ts_id >", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_id >=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThan(Integer value) {
            addCriterion("ts_id <", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_id <=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdIn(List<Integer> values) {
            addCriterion("ts_id in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotIn(List<Integer> values) {
            addCriterion("ts_id not in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_id between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_id not between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaIdEqualTo(Integer value) {
            addCriterion("pa_id =", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotEqualTo(Integer value) {
            addCriterion("pa_id <>", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThan(Integer value) {
            addCriterion("pa_id >", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_id >=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThan(Integer value) {
            addCriterion("pa_id <", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThanOrEqualTo(Integer value) {
            addCriterion("pa_id <=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdIn(List<Integer> values) {
            addCriterion("pa_id in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotIn(List<Integer> values) {
            addCriterion("pa_id not in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdBetween(Integer value1, Integer value2) {
            addCriterion("pa_id between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_id not between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_id not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andClaIdIsNull() {
            addCriterion("cla_id is null");
            return (Criteria) this;
        }

        public Criteria andClaIdIsNotNull() {
            addCriterion("cla_id is not null");
            return (Criteria) this;
        }

        public Criteria andClaIdEqualTo(Integer value) {
            addCriterion("cla_id =", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotEqualTo(Integer value) {
            addCriterion("cla_id <>", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThan(Integer value) {
            addCriterion("cla_id >", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_id >=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThan(Integer value) {
            addCriterion("cla_id <", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cla_id <=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdIn(List<Integer> values) {
            addCriterion("cla_id in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotIn(List<Integer> values) {
            addCriterion("cla_id not in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdBetween(Integer value1, Integer value2) {
            addCriterion("cla_id between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_id not between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andReserve01IsNull() {
            addCriterion("reserve01 is null");
            return (Criteria) this;
        }

        public Criteria andReserve01IsNotNull() {
            addCriterion("reserve01 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve01EqualTo(String value) {
            addCriterion("reserve01 =", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01NotEqualTo(String value) {
            addCriterion("reserve01 <>", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01GreaterThan(String value) {
            addCriterion("reserve01 >", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01GreaterThanOrEqualTo(String value) {
            addCriterion("reserve01 >=", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01LessThan(String value) {
            addCriterion("reserve01 <", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01LessThanOrEqualTo(String value) {
            addCriterion("reserve01 <=", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01Like(String value) {
            addCriterion("reserve01 like", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01NotLike(String value) {
            addCriterion("reserve01 not like", value, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01In(List<String> values) {
            addCriterion("reserve01 in", values, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01NotIn(List<String> values) {
            addCriterion("reserve01 not in", values, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01Between(String value1, String value2) {
            addCriterion("reserve01 between", value1, value2, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve01NotBetween(String value1, String value2) {
            addCriterion("reserve01 not between", value1, value2, "reserve01");
            return (Criteria) this;
        }

        public Criteria andReserve02IsNull() {
            addCriterion("reserve02 is null");
            return (Criteria) this;
        }

        public Criteria andReserve02IsNotNull() {
            addCriterion("reserve02 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve02EqualTo(String value) {
            addCriterion("reserve02 =", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02NotEqualTo(String value) {
            addCriterion("reserve02 <>", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02GreaterThan(String value) {
            addCriterion("reserve02 >", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02GreaterThanOrEqualTo(String value) {
            addCriterion("reserve02 >=", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02LessThan(String value) {
            addCriterion("reserve02 <", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02LessThanOrEqualTo(String value) {
            addCriterion("reserve02 <=", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02Like(String value) {
            addCriterion("reserve02 like", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02NotLike(String value) {
            addCriterion("reserve02 not like", value, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02In(List<String> values) {
            addCriterion("reserve02 in", values, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02NotIn(List<String> values) {
            addCriterion("reserve02 not in", values, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02Between(String value1, String value2) {
            addCriterion("reserve02 between", value1, value2, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve02NotBetween(String value1, String value2) {
            addCriterion("reserve02 not between", value1, value2, "reserve02");
            return (Criteria) this;
        }

        public Criteria andReserve03IsNull() {
            addCriterion("reserve03 is null");
            return (Criteria) this;
        }

        public Criteria andReserve03IsNotNull() {
            addCriterion("reserve03 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve03EqualTo(String value) {
            addCriterion("reserve03 =", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03NotEqualTo(String value) {
            addCriterion("reserve03 <>", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03GreaterThan(String value) {
            addCriterion("reserve03 >", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03GreaterThanOrEqualTo(String value) {
            addCriterion("reserve03 >=", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03LessThan(String value) {
            addCriterion("reserve03 <", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03LessThanOrEqualTo(String value) {
            addCriterion("reserve03 <=", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03Like(String value) {
            addCriterion("reserve03 like", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03NotLike(String value) {
            addCriterion("reserve03 not like", value, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03In(List<String> values) {
            addCriterion("reserve03 in", values, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03NotIn(List<String> values) {
            addCriterion("reserve03 not in", values, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03Between(String value1, String value2) {
            addCriterion("reserve03 between", value1, value2, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve03NotBetween(String value1, String value2) {
            addCriterion("reserve03 not between", value1, value2, "reserve03");
            return (Criteria) this;
        }

        public Criteria andReserve04IsNull() {
            addCriterion("reserve04 is null");
            return (Criteria) this;
        }

        public Criteria andReserve04IsNotNull() {
            addCriterion("reserve04 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve04EqualTo(String value) {
            addCriterion("reserve04 =", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04NotEqualTo(String value) {
            addCriterion("reserve04 <>", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04GreaterThan(String value) {
            addCriterion("reserve04 >", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04GreaterThanOrEqualTo(String value) {
            addCriterion("reserve04 >=", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04LessThan(String value) {
            addCriterion("reserve04 <", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04LessThanOrEqualTo(String value) {
            addCriterion("reserve04 <=", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04Like(String value) {
            addCriterion("reserve04 like", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04NotLike(String value) {
            addCriterion("reserve04 not like", value, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04In(List<String> values) {
            addCriterion("reserve04 in", values, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04NotIn(List<String> values) {
            addCriterion("reserve04 not in", values, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04Between(String value1, String value2) {
            addCriterion("reserve04 between", value1, value2, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve04NotBetween(String value1, String value2) {
            addCriterion("reserve04 not between", value1, value2, "reserve04");
            return (Criteria) this;
        }

        public Criteria andReserve05IsNull() {
            addCriterion("reserve05 is null");
            return (Criteria) this;
        }

        public Criteria andReserve05IsNotNull() {
            addCriterion("reserve05 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve05EqualTo(String value) {
            addCriterion("reserve05 =", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05NotEqualTo(String value) {
            addCriterion("reserve05 <>", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05GreaterThan(String value) {
            addCriterion("reserve05 >", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05GreaterThanOrEqualTo(String value) {
            addCriterion("reserve05 >=", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05LessThan(String value) {
            addCriterion("reserve05 <", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05LessThanOrEqualTo(String value) {
            addCriterion("reserve05 <=", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05Like(String value) {
            addCriterion("reserve05 like", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05NotLike(String value) {
            addCriterion("reserve05 not like", value, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05In(List<String> values) {
            addCriterion("reserve05 in", values, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05NotIn(List<String> values) {
            addCriterion("reserve05 not in", values, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05Between(String value1, String value2) {
            addCriterion("reserve05 between", value1, value2, "reserve05");
            return (Criteria) this;
        }

        public Criteria andReserve05NotBetween(String value1, String value2) {
            addCriterion("reserve05 not between", value1, value2, "reserve05");
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