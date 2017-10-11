package com.bookingsystem.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.bookingsystem.model.Booking;
import com.bookingsystem.resourses.BookingResponse;
import com.bookingsystem.services.BookingService;
import com.bookingsystem.services.BookingServiceImpl;

@Path("/booking")
public class BookingWSImpl implements BookingWS {

	private BookingService service = new BookingServiceImpl();

	@Override
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public BookingResponse create(Booking booking) {

		service.createBooking(booking.getRoomNumber(), booking.getClientName());
		BookingResponse response = new BookingResponse();
		response.setStatus("Successful");
		response.setMessage(
				"Boking for room: " + booking.getRoomNumber() + " was created for " + booking.getClientName());
		return response;
	}

	@Override
	@PUT
	@Path("/update")
	public Booking update(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DELETE
	@Path("/delete/{id}")
	public Booking delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	@Path("/get/{id}")
	public Booking get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
