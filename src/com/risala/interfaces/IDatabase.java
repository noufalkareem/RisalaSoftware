package com.risala.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.risala.util.SearchCriteria;

public interface IDatabase {

	public void create(ITable data);

	public boolean update(ITable data);

	public List<Object> fetch(ITable data);
	
	public void delete(ITable data);

}