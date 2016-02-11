package com.risala;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import com.noufal.search.ISearchCriteria;
import com.noufal.search.ISearchEngine;
import com.noufal.search.ISearchable;
import com.risala.util.Database;
import com.risala.util.SearchEngine;

public class SearchManager<E> implements ISearchEngine<E> {
	
	private static SearchManager sm = null;
	
	private SearchManager(){}
	
	public static SearchManager getSearchManager(){
		if(null ==  sm){
			sm = new SearchManager();
		}
		return sm;
	}
	
	
	@Override
	public ArrayList<ISearchable> search(ISearchCriteria criteria) {
		// TODO Auto-generated method stub
		ArrayList<ISearchable> resultList = new ArrayList<ISearchable>();
		Class classToSearch = criteria.getClassToSearch();
		Map<String,Object> condition = criteria.getCondition();
		String[] fieldNames = new String[condition.size()];
		condition.keySet().toArray(fieldNames);
		Method[] methods = classToSearch.getMethods();
		Field[] fields = new Field[condition.size()];
		for(int count =0; count < fields.length; count++){
			try {
				fields[count] = classToSearch.getField(fieldNames[count]);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ArrayList<Object> list = new Database().fetch(classToSearch, null);
		for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
			Object object =  iterator.next();
			for (int i = 0; i < fields.length; i++) {
				for (int count = 0; count < methods.length; count++) {
					if(methods[count].getName().equalsIgnoreCase("get"+fields[i].getName())){
						try{
						Object obj = methods[count].invoke(object, null);
						if(obj.equals(condition.get(fields[i]))){
							
						}
						}catch (Exception e) {
							e.printStackTrace();
						}
					}

						
				}
				
			}			
			
		}
		
		
		
	}

}
