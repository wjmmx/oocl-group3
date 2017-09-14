package com.group3.tennisee;

import java.util.ArrayList;

public class Storage {
	
	ArrayList<Schedule> scheduleList;
	String[] courts = {"A","B","C","D","E","F","G"};
	
	public Storage() {
		this.scheduleList = new ArrayList<Schedule>();
		scheduleList.addAll(getMonSched());
		scheduleList.addAll(getTueSched());
		scheduleList.addAll(getWedSched());
		scheduleList.addAll(getThuSched());
		scheduleList.addAll(getFriSched());
		scheduleList.addAll(getSatSched());
		scheduleList.addAll(getSunSched());
	}
	
	public ArrayList<Schedule> getMonSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setMondaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getTueSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setTuesdaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getWedSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setWednesdaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getThuSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setThursdaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getFriSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setFridaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getSatSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setSaturdaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> getSunSched(){
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		for(String c : courts) {
			schedList.addAll(setSundaySchedPerCourt(c));
		}
		return schedList;
	}
	
	public ArrayList<Schedule> setMondaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("A1", court, "Monday", "09:00", "11:00"));
		schedList.add(new Schedule("A2", court, "Monday", "11:00", "13:00"));
		schedList.add(new Schedule("A3", court, "Monday", "13:00", "15:00"));
		schedList.add(new Schedule("A4", court, "Monday", "15:00", "17:00"));
		schedList.add(new Schedule("A5", court, "Monday", "17:00", "19:00"));
		schedList.add(new Schedule("A6", court, "Monday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setTuesdaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("B1", court, "Tuesday", "09:00", "11:00"));
		schedList.add(new Schedule("B2", court, "Tuesday", "11:00", "13:00"));
		schedList.add(new Schedule("B3", court, "Tuesday", "13:00", "15:00"));
		schedList.add(new Schedule("B4", court, "Tuesday", "15:00", "17:00"));
		schedList.add(new Schedule("B5", court, "Tuesday", "17:00", "19:00"));
		schedList.add(new Schedule("B6", court, "Tuesday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setWednesdaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("C1", court, "Wednesday", "09:00", "11:00"));
		schedList.add(new Schedule("C2", court, "Wednesday", "11:00", "13:00"));
		schedList.add(new Schedule("C3", court, "Wednesday", "13:00", "15:00"));
		schedList.add(new Schedule("C4", court, "Wednesday", "15:00", "17:00"));
		schedList.add(new Schedule("C5", court, "Wednesday", "17:00", "19:00"));
		schedList.add(new Schedule("C6", court, "Wednesday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setThursdaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("D1", court, "Thursday", "09:00", "11:00"));
		schedList.add(new Schedule("D2", court, "Thursday", "11:00", "13:00"));
		schedList.add(new Schedule("D3", court, "Thursday", "13:00", "15:00"));
		schedList.add(new Schedule("D4", court, "Thursday", "15:00", "17:00"));
		schedList.add(new Schedule("D5", court, "Thursday", "17:00", "19:00"));
		schedList.add(new Schedule("D6", court, "Thursday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setFridaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("E1", court, "Friday", "09:00", "11:00"));
		schedList.add(new Schedule("E2", court, "Friday", "11:00", "13:00"));
		schedList.add(new Schedule("E3", court, "Friday", "13:00", "15:00"));
		schedList.add(new Schedule("E4", court, "Friday", "15:00", "17:00"));
		schedList.add(new Schedule("E5", court, "Friday", "17:00", "19:00"));
		schedList.add(new Schedule("E6", court, "Friday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setSaturdaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("F1", court, "Saturday", "09:00", "11:00"));
		schedList.add(new Schedule("F2", court, "Saturday", "11:00", "13:00"));
		schedList.add(new Schedule("F3", court, "Saturday", "13:00", "15:00"));
		schedList.add(new Schedule("F4", court, "Saturday", "15:00", "17:00"));
		schedList.add(new Schedule("F5", court, "Saturday", "17:00", "19:00"));
		schedList.add(new Schedule("F6", court, "Saturday", "19:00", "21:00"));
		return schedList;
	}
	
	public ArrayList<Schedule> setSundaySchedPerCourt(String court) {
		ArrayList<Schedule> schedList = new ArrayList<Schedule>();
		schedList.add(new Schedule("G1", court, "Sunday", "09:00", "11:00"));
		schedList.add(new Schedule("G2", court, "Sunday", "11:00", "13:00"));
		schedList.add(new Schedule("G3", court, "Sunday", "13:00", "15:00"));
		schedList.add(new Schedule("G4", court, "Sunday", "15:00", "17:00"));
		schedList.add(new Schedule("G5", court, "Sunday", "17:00", "19:00"));
		schedList.add(new Schedule("G6", court, "Sunday", "19:00", "21:00"));
		return schedList;
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
