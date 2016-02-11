package com.risala.interfaces;

import java.util.List;

public interface ITable {
	 public List<IData> getData();
	 public void setData(List<IData> data);
	 public String getTable();
	 public void setTable(String tableName);
	 public List<IData> getCondition();
	 public void setCondition(List<IData> condition);
	 
	

}
