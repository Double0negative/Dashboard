package com.wildcatrobotics.dashboard.net;

import java.util.Hashtable;

import com.wildcatrobotics.dashboard.util.NetworkConversionHelper;

public class DataManager {

	private static Hashtable<Integer, Object>data = new Hashtable<Integer, Object>();
	private static NetworkConversionHelper h = new NetworkConversionHelper();
	
	public static synchronized void put(Integer i, Object o){
		data.put(i, o);
	}
	
	public static synchronized Object get(Integer i){
		return data.get(i);
	}
	
	public static synchronized void updateFull(Hashtable<Integer, Object> h){
		data.putAll(h);
	}
	
	public static synchronized double getNumber(int i){
		int type = h.getType(i);
		return ( type  == DataTypes.TYPE_DOUBLE || type == DataTypes.TYPE_INT)? Double.parseDouble(DataManager.get(i).toString()) : null;
	}
	
}
