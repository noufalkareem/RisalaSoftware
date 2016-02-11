package com.risala.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.noufal.search.ISearchable;
import com.risala.interfaces.IData;
import com.risala.interfaces.IDatabase;
import com.risala.interfaces.ITable;

public class Database implements IDatabase {
	
	private Connection conn;
	
	public Database(){
		
	}
	
	/* (non-Javadoc)
	 * @see com.risala.IDatabaseManager#create(java.lang.Object)
	 */
	@Override
	public void create(ITable obj){
		StringBuffer createStatment = new StringBuffer("insert into ");
		StringBuffer tables = new StringBuffer("(");
		StringBuffer values = new StringBuffer("values (");
		createStatment.append(obj.getTable());
		
		List<IData> data = obj.getData();
		boolean initial = true;
		for (Iterator<IData> iterator = data.iterator(); iterator.hasNext();) {
			IData iData =  iterator.next();
			if(!initial){
				tables.append(",");
				values.append(",");
			}
			tables.append(iData.getFieldname());
			values.append(iData.getFieldValue());
			initial = false;			
			
		}
		createStatment.append(tables);
		createStatment.append(values);
		
	}
	
	/* (non-Javadoc)
	 * @see com.risala.IDatabaseManager#update(java.lang.Object)
	 */
	@Override
	public boolean update(ITable obj){
		StringBuffer createStatment = new StringBuffer("update ");
		createStatment.append(obj.getTable());
		createStatment.append("SET ");
		
		List<IData> data = obj.getData();
		boolean initial = true;
		for (Iterator<IData> iterator = data.iterator(); iterator.hasNext();) {
			IData iData =  iterator.next();
			if(!initial){
				createStatment.append(",");
			}
			createStatment.append(iData.getFieldname());
			createStatment.append("=");
			createStatment.append(iData.getFieldValue());			
			initial = false;	
		}
		
		createStatment.append("WHERE ");
		List<IData> condition = obj.getCondition();
		initial = true;
		for (Iterator<IData> iterator = condition.iterator(); iterator.hasNext();) {
			IData iData = iterator.next();
			if(!initial){
				createStatment.append(",");
			}
			createStatment.append(iData.getFieldname());
			createStatment.append("=");
			createStatment.append(iData.getFieldValue());			
			initial = false;	
			
		}

		return false;
	}
	
	/* (non-Javadoc)
	 * @see com.risala.IDatabaseManager#fetch(java.lang.Class, com.risala.util.SearchCriteria)
	 */
	@Override
	public List<Object> fetch(ITable data){
		StringBuffer createStatment = new StringBuffer("select ");
		List<IData> dataList = data.getData();
		boolean initial = true;
		for (Iterator<IData> iterator = dataList.iterator(); iterator.hasNext();) {
			IData iData =  iterator.next();
			if(!initial){
				createStatment.append(",");
			}
			createStatment.append(iData.getFieldname());
		}
		createStatment.append("FROM ");
		createStatment.append(data.getTable());
		createStatment.append(" WHERE ");
		List<IData> condition = data.getCondition();
		initial = true;
		for (Iterator<IData> iterator = condition.iterator(); iterator.hasNext();) {
			IData iData = iterator.next();
			if(!initial){
				createStatment.append(",");
			}
			createStatment.append(iData.getFieldname());
			createStatment.append("=");
			createStatment.append(iData.getFieldValue());			
			initial = false;	
			
		}
		
		return null;
		
		
	}

	@Override
	public void delete(ITable data) {
		// TODO Auto-generated method stub
		
	}
	
	

}
