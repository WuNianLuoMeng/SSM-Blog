package pojo;

import java.util.ArrayList;
import java.util.List;

public class TbBloguserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBloguserExample() {
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

        public Criteria andBlogusernumberIsNull() {
            addCriterion("BlogUserNumber is null");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberIsNotNull() {
            addCriterion("BlogUserNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberEqualTo(String value) {
            addCriterion("BlogUserNumber =", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberNotEqualTo(String value) {
            addCriterion("BlogUserNumber <>", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberGreaterThan(String value) {
            addCriterion("BlogUserNumber >", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberGreaterThanOrEqualTo(String value) {
            addCriterion("BlogUserNumber >=", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberLessThan(String value) {
            addCriterion("BlogUserNumber <", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberLessThanOrEqualTo(String value) {
            addCriterion("BlogUserNumber <=", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberLike(String value) {
            addCriterion("BlogUserNumber like", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberNotLike(String value) {
            addCriterion("BlogUserNumber not like", value, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberIn(List<String> values) {
            addCriterion("BlogUserNumber in", values, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberNotIn(List<String> values) {
            addCriterion("BlogUserNumber not in", values, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberBetween(String value1, String value2) {
            addCriterion("BlogUserNumber between", value1, value2, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernumberNotBetween(String value1, String value2) {
            addCriterion("BlogUserNumber not between", value1, value2, "blogusernumber");
            return (Criteria) this;
        }

        public Criteria andBlogusernameIsNull() {
            addCriterion("BlogUserName is null");
            return (Criteria) this;
        }

        public Criteria andBlogusernameIsNotNull() {
            addCriterion("BlogUserName is not null");
            return (Criteria) this;
        }

        public Criteria andBlogusernameEqualTo(String value) {
            addCriterion("BlogUserName =", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameNotEqualTo(String value) {
            addCriterion("BlogUserName <>", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameGreaterThan(String value) {
            addCriterion("BlogUserName >", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameGreaterThanOrEqualTo(String value) {
            addCriterion("BlogUserName >=", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameLessThan(String value) {
            addCriterion("BlogUserName <", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameLessThanOrEqualTo(String value) {
            addCriterion("BlogUserName <=", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameLike(String value) {
            addCriterion("BlogUserName like", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameNotLike(String value) {
            addCriterion("BlogUserName not like", value, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameIn(List<String> values) {
            addCriterion("BlogUserName in", values, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameNotIn(List<String> values) {
            addCriterion("BlogUserName not in", values, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameBetween(String value1, String value2) {
            addCriterion("BlogUserName between", value1, value2, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBlogusernameNotBetween(String value1, String value2) {
            addCriterion("BlogUserName not between", value1, value2, "blogusername");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordIsNull() {
            addCriterion("BlogUserPassWord is null");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordIsNotNull() {
            addCriterion("BlogUserPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordEqualTo(String value) {
            addCriterion("BlogUserPassWord =", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordNotEqualTo(String value) {
            addCriterion("BlogUserPassWord <>", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordGreaterThan(String value) {
            addCriterion("BlogUserPassWord >", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("BlogUserPassWord >=", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordLessThan(String value) {
            addCriterion("BlogUserPassWord <", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordLessThanOrEqualTo(String value) {
            addCriterion("BlogUserPassWord <=", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordLike(String value) {
            addCriterion("BlogUserPassWord like", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordNotLike(String value) {
            addCriterion("BlogUserPassWord not like", value, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordIn(List<String> values) {
            addCriterion("BlogUserPassWord in", values, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordNotIn(List<String> values) {
            addCriterion("BlogUserPassWord not in", values, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordBetween(String value1, String value2) {
            addCriterion("BlogUserPassWord between", value1, value2, "bloguserpassword");
            return (Criteria) this;
        }

        public Criteria andBloguserpasswordNotBetween(String value1, String value2) {
            addCriterion("BlogUserPassWord not between", value1, value2, "bloguserpassword");
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