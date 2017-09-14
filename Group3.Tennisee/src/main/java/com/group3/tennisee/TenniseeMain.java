package com.group3.tennisee;

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
		
	}
	public static void reserveSchedule() {
	}

}