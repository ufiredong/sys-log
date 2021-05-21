package com.zxx.core.model;

import com.zxx.core.model.SysLogExample.C;
import com.zxx.core.model.SysLogExample.Criteria;
import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mboog.support.example.AbstractExample;
import mboog.support.example.AbstractGeneratedCriteria;
import mboog.support.example.CInterface;
import mboog.support.example.CItem;
import mboog.support.example.ColumnListAble;
import mboog.support.example.PaginationAble;

@SuppressWarnings("unused")
public class SysLogExample extends AbstractExample<SysLogExample, Criteria, C> implements Serializable, ColumnListAble<SysLogExample, C, C>, PaginationAble<SysLogExample> {
    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_task
     *
     * @mbg.generated
     */
    public SysLogExample() {
        supplier = Criteria::new;
        initColumnList(C.class);
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table log_task
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria extends AbstractGeneratedCriteria<Criteria> {

        public Criteria andEvtDatetimeIsNull() {
            addCriterion("evt_datetime is null");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeIsNotNull() {
            addCriterion("evt_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeEqualTo(Long value) {
            addCriterion("evt_datetime =", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeNotEqualTo(Long value) {
            addCriterion("evt_datetime <>", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeGreaterThan(Long value) {
            addCriterion("evt_datetime >", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("evt_datetime >=", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeLessThan(Long value) {
            addCriterion("evt_datetime <", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeLessThanOrEqualTo(Long value) {
            addCriterion("evt_datetime <=", value, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeIn(List<Long> values) {
            addCriterion("evt_datetime in", values, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeNotIn(List<Long> values) {
            addCriterion("evt_datetime not in", values, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeBetween(long value1, long value2) {
            addCriterion("evt_datetime between", value1, value2, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtDatetimeNotBetween(Long value1, Long value2) {
            addCriterion("evt_datetime not between", value1, value2, "evtDatetime");
            return (Criteria) this;
        }

        public Criteria andEvtTypeIsNull() {
            addCriterion("evt_type is null");
            return (Criteria) this;
        }

        public Criteria andEvtTypeIsNotNull() {
            addCriterion("evt_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvtTypeEqualTo(String value) {
            addCriterion("evt_type =", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeNotEqualTo(String value) {
            addCriterion("evt_type <>", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeGreaterThan(String value) {
            addCriterion("evt_type >", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("evt_type >=", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeLessThan(String value) {
            addCriterion("evt_type <", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeLessThanOrEqualTo(String value) {
            addCriterion("evt_type <=", value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeLike(String pattern, String value) {
            addCriterionPattern("evt_type like", pattern, value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeNotLike(String pattern, String value) {
            addCriterionPattern("evt_type not like", pattern, value, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeIn(List<String> values) {
            addCriterion("evt_type in", values, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeNotIn(List<String> values) {
            addCriterion("evt_type not in", values, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeBetween(String value1, String value2) {
            addCriterion("evt_type between", value1, value2, "evtType");
            return (Criteria) this;
        }

        public Criteria andEvtTypeNotBetween(String value1, String value2) {
            addCriterion("evt_type not between", value1, value2, "evtType");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(Integer value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(Integer value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(Integer value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(Integer value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(Integer value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<Integer> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<Integer> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(Integer value1, Integer value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("`source` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`source` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("`source` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("`source` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("`source` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("`source` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("`source` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("`source` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String pattern, String value) {
            addCriterionPattern("`source` like", pattern, value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String pattern, String value) {
            addCriterionPattern("`source` not like", pattern, value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("`source` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("`source` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("`source` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("`source` not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andEvtIdIsNull() {
            addCriterion("evt_id is null");
            return (Criteria) this;
        }

        public Criteria andEvtIdIsNotNull() {
            addCriterion("evt_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvtIdEqualTo(String value) {
            addCriterion("evt_id =", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdNotEqualTo(String value) {
            addCriterion("evt_id <>", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdGreaterThan(String value) {
            addCriterion("evt_id >", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdGreaterThanOrEqualTo(String value) {
            addCriterion("evt_id >=", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdLessThan(String value) {
            addCriterion("evt_id <", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdLessThanOrEqualTo(String value) {
            addCriterion("evt_id <=", value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdLike(String pattern, String value) {
            addCriterionPattern("evt_id like", pattern, value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdNotLike(String pattern, String value) {
            addCriterionPattern("evt_id not like", pattern, value, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdIn(List<String> values) {
            addCriterion("evt_id in", values, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdNotIn(List<String> values) {
            addCriterion("evt_id not in", values, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdBetween(String value1, String value2) {
            addCriterion("evt_id between", value1, value2, "evtId");
            return (Criteria) this;
        }

        public Criteria andEvtIdNotBetween(String value1, String value2) {
            addCriterion("evt_id not between", value1, value2, "evtId");
            return (Criteria) this;
        }

        public Criteria andComputerIsNull() {
            addCriterion("computer is null");
            return (Criteria) this;
        }

        public Criteria andComputerIsNotNull() {
            addCriterion("computer is not null");
            return (Criteria) this;
        }

        public Criteria andComputerEqualTo(String value) {
            addCriterion("computer =", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotEqualTo(String value) {
            addCriterion("computer <>", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThan(String value) {
            addCriterion("computer >", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThanOrEqualTo(String value) {
            addCriterion("computer >=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThan(String value) {
            addCriterion("computer <", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThanOrEqualTo(String value) {
            addCriterion("computer <=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLike(String pattern, String value) {
            addCriterionPattern("computer like", pattern, value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotLike(String pattern, String value) {
            addCriterionPattern("computer not like", pattern, value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerIn(List<String> values) {
            addCriterion("computer in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotIn(List<String> values) {
            addCriterion("computer not in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerBetween(String value1, String value2) {
            addCriterion("computer between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotBetween(String value1, String value2) {
            addCriterion("computer not between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andCatIsNull() {
            addCriterion("cat is null");
            return (Criteria) this;
        }

        public Criteria andCatIsNotNull() {
            addCriterion("cat is not null");
            return (Criteria) this;
        }

        public Criteria andCatEqualTo(String value) {
            addCriterion("cat =", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotEqualTo(String value) {
            addCriterion("cat <>", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatGreaterThan(String value) {
            addCriterion("cat >", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatGreaterThanOrEqualTo(String value) {
            addCriterion("cat >=", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLessThan(String value) {
            addCriterion("cat <", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLessThanOrEqualTo(String value) {
            addCriterion("cat <=", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLike(String pattern, String value) {
            addCriterionPattern("cat like", pattern, value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotLike(String pattern, String value) {
            addCriterionPattern("cat not like", pattern, value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatIn(List<String> values) {
            addCriterion("cat in", values, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotIn(List<String> values) {
            addCriterion("cat not in", values, "cat");
            return (Criteria) this;
        }

        public Criteria andCatBetween(String value1, String value2) {
            addCriterion("cat between", value1, value2, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotBetween(String value1, String value2) {
            addCriterion("cat not between", value1, value2, "cat");
            return (Criteria) this;
        }

        public Criteria andSecondsIsNull() {
            addCriterion("`seconds` is null");
            return (Criteria) this;
        }

        public Criteria andSecondsIsNotNull() {
            addCriterion("`seconds` is not null");
            return (Criteria) this;
        }

        public Criteria andSecondsEqualTo(Long value) {
            addCriterion("`seconds` =", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotEqualTo(Long value) {
            addCriterion("`seconds` <>", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsGreaterThan(Long value) {
            addCriterion("`seconds` >", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsGreaterThanOrEqualTo(Long value) {
            addCriterion("`seconds` >=", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsLessThan(Long value) {
            addCriterion("`seconds` <", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsLessThanOrEqualTo(Long value) {
            addCriterion("`seconds` <=", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsIn(List<Long> values) {
            addCriterion("`seconds` in", values, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotIn(List<Long> values) {
            addCriterion("`seconds` not in", values, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsBetween(Long value1, Long value2) {
            addCriterion("`seconds` between", value1, value2, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotBetween(Long value1, Long value2) {
            addCriterion("`seconds` not between", value1, value2, "seconds");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table log_task
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {
        
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table log_task
     *
     * @mbg.generated
     */
    public enum C implements CInterface {
        //--------------------------------------------------
		//[TABLE]
		//--------------------------------------------------					
						EVT_DATETIME(2, Types.BIGINT, false, "evt_datetime"),					
						EVT_TYPE(2, Types.VARCHAR, false, "evt_type"),					
						RECORD(2, Types.INTEGER, false, "record"),					
						SOURCE(2, Types.VARCHAR, true, "source"),					
						EVT_ID(2, Types.VARCHAR, false, "evt_id"),					
						COMPUTER(2, Types.VARCHAR, false, "computer"),					
						CAT(2, Types.VARCHAR, false, "cat"),					
						SECONDS(2, Types.BIGINT, true, "seconds"),					
						MSG(3, Types.LONGVARCHAR, false, "msg");

        C(int types, int jdbcType, boolean delimited, String columnName) {
            init(new CItem(types, jdbcType, delimited, columnName, null , "`", "`"));
        }
    }
}