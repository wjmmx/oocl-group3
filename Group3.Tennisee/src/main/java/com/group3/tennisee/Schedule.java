package com.group3.tennisee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
	String code;
	String day;
	String fromHour;
	String toHour;
	boolean isPaid;
	boolean isReserved;
	String courtCode;
	
	public Schedule(String code, String courtCode, String day,String fromHour,String toHour) {
		this.day = day;
		this.fromHour = fromHour;
		this.toHour = toHour;
		this.courtCode = courtCode;
		this.code = code;
		this.isReserved=false;
		this.isPaid=false;	
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getFromHour() {
		return fromHour;
	}

	public void setFromHour(String fromHour) {
		this.fromHour = fromHour;
	}

	public String getToHour() {
		return toHour;
	}

	public void setToHour(String toHour) {
		this.toHour = toHour;
	}

	public boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public boolean getIsReserved() {
		return isReserved;
	}

	public void setIsReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public String getCourtCode() {
		return courtCode;
	}

	public void setCourtCode(String courtCode) {
		this.courtCode = courtCode;
	}

	public static ArrayList getSchedules() {
		ArrayList list = new ArrayList();
		return list;
	}
	
	public static String reserveSchedule(String code) {
		
		return "";
	}
	
	public static boolean reserveSchedule(List<Schedule> schedules) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String code="";
		try {
		System.out.println("\nEnter code to reserve schedule: ");
			code = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Schedule schedule : schedules) {
			if(schedule.getCode().equals(code)) {
				if(schedule.getIsReserved()) {
					System.out.println("Schedule is already reserved, please select another option.");
					return false;
				}
				
				schedule.setIsReserved(true);
				System.out.println("Schedule has been successfully reserved.");
				return true;
			}
		}
		return false;
	}
}