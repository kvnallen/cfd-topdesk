package com.unimed.cfd.incidents.gateways;

import java.util.List;

import com.unimed.cfd.configurations.Group;
import com.unimed.cfd.incidents.Incident;
import com.unimed.cfd.incidents.usecases.GetIncidentOptions;

public interface TopdeskGateway {

	List<Incident> get(GetIncidentOptions options);
	List<Group> getGroups();
	
}