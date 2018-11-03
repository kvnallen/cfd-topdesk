package com.unimed.cfd.incidents;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import lombok.val;

public class TopdeskIncidentDeserializer extends StdDeserializer<Incident> {

	private static final long serialVersionUID = 1L;

	public TopdeskIncidentDeserializer() {
		this(null);
	}
	
	protected TopdeskIncidentDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Incident deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);
		
		val incident = new Incident();
		incident.setId(node.get("id").asText());
		incident.setCategory(node.get("category").get("name").asText());
//		incident.setCallDate(node.get("callDate").as);
		incident.setTicketNumber(node.get("number").asText());
		
		return incident;
	}

}
