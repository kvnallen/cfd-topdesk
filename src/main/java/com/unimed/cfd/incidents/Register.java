package com.unimed.cfd.incidents;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Register {
	
	public Register(List<Incident> incidents) {
		super();
		this.incidents = incidents;
	}

	@Id
	private int id;
	
	@CreatedDate
	private Date createdAt;
	
	private List<Incident> incidents;
}
