package com.unimed.cfd.incidents.usecases;

import lombok.Value;

@Value
public class GetIncidentOptions {

	private int pageSize;
	private int page;
	private String[] groups;
}
