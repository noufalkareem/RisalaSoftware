package com.risala;

import java.util.HashMap;
import java.util.Map;

public class Unit {
	private int unitId;
	private String unitName;
	
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	public Subscriber[] getSubscribers(){
		SubscriberCriteria criteria = new SubscriberCriteria();
		Map<String,Object> condition = new HashMap<String, Object>();
		condition.put(Subscriber.UNIT, this);
		criteria.setCondition(condition);
		SearchManager manager = SearchManager.getSearchManager();
		return manager.searchSubscribers(criteria);
	}
	

}
