package com.sofa.model;

import java.util.Date;

public class JourneyCommentInfo {

	private String id;
	private String journeyId;
	private String commentContent;
	private String userId;
	private Date addTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	
}
