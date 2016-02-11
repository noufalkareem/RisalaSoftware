package com.risala;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
	
	public static void main(String[] args){
		MonthAccount mag = new MonthAccount(Month.MAY, 2013);
		mag.setNumberOfCopies(1000);
		mag.setBalance(500);
		
		Class className = mag.getClass();
		Method[] methods = className.getMethods();
		Field[] fields = className.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			for (int count = 0; count < methods.length; count++) {
				if(methods[count].getName().equalsIgnoreCase("get"+fields[i].getName())){
					try{
					Object obj = methods[count].invoke(mag, null);
					System.out.println(obj);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}

					
			}
			
		}
	}

}
