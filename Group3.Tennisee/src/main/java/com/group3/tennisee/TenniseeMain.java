package com.group3.tennisee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenniseeMain {
	static Scanner scan = new Scanner(System.in);
	static String username;
	static String password;
	static Storage store;

	public static void main(String[] args) {
		store = new Storage();
		int option = 0;
		String courtCode = "";
		banner();

		while (option != 3) {
			System.out.println("==============");
			System.out.println("OPTIONS:");
			System.out.println("==============");
			System.out.println("1] Reserve Schedule");
			System.out.println("2] Login");
			System.out.println("3] Exit");
			System.out.print("Enter option: ");
			option = scan.nextInt();

			if (option == 1) {
				courtCode = chooseCourt();
				Schedule sc = store.getScheduleListByCodeAndCourt(viewSchedules(courtCode), courtCode);
				if(sc!=null) {
					Schedule.reserveSchedule(sc);
				}
				else {
					System.out.println("Schedule not available!");
				}
			} else if (option == 2) {
				login();
			} else if (option == 3) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Invalid!");
			}
		}

	}

	public static void banner() {
		System.out.println(
				"======================================================================================================");
		System.out.println(
				"======================================================================================================");
		System.out.println(
				"               ___          ___          ___                     ___          ___          ___     \r\n"
						+ "      ___     /  /\\        /__/\\        /__/\\       ___         /  /\\        /  /\\        /  /\\    \r\n"
						+ "     /  /\\   /  /:/_       \\  \\:\\       \\  \\:\\     /  /\\       /  /:/_      /  /:/_      /  /:/_   \r\n"
						+ "    /  /:/  /  /:/ /\\       \\  \\:\\       \\  \\:\\   /  /:/      /  /:/ /\\    /  /:/ /\\    /  /:/ /\\  \r\n"
						+ "   /  /:/  /  /:/ /:/_  _____\\__\\:\\  _____\\__\\:\\ /__/::\\     /  /:/ /::\\  /  /:/ /:/_  /  /:/ /:/_ \r\n"
						+ "  /  /::\\ /__/:/ /:/ /\\/__/::::::::\\/__/::::::::\\\\__\\/\\:\\__ /__/:/ /:/\\:\\/__/:/ /:/ /\\/__/:/ /:/ /\\\r\n"
						+ " /__/:/\\:\\\\  \\:\\/:/ /:/\\  \\:\\~~\\~~\\/\\  \\:\\~~\\~~\\/   \\  \\:\\/\\\\  \\:\\/:/~/:/\\  \\:\\/:/ /:/\\  \\:\\/:/ /:/\r\n"
						+ " \\__\\/  \\:\\\\  \\::/ /:/  \\  \\:\\  ~~~  \\  \\:\\  ~~~     \\__\\::/ \\  \\::/ /:/  \\  \\::/ /:/  \\  \\::/ /:/ \r\n"
						+ "      \\  \\:\\\\  \\:\\/:/    \\  \\:\\       \\  \\:\\         /__/:/   \\__\\/ /:/    \\  \\:\\/:/    \\  \\:\\/:/  \r\n"
						+ "       \\__\\/ \\  \\::/      \\  \\:\\       \\  \\:\\        \\__\\/      /__/:/      \\  \\::/      \\  \\::/   \r\n"
						+ "              \\__\\/        \\__\\/        \\__\\/                   \\__\\/        \\__\\/        \\__\\/");

		System.out.println(
				"======================================================================================================");
		System.out.println(
				"======================================================================================================");
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

	public static String viewSchedules(String courtCode) {
		Storage storage = new Storage();
		String[] day = { "A Monday\t|", "B Tuesday\t|", "C Wednesday\t|", "D Thursday\t|", "E Friday\t|",
				"F Saturday\t|", "G Sunday\t|" };
		String[] courtLetter = { "A", "B", "C", "D", "E", "F", "G", "H" };
		String[] courtOperatingTime = { "9:00", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00" };
		String retCode = "";
		boolean[][] a;
		int row = 7;
		int col = 6;
		a = new boolean[row][col];
		String code;
		String schedCode;
		String courtTime;
		Scanner br = new Scanner(System.in);

		System.out.print("\t\t\t"); // print the spacer for the row numbers
		for (int i = 1; i <= col; i++) {
			System.out.print("\t" + i + "\t"); // print the column number

		}
		ArrayList<Schedule> schedule = storage.getScheduleListByCourtCode(courtCode);
		for (int i = 0; i < a.length; i++) {
			System.out.print("\n" + day[i]);
			for (int j = 0; j < schedule.size(); j++) {
				char dayChar = day[i].charAt(0);
				if (dayChar == 'A' && schedule.get(j).getDay().equals("Monday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'B' && schedule.get(j).getDay().equals("Tuesday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'C' && schedule.get(j).getDay().equals("Wednesday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'D' && schedule.get(j).getDay().equals("Thursday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'E' && schedule.get(j).getDay().equals("Friday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'F' && schedule.get(j).getDay().equals("Saturday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				} else if (dayChar == 'G' && schedule.get(j).getDay().equals("Sunday")) {
					System.out.print("\t" + schedule.get(j).getFromHour() + " - " + schedule.get(j).getToHour());
				}

				/*
				 * // System.out.print("\t" + schedule.getFromHour());
				 */
			}

		}

		System.out.println("\nEnter schedule code to reserve: ");
		code = br.nextLine();

		return code;
	}

}