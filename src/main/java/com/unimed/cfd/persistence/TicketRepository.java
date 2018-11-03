package com.unimed.cfd.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.cfd.incidents.Incident;

public interface TicketRepository extends JpaRepository<Incident, Integer> {

}
