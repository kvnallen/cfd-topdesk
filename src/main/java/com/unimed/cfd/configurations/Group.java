package com.unimed.cfd.configurations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Group {

	@Id
	private int id;

	@NotEmpty(message = "O ID do grupo é obrigatório")
	private String groupId;

	@NotEmpty
	private String title;
}
