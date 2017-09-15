package com.group3.tennisee;

import java.util.ArrayList;
import java.util.Scanner;

public class TenniseeMain {
	static Scanner scan = new Scanner(System.in);
	static String username;
	static String password;
	
	public static void main(String[] args) {
		
		int option = 0;
		String courtCode="";
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
				courtCode = chooseCourt();
				viewSchedules();
				Schedule.reserveSchedule(new ArrayList<Schedule>(), courtCode);
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
	
	public static String chooseCourt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("||\tA\t||\tB\t||\tC\t||\tD\t||");
		System.out.println("==================================================================");
		System.out.println("||\tE\t||\tF\t||\tG\t||\tH\t||");
		System.out.println("==================================================================");
		System.out.println("Enter Court: ");
		String court = scan.nextLine().toUpperCase();
		System.out.println("\nCourt: " + court);
		return court;
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
}