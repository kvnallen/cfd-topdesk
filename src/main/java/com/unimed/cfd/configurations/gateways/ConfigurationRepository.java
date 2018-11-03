package com.unimed.cfd.configurations.gateways;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.cfd.configurations.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {

}
