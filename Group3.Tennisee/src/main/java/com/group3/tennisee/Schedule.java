package com.group3.tennisee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Schedule {
	String code;
	String day;
	String fromHour;
	String toHour;
	boolean isPaid;
	boolean isReserved;
	String courtCode;
	String userName;
	


	public Schedule() {}
	
	public Schedule(String code, String courtCode, String day,String fromHour,String toHour) {
		this.day = day;
		this.fromHour = fromHour;
		this.toHour = toHour;
		this.courtCode = courtCode;
		this.code = code;
		this.isReserved=false;
		this.isPaid=false;	
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public static boolean reserveSchedule(List<Schedule> schedules, String courtCode) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String code="";
		
		try {
			
			System.out.println("\nEnter schedule code to reserve: ");
			code = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		for(Schedule schedule : schedules) {
			if(schedule.getCourtCode().equals(courtCode) && schedule.getCode().equals(code)) {

				long diffMinutes = Schedule.getTimeDiffInMinute(Schedule.getTimeDate(schedule.getFromHour()), Schedule.getTimeDate(getCurrentTime()));
				
				if(schedule.getIsReserved()) {
					System.out.println("Schedule is already reserved, please select another option.");
					return false;
				}
				
				if(isWithinFifteenMinuteReservation(diffMinutes)) {
					System.out.println("Reservation failed. Schedule must be reserved at least 15 minutes ahead of time.");
				}
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your username : ");
				String userName = scan.nextLine();
				schedule.setUserName(userName);
				schedule.setIsReserved(true);
				System.out.println("Schedule has been successfully reserved.");
				return true;
			}
		}
		return false;
	}
	
	public static boolean courtCodeSchedule(String code) {
		boolean status=false;
		String [] correctCode = {"A1","A2","A3", "A4", "A5", "A6", "A7",
								"B1", "B2", "B3", "B4", "B5", "B6", "B7",
								"C1", "C2", "C3", "C4", "C5", "C6", "C7",
								"D1", "D2", "D3", "D4", "D5", "D6", "D7",
								"E1", "E2", "E3", "E4", "E5", "E6", "E7",
								"F1", "F2", "F3", "F4", "F5", "F6", "F7",
								"G1", "G2", "G3", "G4", "G5", "G6", "G7"};
		
		for(int i=0; i<correctCode.length; i++) {
			if(code.equals(correctCode[i])) {
				status =  true;
			}
		}
		return status;
	}
	
	public static Date getTimeDate(String time) {
		Date date = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		if(!time.isEmpty()) {
			try {
				date = dateFormat.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
		}
		return date;
	}
	
	public static Boolean isWithinFifteenMinuteReservation(long min) {
		if(min >= 15) {
			return true;
		}
		return false;
	}
	
	public static String getCurrentTime() {
		Calendar cal = new GregorianCalendar();
		String currTime = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE);
		return currTime;
	}
	
	public static long getTimeDiffInMinute(Date fromTime, Date currTime) {
		long diff = 0;
		diff = (fromTime.getTime() - currTime.getTime()) / (60*1000);
		return diff;
	}
}