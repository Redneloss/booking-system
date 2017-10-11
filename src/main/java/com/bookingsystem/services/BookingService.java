package com.bookingsystem.services;

import com.bookingsystem.model.Booking;

public interface BookingService {
	public Booking createBooking(int roomNumber, String customerName);
}
