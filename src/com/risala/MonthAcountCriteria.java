package com.risala;

import java.util.Map;

import com.noufal.search.ISearchCriteria;
import com.noufal.search.ISearchable;
import com.risala.util.SearchCriteria;

public class MonthAcountCriteria implements ISearchCriteria {
	private Map<String, Object> condition;
	private Class classToSearch;

	@Override
	public Class getClassToSearch() {
		return  MonthAccount.class;
	};
	
	@Override
	public Map<String, Object> getCondition() {
		// TODO Auto-generated method stub
		return condition;
	}

	public void setCondition(Map<String, Object> condition) {
		// TODO Auto-generated method stub
		this.condition = condition;

	}
	
}
