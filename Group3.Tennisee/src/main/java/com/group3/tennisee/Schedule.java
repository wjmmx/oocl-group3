package com.group3.tennisee;

import java.util.ArrayList;

public class Schedule {
	String day;
	String fromHour;
	String toHour;
	int isReserve;
	public Schedule(String day,String fromHour,String toHour, int res) {
		this.day = day;
		this.fromHour = fromHour;
		this.toHour = toHour;
		isReserve=res;
		
	}
	
	public String getFromHour() {
		return fromHour;
	}
	
	public String getToHour() {
		return toHour;
	}
	
	
	public static ArrayList getSchedules() {
		ArrayList list = new ArrayList();
		
		return list;
	}

	
}
