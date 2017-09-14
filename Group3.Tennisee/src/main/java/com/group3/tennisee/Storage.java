package com.group3.tennisee;

import java.util.ArrayList;

public class Storage {
	
	ArrayList<Schedule> scheduleList;
	
	public Storage() {
		this.scheduleList = new ArrayList<Schedule>();
	}
	
	public ArrayList<Schedule> getScheduleList() {
		return this.scheduleList;
	}
	
	public void resetScheduleList() {
		this.scheduleList = null;
	}	
	
	public Schedule getScheduleListByCode(String code) {
		for(Schedule s: this.scheduleList) {
			if(code.isEmpty()) {
				System.out.println("null input");
				return null;	
			} 
			else if(s.code.equalsIgnoreCase(code)) {
				 return s;
			}
			else {
				System.out.println("No such schedule!");
				return null;
			} 
		}
		return null;
	}
	
	public Schedule getScheduleListByDate(String day) {
		return new Schedule();
	}
	
}
