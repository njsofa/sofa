package com.sofa.model;

import java.util.Date;

public class JourneyInfo {
	private String id;
	private Date startDate;
	private Date endDate;
	private String launchUser;
	private Integer startCity;
	private Integer destinationCity;
	private String title;
	private String content;
	private String locationLatitude;
	private String locationLongtitude;
	private String images;
	private Date addTime;
	private Integer delFlag;
	private String iconUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getLaunchUser() {
		return launchUser;
	}
	public void setLaunchUser(String launchUser) {
		this.launchUser = launchUser;
	}
	public Integer getStartCity() {
		return startCity;
	}
	public void setStartCity(Integer startCity) {
		this.startCity = startCity;
	}
	public Integer getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(Integer destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getLocationLatitude() {
		return locationLatitude;
	}
	public void setLocationLatitude(String locationLatitude) {
		this.locationLatitude = locationLatitude;
	}
	public String getLocationLongtitude() {
		return locationLongtitude;
	}
	public void setLocationLongtitude(String locationLongtitude) {
		this.locationLongtitude = locationLongtitude;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
