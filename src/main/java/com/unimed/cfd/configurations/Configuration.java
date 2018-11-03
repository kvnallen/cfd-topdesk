package com.unimed.cfd.configurations;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Entity
@Data
public class Configuration {

	@Id
	private int id;

	@NotEmpty
	private String description;

	@CreatedDate
	private Date date;

	@LastModifiedDate
	private Date lastModified;

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	@OneToMany
	@NotEmpty(message = "Você precisa definir no mínimo um grupo")
	private List<Group> groups;

	private boolean enabled;

	private Date lastRun;

}
