package com.sofa.model;

import java.util.Date;

public class JourneyCommentInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey_comment_info.id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey_comment_info.journey_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    private String journeyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey_comment_info.comment_content
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    private String commentContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey_comment_info.user_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey_comment_info.add_time
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey_comment_info.id
     *
     * @return the value of journey_comment_info.id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey_comment_info.id
     *
     * @param id the value for journey_comment_info.id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey_comment_info.journey_id
     *
     * @return the value of journey_comment_info.journey_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public String getJourneyId() {
        return journeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey_comment_info.journey_id
     *
     * @param journeyId the value for journey_comment_info.journey_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId == null ? null : journeyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey_comment_info.comment_content
     *
     * @return the value of journey_comment_info.comment_content
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey_comment_info.comment_content
     *
     * @param commentContent the value for journey_comment_info.comment_content
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey_comment_info.user_id
     *
     * @return the value of journey_comment_info.user_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey_comment_info.user_id
     *
     * @param userId the value for journey_comment_info.user_id
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey_comment_info.add_time
     *
     * @return the value of journey_comment_info.add_time
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey_comment_info.add_time
     *
     * @param addTime the value for journey_comment_info.add_time
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}