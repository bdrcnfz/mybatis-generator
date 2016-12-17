package cn.qs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QqvipCardConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QqvipCardConfigExample() {
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

        public Criteria andGiftsetIdIsNull() {
            addCriterion("giftset_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdIsNotNull() {
            addCriterion("giftset_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdEqualTo(String value) {
            addCriterion("giftset_id =", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdNotEqualTo(String value) {
            addCriterion("giftset_id <>", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdGreaterThan(String value) {
            addCriterion("giftset_id >", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdGreaterThanOrEqualTo(String value) {
            addCriterion("giftset_id >=", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdLessThan(String value) {
            addCriterion("giftset_id <", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdLessThanOrEqualTo(String value) {
            addCriterion("giftset_id <=", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdLike(String value) {
            addCriterion("giftset_id like", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdNotLike(String value) {
            addCriterion("giftset_id not like", value, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdIn(List<String> values) {
            addCriterion("giftset_id in", values, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdNotIn(List<String> values) {
            addCriterion("giftset_id not in", values, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdBetween(String value1, String value2) {
            addCriterion("giftset_id between", value1, value2, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftsetIdNotBetween(String value1, String value2) {
            addCriterion("giftset_id not between", value1, value2, "giftsetId");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNull() {
            addCriterion("gift_amount is null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNotNull() {
            addCriterion("gift_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountEqualTo(Integer value) {
            addCriterion("gift_amount =", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotEqualTo(Integer value) {
            addCriterion("gift_amount <>", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThan(Integer value) {
            addCriterion("gift_amount >", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_amount >=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThan(Integer value) {
            addCriterion("gift_amount <", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThanOrEqualTo(Integer value) {
            addCriterion("gift_amount <=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIn(List<Integer> values) {
            addCriterion("gift_amount in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotIn(List<Integer> values) {
            addCriterion("gift_amount not in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountBetween(Integer value1, Integer value2) {
            addCriterion("gift_amount between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_amount not between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftIsNull() {
            addCriterion("newuser_gift is null");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftIsNotNull() {
            addCriterion("newuser_gift is not null");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftEqualTo(String value) {
            addCriterion("newuser_gift =", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftNotEqualTo(String value) {
            addCriterion("newuser_gift <>", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftGreaterThan(String value) {
            addCriterion("newuser_gift >", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftGreaterThanOrEqualTo(String value) {
            addCriterion("newuser_gift >=", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftLessThan(String value) {
            addCriterion("newuser_gift <", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftLessThanOrEqualTo(String value) {
            addCriterion("newuser_gift <=", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftLike(String value) {
            addCriterion("newuser_gift like", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftNotLike(String value) {
            addCriterion("newuser_gift not like", value, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftIn(List<String> values) {
            addCriterion("newuser_gift in", values, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftNotIn(List<String> values) {
            addCriterion("newuser_gift not in", values, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftBetween(String value1, String value2) {
            addCriterion("newuser_gift between", value1, value2, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserGiftNotBetween(String value1, String value2) {
            addCriterion("newuser_gift not between", value1, value2, "newuserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftIsNull() {
            addCriterion("olduser_gift is null");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftIsNotNull() {
            addCriterion("olduser_gift is not null");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftEqualTo(String value) {
            addCriterion("olduser_gift =", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftNotEqualTo(String value) {
            addCriterion("olduser_gift <>", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftGreaterThan(String value) {
            addCriterion("olduser_gift >", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftGreaterThanOrEqualTo(String value) {
            addCriterion("olduser_gift >=", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftLessThan(String value) {
            addCriterion("olduser_gift <", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftLessThanOrEqualTo(String value) {
            addCriterion("olduser_gift <=", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftLike(String value) {
            addCriterion("olduser_gift like", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftNotLike(String value) {
            addCriterion("olduser_gift not like", value, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftIn(List<String> values) {
            addCriterion("olduser_gift in", values, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftNotIn(List<String> values) {
            addCriterion("olduser_gift not in", values, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftBetween(String value1, String value2) {
            addCriterion("olduser_gift between", value1, value2, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andOlduserGiftNotBetween(String value1, String value2) {
            addCriterion("olduser_gift not between", value1, value2, "olduserGift");
            return (Criteria) this;
        }

        public Criteria andNewuserCardIsNull() {
            addCriterion("newuser_card is null");
            return (Criteria) this;
        }

        public Criteria andNewuserCardIsNotNull() {
            addCriterion("newuser_card is not null");
            return (Criteria) this;
        }

        public Criteria andNewuserCardEqualTo(String value) {
            addCriterion("newuser_card =", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardNotEqualTo(String value) {
            addCriterion("newuser_card <>", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardGreaterThan(String value) {
            addCriterion("newuser_card >", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardGreaterThanOrEqualTo(String value) {
            addCriterion("newuser_card >=", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardLessThan(String value) {
            addCriterion("newuser_card <", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardLessThanOrEqualTo(String value) {
            addCriterion("newuser_card <=", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardLike(String value) {
            addCriterion("newuser_card like", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardNotLike(String value) {
            addCriterion("newuser_card not like", value, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardIn(List<String> values) {
            addCriterion("newuser_card in", values, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardNotIn(List<String> values) {
            addCriterion("newuser_card not in", values, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardBetween(String value1, String value2) {
            addCriterion("newuser_card between", value1, value2, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andNewuserCardNotBetween(String value1, String value2) {
            addCriterion("newuser_card not between", value1, value2, "newuserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardIsNull() {
            addCriterion("olduser_card is null");
            return (Criteria) this;
        }

        public Criteria andOlduserCardIsNotNull() {
            addCriterion("olduser_card is not null");
            return (Criteria) this;
        }

        public Criteria andOlduserCardEqualTo(String value) {
            addCriterion("olduser_card =", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardNotEqualTo(String value) {
            addCriterion("olduser_card <>", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardGreaterThan(String value) {
            addCriterion("olduser_card >", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardGreaterThanOrEqualTo(String value) {
            addCriterion("olduser_card >=", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardLessThan(String value) {
            addCriterion("olduser_card <", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardLessThanOrEqualTo(String value) {
            addCriterion("olduser_card <=", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardLike(String value) {
            addCriterion("olduser_card like", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardNotLike(String value) {
            addCriterion("olduser_card not like", value, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardIn(List<String> values) {
            addCriterion("olduser_card in", values, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardNotIn(List<String> values) {
            addCriterion("olduser_card not in", values, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardBetween(String value1, String value2) {
            addCriterion("olduser_card between", value1, value2, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andOlduserCardNotBetween(String value1, String value2) {
            addCriterion("olduser_card not between", value1, value2, "olduserCard");
            return (Criteria) this;
        }

        public Criteria andIsavailableIsNull() {
            addCriterion("isavailable is null");
            return (Criteria) this;
        }

        public Criteria andIsavailableIsNotNull() {
            addCriterion("isavailable is not null");
            return (Criteria) this;
        }

        public Criteria andIsavailableEqualTo(Boolean value) {
            addCriterion("isavailable =", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotEqualTo(Boolean value) {
            addCriterion("isavailable <>", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableGreaterThan(Boolean value) {
            addCriterion("isavailable >", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isavailable >=", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableLessThan(Boolean value) {
            addCriterion("isavailable <", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableLessThanOrEqualTo(Boolean value) {
            addCriterion("isavailable <=", value, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableIn(List<Boolean> values) {
            addCriterion("isavailable in", values, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotIn(List<Boolean> values) {
            addCriterion("isavailable not in", values, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableBetween(Boolean value1, Boolean value2) {
            addCriterion("isavailable between", value1, value2, "isavailable");
            return (Criteria) this;
        }

        public Criteria andIsavailableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isavailable not between", value1, value2, "isavailable");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("_timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("_timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("_timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("_timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("_timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("_timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("_timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("_timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("_timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("_timestamp not between", value1, value2, "timestamp");
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