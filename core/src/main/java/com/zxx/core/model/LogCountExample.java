package com.zxx.core.model;

import com.zxx.core.model.LogCountExample.C;
import com.zxx.core.model.LogCountExample.Criteria;
import java.io.Serializable;
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
public class LogCountExample extends AbstractExample<LogCountExample, Criteria, C> implements Serializable, PaginationAble<LogCountExample>, ColumnListAble<LogCountExample, C, C> {
    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_count
     *
     * @mbg.generated
     */
    public LogCountExample() {
        supplier = Criteria::new;
        initColumnList(C.class);
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table log_count
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria extends AbstractGeneratedCriteria<Criteria> {

        public Criteria andLogcountIsNull() {
            addCriterion("logCount is null");
            return (Criteria) this;
        }

        public Criteria andLogcountIsNotNull() {
            addCriterion("logCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogcountEqualTo(Long value) {
            addCriterion("logCount =", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountNotEqualTo(Long value) {
            addCriterion("logCount <>", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountGreaterThan(Long value) {
            addCriterion("logCount >", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountGreaterThanOrEqualTo(Long value) {
            addCriterion("logCount >=", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountLessThan(Long value) {
            addCriterion("logCount <", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountLessThanOrEqualTo(Long value) {
            addCriterion("logCount <=", value, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountIn(List<Long> values) {
            addCriterion("logCount in", values, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountNotIn(List<Long> values) {
            addCriterion("logCount not in", values, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountBetween(Long value1, Long value2) {
            addCriterion("logCount between", value1, value2, "logcount");
            return (Criteria) this;
        }

        public Criteria andLogcountNotBetween(Long value1, Long value2) {
            addCriterion("logCount not between", value1, value2, "logcount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table log_count
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
     * This enum corresponds to the database table log_count
     *
     * @mbg.generated
     */
    public enum C implements CInterface {
        //--------------------------------------------------
		//[VIEW]	VIEW
		//--------------------------------------------------
		/** DV[0] */		LOGCOUNT(2, Types.BIGINT, false, "logCount");

        C(int types, int jdbcType, boolean delimited, String columnName) {
            init(new CItem(types, jdbcType, delimited, columnName, null , "`", "`"));
        }
    }
}