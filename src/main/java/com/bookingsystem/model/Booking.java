package com.bookingsystem.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="booking")
public class Booking {
	private int roomNumber;
	private String clientName;
	
	public Booking() {
		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

}
