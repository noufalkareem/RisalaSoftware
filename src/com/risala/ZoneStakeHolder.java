package com.risala;

import com.risala.util.Authenticator;

public class ZoneStakeHolder {
	
	private SearchManager manager;
	
	public ZoneStakeHolder(String username,String password){
		new Authenticator(username, password);
	}
	
	public Unit[] searchUnit(UnitCriteria criteria){
		manager = SearchManager.getSearchManager();
		return manager.searchUnits(criteria);
	}
	
	public Subscriber[] searchSubscriber(SubscriberCriteria criteria){
		manager = SearchManager.getSearchManager();
		return manager.searchSubscribers(criteria);		
		
	}
	
	public MonthAccount[] searchMagazine(MonthAcountCriteria criteria){
		manager = SearchManager.getSearchManager();
		return manager.searchMagazines(criteria);
	}


}
