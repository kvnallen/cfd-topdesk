package com.unimed.cfd.incidents;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unimed.cfd.resources.incidents.TopdeskIncidentDeserializer;

import lombok.Data;

@Entity
@Data
@JsonDeserialize(using = TopdeskIncidentDeserializer.class)
public class Incident {

	@Id
	private String id;

	private String ticketNumber;

	private Date callDate;

	private TicketStatus status;

	private String category;
}
