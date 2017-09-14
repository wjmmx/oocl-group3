package com.group3.tennisee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenniseeMain {
	static Scanner scan = new Scanner(System.in);
	static String username;
	static String password;
	
	public static void main(String[] args) {
		
		int option = 0;
		
		banner();
		

		while(option!=3) {
			System.out.println("==============");
			System.out.println("OPTIONS:");
			System.out.println("==============");
			System.out.println("1] Reserve Schedule");
			System.out.println("2] Login");
			System.out.println("3] Exit");
			System.out.print("Enter option: ");
			option = scan.nextInt();
			
			if(option==1) {
				viewSchedules();
				reserveSchedule(new ArrayList<Schedule>());
			}
			else if(option==2) {
				login();
			}
			else {
				System.out.println("Invalid!");
			}
		}
		
		System.out.println("Goodbye!");
	}
	
	public static void banner() {
		System.out.println("======================================================================================================");
		System.out.println("======================================================================================================");
		System.out.println("               ___          ___          ___                     ___          ___          ___     \r\n" + 
				"      ___     /  /\\        /__/\\        /__/\\       ___         /  /\\        /  /\\        /  /\\    \r\n" + 
				"     /  /\\   /  /:/_       \\  \\:\\       \\  \\:\\     /  /\\       /  /:/_      /  /:/_      /  /:/_   \r\n" + 
				"    /  /:/  /  /:/ /\\       \\  \\:\\       \\  \\:\\   /  /:/      /  /:/ /\\    /  /:/ /\\    /  /:/ /\\  \r\n" + 
				"   /  /:/  /  /:/ /:/_  _____\\__\\:\\  _____\\__\\:\\ /__/::\\     /  /:/ /::\\  /  /:/ /:/_  /  /:/ /:/_ \r\n" + 
				"  /  /::\\ /__/:/ /:/ /\\/__/::::::::\\/__/::::::::\\\\__\\/\\:\\__ /__/:/ /:/\\:\\/__/:/ /:/ /\\/__/:/ /:/ /\\\r\n" + 
				" /__/:/\\:\\\\  \\:\\/:/ /:/\\  \\:\\~~\\~~\\/\\  \\:\\~~\\~~\\/   \\  \\:\\/\\\\  \\:\\/:/~/:/\\  \\:\\/:/ /:/\\  \\:\\/:/ /:/\r\n" + 
				" \\__\\/  \\:\\\\  \\::/ /:/  \\  \\:\\  ~~~  \\  \\:\\  ~~~     \\__\\::/ \\  \\::/ /:/  \\  \\::/ /:/  \\  \\::/ /:/ \r\n" + 
				"      \\  \\:\\\\  \\:\\/:/    \\  \\:\\       \\  \\:\\         /__/:/   \\__\\/ /:/    \\  \\:\\/:/    \\  \\:\\/:/  \r\n" + 
				"       \\__\\/ \\  \\::/      \\  \\:\\       \\  \\:\\        \\__\\/      /__/:/      \\  \\::/      \\  \\::/   \r\n" + 
				"              \\__\\/        \\__\\/        \\__\\/                   \\__\\/        \\__\\/        \\__\\/");
		
		System.out.println("======================================================================================================");
		System.out.println("======================================================================================================");
		System.out.println("\t\t\t\t An online tennis court reservation system");
		
	}
	
	public static void login() {
		
		System.out.println("Enter username: ");
		username = scan.nextLine();
		System.out.println("Enter password: ");
		password = scan.nextLine();
		
		verifyifPremiumUser(username, password);
	}
	
	public static void verifyifPremiumUser(String username, String password) {
		
	}
	
	public static void viewSchedules() {
		String [] day = {"A Monday\t|", "B Tuesday\t|", "C Wednesday\t|" , "D Thursday\t|", "E Friday\t|", "F Saturday\t|", "G Sunday\t|"} ;
		boolean [][] a;
	    int row = 8;
	    int col = 7;
	    a = new boolean [row][col];

	    System.out.print("\t\t\t"); //print the spacer for the row numbers
	    for (int i = 1; i <= col; i++){
	         System.out.print(i + "\t"); //print the column number
	    	
	    }

	    for (int i = 1; i<a.length;i++){ 
	       // System.out.print("\n" + i + " "); //new line plus row number
	    	System.out.print("\n" + day[i-1]);
	        for (int j = 1; j<a[0].length;j++){
	            a[i][j] = true; 
	           
	        }
	    }
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
				if(schedule.getIsReserve()==1) {
					System.out.println("Schedule is already reserved, please select another option.");
					return false;
				}
				
				schedule.setIsReserve(1);
				System.out.println("Schedule has been successfully reserved.");
				return true;
			}
		}
		return false;
	}
}