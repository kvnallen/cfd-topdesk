package com.unimed.cfd.configurations.usecases;

import org.springframework.stereotype.Service;

import com.unimed.cfd.configurations.IncidentConfiguration;
import com.unimed.cfd.configurations.IncidentConfigurationRepository;

@Service
public class SaveConfiguration {

	private IncidentConfigurationRepository repository;


	public SaveConfiguration(IncidentConfigurationRepository repository) {
		this.repository = repository;
	}
	
	
	public void save(IncidentConfiguration config) {
		// check if group id's are valid
		// check if username && password are valid
		
		repository.save(config);
	}
}
