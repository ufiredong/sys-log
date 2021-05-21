package com.zxx.core.model;

import java.io.Serializable;
import mboog.support.model.NoKey;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table log_count
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class LogCount implements NoKey, Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_count.logCount
     *
     * @mbg.generated
     */
    private Long logcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table log_count
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_count.logCount
     *
     * @return the value of log_count.logCount
     *
     * @mbg.generated
     */
    public Long getLogcount() {
        return logcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_count.logCount
     *
     * @param logcount the value for log_count.logCount
     *
     * @mbg.generated
     */
    public void setLogcount(Long logcount) {
        this.logcount = logcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_count
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logcount=").append(logcount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}