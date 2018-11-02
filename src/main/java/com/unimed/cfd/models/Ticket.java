package com.unimed.cfd.models;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Ticket {

	@Id
	private int id;
	
	private String ticketNumber;
	private Date date;
	private TicketStatus status;
}
