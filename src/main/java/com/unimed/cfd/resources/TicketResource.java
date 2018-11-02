package com.unimed.cfd.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimed.cfd.models.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketResource {

	@GetMapping
	public List<Ticket> getAll(){
		
	}
}
