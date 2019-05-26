package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHomeExample() {
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

        public Criteria andBlogidIsNull() {
            addCriterion("BlogId is null");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNotNull() {
            addCriterion("BlogId is not null");
            return (Criteria) this;
        }

        public Criteria andBlogidEqualTo(Integer value) {
            addCriterion("BlogId =", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotEqualTo(Integer value) {
            addCriterion("BlogId <>", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThan(Integer value) {
            addCriterion("BlogId >", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BlogId >=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThan(Integer value) {
            addCriterion("BlogId <", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThanOrEqualTo(Integer value) {
            addCriterion("BlogId <=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidIn(List<Integer> values) {
            addCriterion("BlogId in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotIn(List<Integer> values) {
            addCriterion("BlogId not in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidBetween(Integer value1, Integer value2) {
            addCriterion("BlogId between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("BlogId not between", value1, value2, "blogid");
            return (Criteria) this;
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

        public Criteria andBlogtitleIsNull() {
            addCriterion("BlogTitle is null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIsNotNull() {
            addCriterion("BlogTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleEqualTo(String value) {
            addCriterion("BlogTitle =", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotEqualTo(String value) {
            addCriterion("BlogTitle <>", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThan(String value) {
            addCriterion("BlogTitle >", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThanOrEqualTo(String value) {
            addCriterion("BlogTitle >=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThan(String value) {
            addCriterion("BlogTitle <", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThanOrEqualTo(String value) {
            addCriterion("BlogTitle <=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLike(String value) {
            addCriterion("BlogTitle like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotLike(String value) {
            addCriterion("BlogTitle not like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIn(List<String> values) {
            addCriterion("BlogTitle in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotIn(List<String> values) {
            addCriterion("BlogTitle not in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleBetween(String value1, String value2) {
            addCriterion("BlogTitle between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotBetween(String value1, String value2) {
            addCriterion("BlogTitle not between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogdataIsNull() {
            addCriterion("BlogData is null");
            return (Criteria) this;
        }

        public Criteria andBlogdataIsNotNull() {
            addCriterion("BlogData is not null");
            return (Criteria) this;
        }

        public Criteria andBlogdataEqualTo(Date value) {
            addCriterionForJDBCDate("BlogData =", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataNotEqualTo(Date value) {
            addCriterionForJDBCDate("BlogData <>", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataGreaterThan(Date value) {
            addCriterionForJDBCDate("BlogData >", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BlogData >=", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataLessThan(Date value) {
            addCriterionForJDBCDate("BlogData <", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BlogData <=", value, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataIn(List<Date> values) {
            addCriterionForJDBCDate("BlogData in", values, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataNotIn(List<Date> values) {
            addCriterionForJDBCDate("BlogData not in", values, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BlogData between", value1, value2, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogdataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BlogData not between", value1, value2, "blogdata");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficIsNull() {
            addCriterion("BlogTraffic is null");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficIsNotNull() {
            addCriterion("BlogTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficEqualTo(Integer value) {
            addCriterion("BlogTraffic =", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficNotEqualTo(Integer value) {
            addCriterion("BlogTraffic <>", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficGreaterThan(Integer value) {
            addCriterion("BlogTraffic >", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("BlogTraffic >=", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficLessThan(Integer value) {
            addCriterion("BlogTraffic <", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficLessThanOrEqualTo(Integer value) {
            addCriterion("BlogTraffic <=", value, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficIn(List<Integer> values) {
            addCriterion("BlogTraffic in", values, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficNotIn(List<Integer> values) {
            addCriterion("BlogTraffic not in", values, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficBetween(Integer value1, Integer value2) {
            addCriterion("BlogTraffic between", value1, value2, "blogtraffic");
            return (Criteria) this;
        }

        public Criteria andBlogtrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("BlogTraffic not between", value1, value2, "blogtraffic");
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