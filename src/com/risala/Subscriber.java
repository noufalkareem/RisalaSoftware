package com.risala;

import java.util.Date;

public class Subscriber {
	public static final String NAME = "Name",
			ID = "SubscriberId",
			UNIT = "Unit";
	
	
	private int subscriberId;
	private String name;
	private Date subStartDate;
	private Date subEndDate;
	private Unit unit;
	
	public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getSubStartDate() {
		return subStartDate;
	}
	public void setSubStartDate(Date subStartDate) {
		this.subStartDate = subStartDate;
	}
	public Date getSubEndDate() {
		return subEndDate;
	}
	public void setSubEndDate(Date subEndDate) {
		this.subEndDate = subEndDate;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnitId(Unit unit) {
		this.unit = unit;
	}

}
