package com.unimed.cfd.incidents.usecases;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.unimed.cfd.incidents.Incident;
import com.unimed.cfd.incidents.Register;
import com.unimed.cfd.incidents.gateways.RegisterRepository;
import com.unimed.cfd.incidents.gateways.TopdeskGateway;

import lombok.val;

@Service
@Transactional
public class RegisterIncidents {

	private final String CRON_TIME = "0 0 23 * * *";
	private TopdeskGateway client;
	private RegisterRepository registerRepository;

	@Autowired
	public RegisterIncidents(RegisterRepository registerRepository, TopdeskGateway client) {
		this.registerRepository = registerRepository;
		this.client = client;
	}

	@Scheduled(cron = CRON_TIME)
	public void register() {

		// search all enabled configs
		// get all incidents for each one
		// create a new new register

		List<Incident> incidents = client.get(null);
		val register = new Register(incidents);

		registerRepository.save(register);
	}
}
