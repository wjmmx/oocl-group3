package com.group3.tennisee;

import java.util.ArrayList;

public class Storage {
	
	ArrayList<Schedule> scheduleList;
	
	public Storage() {
		this.scheduleList = new ArrayList<Schedule>();
		scheduleList.addAll(setMondaySchedPerCourt("A"));
		//scheduleList.addAll(setTuesdaySchedPerCourt("A"));
		scheduleList.addAll(setMondaySchedPerCourt("B"));
	}
	
	public ArrayList<Schedule> setMondaySchedPerCourt(String court) {
		ArrayList<Schedule> monSched = new ArrayList<Schedule>();
		monSched.add(new Schedule("A1", court, "Monday", "09:00", "11:00"));
		monSched.add(new Schedule("A2", court, "Monday", "11:00", "13:00"));
		monSched.add(new Schedule("A3", court, "Monday", "13:00", "15:00"));
		monSched.add(new Schedule("A4", court, "Monday", "15:00", "17:00"));
		monSched.add(new Schedule("A5", court, "Monday", "17:00", "19:00"));
		monSched.add(new Schedule("A6", court, "Monday", "19:00", "21:00"));
		return monSched;
	}
	
	public ArrayList<Schedule> setTuesdaySchedPerCourt(String court) {
		ArrayList<Schedule> monSched = new ArrayList<Schedule>();
		monSched.add(new Schedule("B1", court, "Tuesday", "09:00", "11:00"));
		monSched.add(new Schedule("B2", court, "Tuesday", "11:00", "13:00"));
		monSched.add(new Schedule("B3", court, "Tuesday", "13:00", "15:00"));
		monSched.add(new Schedule("B4", court, "Tuesday", "15:00", "17:00"));
		monSched.add(new Schedule("B5", court, "Tuesday", "17:00", "19:00"));
		monSched.add(new Schedule("B6", court, "Tuesday", "19:00", "21:00"));
		return monSched;
	}
	
	public ArrayList<Schedule> setWednesdaySchedPerCourt(String court) {
		ArrayList<Schedule> monSched = new ArrayList<Schedule>();
		monSched.add(new Schedule("C1", court, "Wednesday", "09:00", "11:00"));
		monSched.add(new Schedule("C2", court, "Wednesday", "11:00", "13:00"));
		monSched.add(new Schedule("C3", court, "Wednesday", "13:00", "15:00"));
		monSched.add(new Schedule("C4", court, "Wednesday", "15:00", "17:00"));
		monSched.add(new Schedule("C5", court, "Wednesday", "17:00", "19:00"));
		monSched.add(new Schedule("C6", court, "Wednesday", "19:00", "21:00"));
		return monSched;
	}
	
	public ArrayList<Schedule> setThursdaySchedPerCourt(String court) {
		ArrayList<Schedule> monSched = new ArrayList<Schedule>();
		monSched.add(new Schedule("D1", court, "Thursday", "09:00", "11:00"));
		monSched.add(new Schedule("D2", court, "Thursday", "11:00", "13:00"));
		monSched.add(new Schedule("D3", court, "Thursday", "13:00", "15:00"));
		monSched.add(new Schedule("D4", court, "Thursday", "15:00", "17:00"));
		monSched.add(new Schedule("D5", court, "Thursday", "17:00", "19:00"));
		monSched.add(new Schedule("D6", court, "Thursday", "19:00", "21:00"));
		return monSched;
	}
	
	public ArrayList<Schedule> setFridaySchedPerCourt(String court) {
		ArrayList<Schedule> monSched = new ArrayList<Schedule>();
		monSched.add(new Schedule("E1", court, "Friday", "09:00", "11:00"));
		monSched.add(new Schedule("E2", court, "Friday", "11:00", "13:00"));
		monSched.add(new Schedule("E3", court, "Friday", "13:00", "15:00"));
		monSched.add(new Schedule("E4", court, "Friday", "15:00", "17:00"));
		monSched.add(new Schedule("E5", court, "Friday", "17:00", "19:00"));
		monSched.add(new Schedule("E6", court, "Friday", "19:00", "21:00"));
		return monSched;
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
			else if(s.getCourtCode().equalsIgnoreCase(courtCode) && !s.getIsReserved()) {
					 resultList.add(s);
			}
		}
		if(resultList.size() == 0) {
			System.out.println("No such schedule!");
			return null;
		}
		else return resultList;
	}
	
	public Schedule getScheduleListByCodeAndCourt(String code, String courtCode) {
		Schedule sched = null;
		for(Schedule s: getScheduleList()) {
			if(code.isEmpty() && courtCode.isEmpty()) {
				System.out.println("null input");
				return null;	
			} 
			else if(s.getCode().equalsIgnoreCase(code) && s.getCourtCode().equalsIgnoreCase(courtCode)&& !s.getIsReserved()) {
				 sched = s;
			}
		}
		System.out.println("No such schedule!");
		return sched;
	}
	
//	public Schedule getScheduleListByDate(String day) {
//		return new Schedule();
//	}
	
}
