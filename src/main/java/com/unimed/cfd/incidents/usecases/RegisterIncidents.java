package com.unimed.cfd.incidents.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.unimed.cfd.incidents.Incident;
import com.unimed.cfd.incidents.gateways.TopdeskGateway;
import com.unimed.cfd.persistence.TicketRepository;

@Service

public class RegisterIncidents {

	private final String MIDNIGHT = "0 0 23 * * *";

	private TicketRepository repository;
	private TopdeskGateway client;

	@Autowired
	public RegisterIncidents(TicketRepository repository, TopdeskGateway client) {
		this.repository = repository;
		this.client = client;
	}

	@Scheduled(cron = MIDNIGHT)
	public void register() {
		List<Incident> incidents = client.get(null);
		repository.saveAll(incidents);
	}

	public void register(List<Incident> incidents) {
		repository.saveAll(incidents);
	}
}
