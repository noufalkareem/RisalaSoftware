package com.risala.util;

import java.util.List;

import com.risala.interfaces.IData;
import com.risala.interfaces.ITable;

public class Table implements ITable {
	
	private String tableName;
	private List<IData> data;
	private List<IData> condition;

	@Override
	public List<IData> getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void setData(List<IData> data) {
		// TODO Auto-generated method stub
		this.data = data;

	}

	@Override
	public String getTable() {
		// TODO Auto-generated method stub
		return tableName;
	}

	@Override
	public void setTable(String tableName) {
		// TODO Auto-generated method stub
		this.tableName= tableName; 

	}

	@Override
	public List<IData> getCondition() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public void setCondition(List<IData> condition) {
		// TODO Auto-generated method stub
		this.condition = condition;
		
	}

}
