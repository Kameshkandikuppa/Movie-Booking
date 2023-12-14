package com.movieticket.project;

import java.util.ArrayList;

public class Booking {

	public int BookingId;
	private ArrayList<Integer> seatAlloted;
	public String ScreenTime;
	private int RawCost;
	private int NetCost;
	private String status;

	static int calculateRawCost(int noOfSeats, int SeatClass) {

		if (SeatClass == 0)

			return 120 * noOfSeats;
		else
			return 100 * noOfSeats;

	}

	boolean bookSeat(int BookId, int noOfSeats, String ScreenTime1, int SeatClass, Screen screenId) {
		seatAlloted = screenId.checkAvailability(ScreenTime1, SeatClass, noOfSeats);
		if (seatAlloted.size() != 0) {
			BookingId = BookId;
			ScreenTime = ScreenTime1;
			RawCost = calculateRawCost(noOfSeats, SeatClass);
			NetCost = RawCost;

			status = "Seats Booked";
			screenId.bookScreenSeats(ScreenTime1, SeatClass, noOfSeats);
			screenId.updateCollection(NetCost);
			return true;
		} else {
			seatAlloted = new ArrayList<>();
			return false;
		}
	}

	void cancelBooking(Screen screenId) {
		screenId.updateCollection((-1 * NetCost));
		status = "Cancelled";
		System.out.println("Booking Id: " + BookingId);
		System.out.println("Ticket Cost: " + NetCost);
		System.out.println("Cancellation Charge " + (NetCost * 0.1));
		System.out.println("Refund Amount " + (NetCost - (NetCost * 0.1)));
		screenId.updateCollection((int) (NetCost * 0.1));
		NetCost = 0;
		screenId.updateSeats(seatAlloted);
		seatAlloted = new ArrayList<>();
	}

	void printBookingDetails() {

		System.out.println("Booking Id: " + BookingId);
		System.out.println("Time: " + ScreenTime.substring(7, ScreenTime.length()));
		if (status.equals("Seats Booked")) {
			System.out.println("Seats Alloted");
			for (int i : seatAlloted)
				System.out.println(i + " ");
			System.out.println("\nScreen" + ScreenTime.substring(0, 7));
			System.out.println("Raw Cost: " + RawCost);
			System.out.println("Net Cost: " + NetCost);

		} else {
			System.out.println("Ticket Cancelled");
		}

	}

}
