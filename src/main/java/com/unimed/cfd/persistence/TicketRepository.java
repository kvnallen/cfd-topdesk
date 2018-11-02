package com.unimed.cfd.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimed.cfd.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
