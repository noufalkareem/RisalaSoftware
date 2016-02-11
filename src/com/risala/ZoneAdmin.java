package com.risala;


public class ZoneAdmin extends ZoneStakeHolder{
	
	
	public ZoneAdmin(String username,String password){
		super(username,password);
		
	}
	
	public void createSubscriber(Subscriber subscriber){
		
	}
	
	public boolean updateSubscriber(Subscriber subscriber){
		return true;
	}
		
	public void createUnit(Unit unit){
		
	}
	
	public boolean updateUnit(Unit unit){
		return true;
	}
	
	public void createMagazine(MonthAccount monthAccount){
		
	}
	
	public boolean updateMagazine(MonthAccount monthAccount){
		return false;
	}
}
