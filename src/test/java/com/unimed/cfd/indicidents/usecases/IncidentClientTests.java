package com.unimed.cfd.indicidents.usecases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unimed.cfd.incidents.Incident;
import com.unimed.cfd.incidents.gateways.TopdeskGateway;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class IncidentClientTests {

	@Autowired
	TopdeskGateway client;
	
	List<Incident> incidents;
	
	@Before
	public void setUp() {
		incidents = client.get(null);
	}
	
	@Test
	public void get_whenCalled_returnIncidents() {
		assertNotNull(incidents);
		assertFalse(incidents.isEmpty());
	}
	
	@Test
	public void get_dataShouldBeFilled() {
		incidents.stream().forEach(i -> {
			assertNotNull(i.getStatus());
			assertNotNull(i.getCallDate());
		});
	}
}
