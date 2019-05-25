package pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andFirstnumberIsNull() {
            addCriterion("FirstNumber is null");
            return (Criteria) this;
        }

        public Criteria andFirstnumberIsNotNull() {
            addCriterion("FirstNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnumberEqualTo(String value) {
            addCriterion("FirstNumber =", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberNotEqualTo(String value) {
            addCriterion("FirstNumber <>", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberGreaterThan(String value) {
            addCriterion("FirstNumber >", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FirstNumber >=", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberLessThan(String value) {
            addCriterion("FirstNumber <", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberLessThanOrEqualTo(String value) {
            addCriterion("FirstNumber <=", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberLike(String value) {
            addCriterion("FirstNumber like", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberNotLike(String value) {
            addCriterion("FirstNumber not like", value, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberIn(List<String> values) {
            addCriterion("FirstNumber in", values, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberNotIn(List<String> values) {
            addCriterion("FirstNumber not in", values, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberBetween(String value1, String value2) {
            addCriterion("FirstNumber between", value1, value2, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnumberNotBetween(String value1, String value2) {
            addCriterion("FirstNumber not between", value1, value2, "firstnumber");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("FirstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("FirstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("FirstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("FirstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("FirstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("FirstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("FirstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("FirstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("FirstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("FirstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("FirstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("FirstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("FirstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("FirstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andSecondnumberIsNull() {
            addCriterion("SecondNumber is null");
            return (Criteria) this;
        }

        public Criteria andSecondnumberIsNotNull() {
            addCriterion("SecondNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnumberEqualTo(String value) {
            addCriterion("SecondNumber =", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberNotEqualTo(String value) {
            addCriterion("SecondNumber <>", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberGreaterThan(String value) {
            addCriterion("SecondNumber >", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SecondNumber >=", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberLessThan(String value) {
            addCriterion("SecondNumber <", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberLessThanOrEqualTo(String value) {
            addCriterion("SecondNumber <=", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberLike(String value) {
            addCriterion("SecondNumber like", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberNotLike(String value) {
            addCriterion("SecondNumber not like", value, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberIn(List<String> values) {
            addCriterion("SecondNumber in", values, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberNotIn(List<String> values) {
            addCriterion("SecondNumber not in", values, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberBetween(String value1, String value2) {
            addCriterion("SecondNumber between", value1, value2, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnumberNotBetween(String value1, String value2) {
            addCriterion("SecondNumber not between", value1, value2, "secondnumber");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNull() {
            addCriterion("SecondName is null");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNotNull() {
            addCriterion("SecondName is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnameEqualTo(String value) {
            addCriterion("SecondName =", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotEqualTo(String value) {
            addCriterion("SecondName <>", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThan(String value) {
            addCriterion("SecondName >", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThanOrEqualTo(String value) {
            addCriterion("SecondName >=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThan(String value) {
            addCriterion("SecondName <", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThanOrEqualTo(String value) {
            addCriterion("SecondName <=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLike(String value) {
            addCriterion("SecondName like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotLike(String value) {
            addCriterion("SecondName not like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameIn(List<String> values) {
            addCriterion("SecondName in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotIn(List<String> values) {
            addCriterion("SecondName not in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameBetween(String value1, String value2) {
            addCriterion("SecondName between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotBetween(String value1, String value2) {
            addCriterion("SecondName not between", value1, value2, "secondname");
            return (Criteria) this;
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

        public Criteria andCommentContentIsNull() {
            addCriterion("Comment_Content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("Comment_Content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("Comment_Content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("Comment_Content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("Comment_Content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_Content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("Comment_Content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("Comment_Content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("Comment_Content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("Comment_Content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("Comment_Content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("Comment_Content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("Comment_Content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("Comment_Content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andFlogIsNull() {
            addCriterion("Flog is null");
            return (Criteria) this;
        }

        public Criteria andFlogIsNotNull() {
            addCriterion("Flog is not null");
            return (Criteria) this;
        }

        public Criteria andFlogEqualTo(Integer value) {
            addCriterion("Flog =", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogNotEqualTo(Integer value) {
            addCriterion("Flog <>", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogGreaterThan(Integer value) {
            addCriterion("Flog >", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flog >=", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogLessThan(Integer value) {
            addCriterion("Flog <", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogLessThanOrEqualTo(Integer value) {
            addCriterion("Flog <=", value, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogIn(List<Integer> values) {
            addCriterion("Flog in", values, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogNotIn(List<Integer> values) {
            addCriterion("Flog not in", values, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogBetween(Integer value1, Integer value2) {
            addCriterion("Flog between", value1, value2, "flog");
            return (Criteria) this;
        }

        public Criteria andFlogNotBetween(Integer value1, Integer value2) {
            addCriterion("Flog not between", value1, value2, "flog");
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