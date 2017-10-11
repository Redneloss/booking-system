package com.bookingsystem.ws;

import com.bookingsystem.model.Booking;
import com.bookingsystem.resourses.BookingResponse;

public interface BookingWS {
	public BookingResponse create(Booking booking);

	public Booking update(Booking booking);

	public Booking delete(int id);

	public Booking get(int id);

}
