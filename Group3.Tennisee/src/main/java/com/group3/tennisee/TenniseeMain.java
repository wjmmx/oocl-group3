package com.group3.tennisee;

import java.util.ArrayList;
import java.util.Scanner;

public class TenniseeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		ArrayList list = new ArrayList();
		
		list.add(new Schedule("Monday","9:00","11:00", 0));
		list.add(new Schedule("Monday","11:00","13:00", 1));
		list.add(new Schedule("Monday","13:00","15:00", 0));
		
		while(option!=3) {
			System.out.println("==============");
			System.out.println("OPTIONS:");
			System.out.println("==============");
			System.out.println("1] View Schedules ");
			System.out.println("2] Reserve Schedule");
			System.out.println("3] Exit");
			System.out.print("Enter option: ");
			option = scan.nextInt();
			
			if(option==1) {
				viewSchedules();
				
			}
			else if(option==2) {
				reserveSchedule();
			}
		}
	}
	
	public static void viewSchedules() {
		System.out.println("Schedules...\n\n");
		Schedule.getSchedules();
		
	}
	public static void reserveSchedule() {
		System.out.println("Reserving...\n\n\n");
		
	}

}