package com.group3.tennisee;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	
	ArrayList<Schedule> scheduleList;
	
	public Storage() {
		this.scheduleList = new ArrayList<Schedule>();
		scheduleList.add(new Schedule("A1", "A", "Monday", "09:00", "11:00"));
		scheduleList.add(new Schedule("A2", "A", "Monday", "11:00", "13:00"));
		scheduleList.add(new Schedule("A3", "A", "Monday", "13:00", "15:00"));
		scheduleList.add(new Schedule("A4", "A", "Monday", "15:00", "17:00"));
		scheduleList.add(new Schedule("A5", "A", "Monday", "17:00", "19:00"));
		scheduleList.add(new Schedule("A6", "A", "Monday", "19:00", "21:00"));
		scheduleList.add(new Schedule("A1", "B", "Monday", "09:00", "11:00"));
		scheduleList.add(new Schedule("A2", "B", "Monday", "11:00", "13:00"));
		scheduleList.add(new Schedule("A3", "B", "Monday", "13:00", "15:00"));
		scheduleList.add(new Schedule("A4", "B", "Monday", "15:00", "17:00"));
		scheduleList.add(new Schedule("A5", "B", "Monday", "17:00", "19:00"));
		scheduleList.add(new Schedule("A6", "B", "Monday", "19:00", "21:00"));
		
	}
	
	public ArrayList<Schedule> getScheduleList() {
		return this.scheduleList;
	}
	
	public void resetScheduleList() {
		this.scheduleList = null;
	}	
	
	public ArrayList<Schedule> getScheduleListByCourtCode(String courtCode) {
		ArrayList<Schedule> resultList = new ArrayList<Schedule>();
		for(Schedule s: this.scheduleList) {
			if(courtCode.isEmpty()) {
				System.out.println("null input");
				return null;	
			} 
			else if(s.getCourtCode().equalsIgnoreCase(courtCode)) {
				System.out.println(s.getIsReserved());
				if(!s.getIsReserved()) {
					 resultList.add(s);
				}
			}
		}
		if(resultList.size() == 0) {
			System.out.println("No such schedule!");
			return null;
		}
		else return resultList;
	}
	
	public Schedule getScheduleListByCodeAndCourt(String code, String courtCode) {
		for(Schedule s: this.scheduleList) {
			if(code.isEmpty()) {
				System.out.println("null input");
				return null;	
			} 
			else if(s.code.equalsIgnoreCase(code) && s.courtCode.equalsIgnoreCase(courtCode)) {
				 return s;
			}
			else {
				System.out.println("No such schedule!");
				return null;
			} 
		}
		return null;
	}
	
//	public Schedule getScheduleListByDate(String day) {
//		return new Schedule();
//	}
	
}
