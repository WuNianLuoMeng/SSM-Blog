package pojo;

import java.util.ArrayList;
import java.util.List;

public class TbFansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFansExample() {
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

        public Criteria andRecordidIsNull() {
            addCriterion("RecordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("RecordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(Integer value) {
            addCriterion("RecordId =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(Integer value) {
            addCriterion("RecordId <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(Integer value) {
            addCriterion("RecordId >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecordId >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(Integer value) {
            addCriterion("RecordId <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(Integer value) {
            addCriterion("RecordId <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<Integer> values) {
            addCriterion("RecordId in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<Integer> values) {
            addCriterion("RecordId not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(Integer value1, Integer value2) {
            addCriterion("RecordId between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("RecordId not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberIsNull() {
            addCriterion("Front_UserNumber is null");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberIsNotNull() {
            addCriterion("Front_UserNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberEqualTo(String value) {
            addCriterion("Front_UserNumber =", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberNotEqualTo(String value) {
            addCriterion("Front_UserNumber <>", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberGreaterThan(String value) {
            addCriterion("Front_UserNumber >", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("Front_UserNumber >=", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberLessThan(String value) {
            addCriterion("Front_UserNumber <", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberLessThanOrEqualTo(String value) {
            addCriterion("Front_UserNumber <=", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberLike(String value) {
            addCriterion("Front_UserNumber like", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberNotLike(String value) {
            addCriterion("Front_UserNumber not like", value, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberIn(List<String> values) {
            addCriterion("Front_UserNumber in", values, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberNotIn(List<String> values) {
            addCriterion("Front_UserNumber not in", values, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberBetween(String value1, String value2) {
            addCriterion("Front_UserNumber between", value1, value2, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernumberNotBetween(String value1, String value2) {
            addCriterion("Front_UserNumber not between", value1, value2, "frontUsernumber");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameIsNull() {
            addCriterion("Front_UserName is null");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameIsNotNull() {
            addCriterion("Front_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameEqualTo(String value) {
            addCriterion("Front_UserName =", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameNotEqualTo(String value) {
            addCriterion("Front_UserName <>", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameGreaterThan(String value) {
            addCriterion("Front_UserName >", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Front_UserName >=", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameLessThan(String value) {
            addCriterion("Front_UserName <", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameLessThanOrEqualTo(String value) {
            addCriterion("Front_UserName <=", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameLike(String value) {
            addCriterion("Front_UserName like", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameNotLike(String value) {
            addCriterion("Front_UserName not like", value, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameIn(List<String> values) {
            addCriterion("Front_UserName in", values, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameNotIn(List<String> values) {
            addCriterion("Front_UserName not in", values, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameBetween(String value1, String value2) {
            addCriterion("Front_UserName between", value1, value2, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andFrontUsernameNotBetween(String value1, String value2) {
            addCriterion("Front_UserName not between", value1, value2, "frontUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberIsNull() {
            addCriterion("Last_UserNumber is null");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberIsNotNull() {
            addCriterion("Last_UserNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberEqualTo(String value) {
            addCriterion("Last_UserNumber =", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberNotEqualTo(String value) {
            addCriterion("Last_UserNumber <>", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberGreaterThan(String value) {
            addCriterion("Last_UserNumber >", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("Last_UserNumber >=", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberLessThan(String value) {
            addCriterion("Last_UserNumber <", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberLessThanOrEqualTo(String value) {
            addCriterion("Last_UserNumber <=", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberLike(String value) {
            addCriterion("Last_UserNumber like", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberNotLike(String value) {
            addCriterion("Last_UserNumber not like", value, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberIn(List<String> values) {
            addCriterion("Last_UserNumber in", values, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberNotIn(List<String> values) {
            addCriterion("Last_UserNumber not in", values, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberBetween(String value1, String value2) {
            addCriterion("Last_UserNumber between", value1, value2, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernumberNotBetween(String value1, String value2) {
            addCriterion("Last_UserNumber not between", value1, value2, "lastUsernumber");
            return (Criteria) this;
        }

        public Criteria andLastUsernameIsNull() {
            addCriterion("Last_UserName is null");
            return (Criteria) this;
        }

        public Criteria andLastUsernameIsNotNull() {
            addCriterion("Last_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andLastUsernameEqualTo(String value) {
            addCriterion("Last_UserName =", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameNotEqualTo(String value) {
            addCriterion("Last_UserName <>", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameGreaterThan(String value) {
            addCriterion("Last_UserName >", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Last_UserName >=", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameLessThan(String value) {
            addCriterion("Last_UserName <", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameLessThanOrEqualTo(String value) {
            addCriterion("Last_UserName <=", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameLike(String value) {
            addCriterion("Last_UserName like", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameNotLike(String value) {
            addCriterion("Last_UserName not like", value, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameIn(List<String> values) {
            addCriterion("Last_UserName in", values, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameNotIn(List<String> values) {
            addCriterion("Last_UserName not in", values, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameBetween(String value1, String value2) {
            addCriterion("Last_UserName between", value1, value2, "lastUsername");
            return (Criteria) this;
        }

        public Criteria andLastUsernameNotBetween(String value1, String value2) {
            addCriterion("Last_UserName not between", value1, value2, "lastUsername");
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