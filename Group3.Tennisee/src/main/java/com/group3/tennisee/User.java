package com.group3.tennisee;

import java.util.ArrayList;

public class User {
	
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int loc_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}
	
	public static Boolean reserveSchedules(ArrayList<Schedule> list, String from, String to) {
		Boolean success = false;

		for(Schedule l:list) {
			
			if(l.getFromHour().equals(from) && l.getToHour().equals(to)) { 
				if(l.isReserve==0) {
					l.isReserve=1;
					success=true;
					System.out.println("time: " + from + " - " + to + " is reserved succesfully!" );
				}
				else {
					System.out.println("reservation failed");
				}
				
				break;
			}
		}
		return success;
	}

}
