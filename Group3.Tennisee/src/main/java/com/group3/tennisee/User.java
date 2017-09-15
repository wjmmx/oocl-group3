package com.group3.tennisee;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private int loc_id;
	
	public User(String firstName, String lastName, String username, String password, String email, int locId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.loc_id = locId;
	}
	public User(String firstName, String lastName, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
				if(!l.isReserved) {
					l.setIsReserved(true);
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
	public static Boolean reserveSchedules(ArrayList<Schedule> list, String from, String to, String day) {
		Boolean success = false;

		for(Schedule l:list) {
			
			if(l.getFromHour().equals(from) && l.getToHour().equals(to) && l.getDay().equals(day)) { 
				if(!l.isReserved) {
					l.setIsReserved(true);;
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
