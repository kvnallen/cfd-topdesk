package com.unimed.cfd.incidents.gateways;

import com.unimed.cfd.configurations.Group;
import com.unimed.cfd.incidents.Incident;
import com.unimed.cfd.incidents.usecases.GetIncidentOptions;

import lombok.val;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
public class IncidentClientImpl implements TopdeskGateway {

    @Value("${app.topdesk.url}")
    private String baseUrl;
    
    @Value("${app.topdesk.username}")
    private String username;
    
    @Value("${app.topdesk.password}")
    private String password;

    RestTemplate rest = new RestTemplate();

    @Override
    public List<Incident> get(GetIncidentOptions options) {
        String incidentsResource = baseUrl + "/incidents";
        rest.setInterceptors(Arrays.asList(new BasicAuthenticationInterceptor(username, password)));
        
        return Arrays.asList(rest.getForObject(incidentsResource, Incident[].class));
    }

	@Override
	public List<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}
}
