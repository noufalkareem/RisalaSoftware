package com.risala;

import java.util.Map;

import com.noufal.search.ISearchCriteria;

public class UnitCriteria implements ISearchCriteria {
	
	private  Map<String, Object> condition;

	@Override
	public Class getClassToSearch() {
		// TODO Auto-generated method stub
		return Unit.class;
	}

	@Override
	public Map<String, Object> getCondition() {
		// TODO Auto-generated method stub
		return condition;
	}
	
	public void setCondition( Map<String, Object> condition){
		this.condition = condition;
	}

}
