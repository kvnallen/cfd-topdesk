package com.unimed.cfd.usecases;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.unimed.cfd.models.Ticket;

@Service
public class GetTopdeskTickets {

	@Value("${app.topdesk.url}")
	private String baseUrl;
	
	public List<Ticket> get(){
		return null;
	}
}
