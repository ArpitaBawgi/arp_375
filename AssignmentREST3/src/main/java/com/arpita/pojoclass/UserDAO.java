package com.arpita.pojoclass;

import java.util.Map;
import java.util.TreeMap;

public class UserDAO {
	
	public Map<Integer,UserInfo> getAllInfo() {
		
		Map<Integer,UserInfo> map=new TreeMap<>();
		map.put(1234, new UserInfo("Karnataka", "Gulbarga", "India"));
		map.put(5678, new UserInfo("Karnataka", "BIJAPUR", "India"));
		map.put(3456, new UserInfo("AP", "HYDERABAD", "India"));
		
		return map;
		
	}
	/*
	public UserInfo getInfo(Integer zipcode) {
		return map.g
	}*/

}
