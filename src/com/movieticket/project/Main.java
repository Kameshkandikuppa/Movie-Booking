package com.movieticket.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char canContinue = 'y';
		int choice;
		ArrayList<Booking> bookings = new ArrayList<>();
		int BookingCounter = 0;
		ArrayList<Screen> screens = new ArrayList<>();
		int ScreenCounter = 0;

		screens.add(new Screen("Screen14PM"));
		screens.add(new Screen("Screen18PM"));
		screens.add(new Screen("Screen24PM"));
		screens.add(new Screen("Screen28PM"));
		screens.add(new Screen("Screen34PM"));

		System.out.println("Welcome");
		while (canContinue == 'y') {
			System.out.println("Choose an option from the menu");
			System.out.println("1.New Booking\n" + "2.Cancel a Booking\n" + "3.Booking Summary\n"
					+ "4.Overall Summary\n" + "5.Show All Bookings");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {

				int screenChoice;
				System.out.println("Enter Number of seats required: ");
				int noOfSeats = sc.nextInt();
				sc.nextLine();
				System.out.println("Choose Booking option");
				int i = 1;
				for (Screen s : screens) {
					s.showAvailableSeats(i);
					i += 2;
				}
				System.out.println();

				screenChoice = sc.nextInt();
				sc.nextLine();

				System.out.println();
				bookings.add(new Booking());
				switch (screenChoice) {
				case 1: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals(" Screen14PM "))
							break;

					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen14PM", 0,
							screens.get(k))) {
						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else {
						System.out.println("Booking Request currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				case 2: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen14PM"))
							break;
					}

					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen14PM", 1,
							screens.get(k))) {
						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen14PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				case 3: {

					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen18PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen18PM", 0,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				case 4: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen18PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen18PM", 1,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen18PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;

					}

					else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;

				}

				case 5: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen24PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen24PM", 0,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				case 6: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen24PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen24PM", 1,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen24PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;

				}

				case 7: {

					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen28PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen28PM", 0,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					}

					else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;

				}

				case 8: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen28PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen28PM", 1,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen28PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;

					}

					else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;

				}

				case 9: {
					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen34PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen34PM", 1,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen34PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;

					}

					else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				case 10: {

					int k;
					for (k = 0; k < screens.size(); k++) {
						if (screens.get(k).ScreenTimeId.equals("Screen34PM"))
							break;
					}
					if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen38PM", 1,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;
					} else if (bookings.get(BookingCounter).bookSeat(BookingCounter, noOfSeats, "Screen38PM", 2,
							screens.get(k))) {

						System.out.println("Seats Booked successfully");
						bookings.get(BookingCounter).printBookingDetails();
						BookingCounter++;

					}

					else {
						System.out.println("Booking Req Currently not available");
						bookings.remove(bookings.size() - 1);
					}
					break;
				}

				default: {
					System.out.println("Enter a Valid Choice");
				}
				}
				break;
			}
			case 2: {

				System.out.println("Enter BookId to Cancel Booking");
				int id = sc.nextInt();
				sc.nextLine();
				if (id >= bookings.size()) {
					System.out.println("Invalid Booking Id");
					break;
				}
				int k;
				for (k = 0; k < screens.size(); k++) {

					if (screens.get(k).ScreenTimeId.equals(bookings.get(id).ScreenTime))
						break;
				}
				bookings.get(id).cancelBooking(screens.get(k));
				System.out.println("Ticket Cancelled. Refund Details");
				break;
			}

			case 3: {

				System.out.println("Enter Booking Id To View The Booking Summary");
				int id = sc.nextInt();
				sc.nextLine();
				if (id >= bookings.size()) {
					System.out.println("Invalid Booking Id");
					break;
				}

				for (Booking booking : bookings) {

					if (booking.BookingId == id)
						booking.printBookingDetails();

				}

				System.out.println("-------------------------------------");
				break;
			}

			case 4: {

				System.out.println("-------------------------------------");
				System.out.println("Overall Summary");
				for (Screen s : screens) {
					s.printScreenDetails();
				}
				System.out.println("-------------------------------------");
				break;
			}

			case 5: {
				System.out.println("All Booking Summary");
				for (Booking b : bookings) {
					b.printBookingDetails();
					System.out.println("-------------------------------------");
				}
				break;
			}

			}

			System.out.println("Do u Want to Continue");
			String s = sc.nextLine();
			canContinue = s.charAt(0);
		}
	}

}
