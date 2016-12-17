package cn.qs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QqvipCardDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QqvipCardDataExample() {
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

        public Criteria andBonusValueIsNull() {
            addCriterion("bonus_value is null");
            return (Criteria) this;
        }

        public Criteria andBonusValueIsNotNull() {
            addCriterion("bonus_value is not null");
            return (Criteria) this;
        }

        public Criteria andBonusValueEqualTo(Integer value) {
            addCriterion("bonus_value =", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueNotEqualTo(Integer value) {
            addCriterion("bonus_value <>", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueGreaterThan(Integer value) {
            addCriterion("bonus_value >", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_value >=", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueLessThan(Integer value) {
            addCriterion("bonus_value <", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_value <=", value, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueIn(List<Integer> values) {
            addCriterion("bonus_value in", values, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueNotIn(List<Integer> values) {
            addCriterion("bonus_value not in", values, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueBetween(Integer value1, Integer value2) {
            addCriterion("bonus_value between", value1, value2, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andBonusValueNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_value not between", value1, value2, "bonusValue");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNull() {
            addCriterion("use_start_time is null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNotNull() {
            addCriterion("use_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeEqualTo(String value) {
            addCriterion("use_start_time =", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotEqualTo(String value) {
            addCriterion("use_start_time <>", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThan(String value) {
            addCriterion("use_start_time >", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("use_start_time >=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThan(String value) {
            addCriterion("use_start_time <", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThanOrEqualTo(String value) {
            addCriterion("use_start_time <=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLike(String value) {
            addCriterion("use_start_time like", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotLike(String value) {
            addCriterion("use_start_time not like", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIn(List<String> values) {
            addCriterion("use_start_time in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotIn(List<String> values) {
            addCriterion("use_start_time not in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeBetween(String value1, String value2) {
            addCriterion("use_start_time between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotBetween(String value1, String value2) {
            addCriterion("use_start_time not between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNull() {
            addCriterion("use_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNotNull() {
            addCriterion("use_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeEqualTo(String value) {
            addCriterion("use_end_time =", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotEqualTo(String value) {
            addCriterion("use_end_time <>", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThan(String value) {
            addCriterion("use_end_time >", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("use_end_time >=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThan(String value) {
            addCriterion("use_end_time <", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThanOrEqualTo(String value) {
            addCriterion("use_end_time <=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLike(String value) {
            addCriterion("use_end_time like", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotLike(String value) {
            addCriterion("use_end_time not like", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIn(List<String> values) {
            addCriterion("use_end_time in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotIn(List<String> values) {
            addCriterion("use_end_time not in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeBetween(String value1, String value2) {
            addCriterion("use_end_time between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotBetween(String value1, String value2) {
            addCriterion("use_end_time not between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUseLimitIsNull() {
            addCriterion("use_limit is null");
            return (Criteria) this;
        }

        public Criteria andUseLimitIsNotNull() {
            addCriterion("use_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUseLimitEqualTo(String value) {
            addCriterion("use_limit =", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotEqualTo(String value) {
            addCriterion("use_limit <>", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitGreaterThan(String value) {
            addCriterion("use_limit >", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitGreaterThanOrEqualTo(String value) {
            addCriterion("use_limit >=", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLessThan(String value) {
            addCriterion("use_limit <", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLessThanOrEqualTo(String value) {
            addCriterion("use_limit <=", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLike(String value) {
            addCriterion("use_limit like", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotLike(String value) {
            addCriterion("use_limit not like", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitIn(List<String> values) {
            addCriterion("use_limit in", values, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotIn(List<String> values) {
            addCriterion("use_limit not in", values, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitBetween(String value1, String value2) {
            addCriterion("use_limit between", value1, value2, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotBetween(String value1, String value2) {
            addCriterion("use_limit not between", value1, value2, "useLimit");
            return (Criteria) this;
        }

        public Criteria andFissionIdIsNull() {
            addCriterion("fission_id is null");
            return (Criteria) this;
        }

        public Criteria andFissionIdIsNotNull() {
            addCriterion("fission_id is not null");
            return (Criteria) this;
        }

        public Criteria andFissionIdEqualTo(String value) {
            addCriterion("fission_id =", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdNotEqualTo(String value) {
            addCriterion("fission_id <>", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdGreaterThan(String value) {
            addCriterion("fission_id >", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("fission_id >=", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdLessThan(String value) {
            addCriterion("fission_id <", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdLessThanOrEqualTo(String value) {
            addCriterion("fission_id <=", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdLike(String value) {
            addCriterion("fission_id like", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdNotLike(String value) {
            addCriterion("fission_id not like", value, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdIn(List<String> values) {
            addCriterion("fission_id in", values, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdNotIn(List<String> values) {
            addCriterion("fission_id not in", values, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdBetween(String value1, String value2) {
            addCriterion("fission_id between", value1, value2, "fissionId");
            return (Criteria) this;
        }

        public Criteria andFissionIdNotBetween(String value1, String value2) {
            addCriterion("fission_id not between", value1, value2, "fissionId");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlIsNull() {
            addCriterion("exchange_url is null");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlIsNotNull() {
            addCriterion("exchange_url is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlEqualTo(String value) {
            addCriterion("exchange_url =", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlNotEqualTo(String value) {
            addCriterion("exchange_url <>", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlGreaterThan(String value) {
            addCriterion("exchange_url >", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_url >=", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlLessThan(String value) {
            addCriterion("exchange_url <", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlLessThanOrEqualTo(String value) {
            addCriterion("exchange_url <=", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlLike(String value) {
            addCriterion("exchange_url like", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlNotLike(String value) {
            addCriterion("exchange_url not like", value, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlIn(List<String> values) {
            addCriterion("exchange_url in", values, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlNotIn(List<String> values) {
            addCriterion("exchange_url not in", values, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlBetween(String value1, String value2) {
            addCriterion("exchange_url between", value1, value2, "exchangeUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeUrlNotBetween(String value1, String value2) {
            addCriterion("exchange_url not between", value1, value2, "exchangeUrl");
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