package com.unimed.cfd.configurations.usecases;

import org.springframework.stereotype.Service;

import com.unimed.cfd.configurations.Configuration;
import com.unimed.cfd.configurations.gateways.ConfigurationRepository;

@Service
public class SaveConfiguration {

	private ConfigurationRepository repository;


	public SaveConfiguration(ConfigurationRepository repository) {
		this.repository = repository;
	}
	
	
	public void save(Configuration config) {
		// check if group id's are valid
		// check if username && password are valid
		
		repository.save(config);
	}
}
