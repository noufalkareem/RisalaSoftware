package com.risala;

import java.util.Map;

import com.noufal.search.ISearchCriteria;
import com.risala.util.SearchCriteria;

public class SubscriberCriteria implements ISearchCriteria {
	
	private Map<String, Object> condition;

	@Override
	public Class getClassToSearch() {return Subscriber.class;}

	@Override
	public Map<String, Object> getCondition() {
		// TODO Auto-generated method stub
		return condition;
	}
	
	public void setCondition(Map<String, Object> condition){
		this.condition = condition;
	}
	
	

}
