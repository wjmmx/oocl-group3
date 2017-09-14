package com.group3.tennisee;

import java.util.ArrayList;

public class Schedule {
	String code;
	String day;
	String fromHour;
	String toHour;
	int isPaid;
	int isReserve;
	String courtCode;
	
	public Schedule(String day,String fromHour,String toHour, int res) {
		this.day = day;
		this.fromHour = fromHour;
		this.toHour = toHour;
		isReserve=res;
		
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

	public int getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(int isPaid) {
		this.isPaid = isPaid;
	}

	public int getIsReserve() {
		return isReserve;
	}

	public void setIsReserve(int isReserve) {
		this.isReserve = isReserve;
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
	
	public static ArrayList createScheduleDummy() {
		ArrayList list = new ArrayList();
		
		list = new ArrayList();
		list.add(new Schedule("Monday","9:00","11:00", 0));
		list.add(new Schedule("Monday","11:00","13:00", 1));
		list.add(new Schedule("Monday","13:00","15:00", 0));
		list.add(new Schedule("Monday","13:00","15:00", 0));
		list.add(new Schedule("Monday","13:00","15:00", 0));
		list.add(new Schedule("Tuesday","13:00","15:00", 0));
		return list;
	}

	
}
