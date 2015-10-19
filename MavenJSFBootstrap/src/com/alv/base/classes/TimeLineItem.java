package com.alv.base.classes;

import java.io.Serializable;

public class TimeLineItem implements Serializable{

	private static final long serialVersionUID = 6149157685607751131L;
	private String subject;
	private String message;
	private String remainingTime;
	private String icon;
	private String hour;

	@SuppressWarnings("unused")
	private TimeLineItem() {
	}

	public TimeLineItem(String subject, String message, String remaningTime, String icon, String hour) {
		this.subject=subject;
		this.message=message;
		this.remainingTime=remaningTime;
		this.icon = icon;
		this.hour =hour;
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	
	
}
