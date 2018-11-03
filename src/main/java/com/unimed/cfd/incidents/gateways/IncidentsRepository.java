package com.unimed.cfd.incidents.gateways;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.cfd.incidents.Incident;

public interface IncidentsRepository extends JpaRepository<Incident, Integer> {

}
