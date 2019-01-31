package com.ge.smallworld.alpaca.requeststore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	private String externalName;
	private String rawJson;

	public Job(Long id, String externalName, String rawJson) {
		this.id = id;
		this.externalName = externalName;
		this.rawJson = rawJson;
	}

	public String getRawJson() {
		return rawJson;
	}

	public void setRawJson(String rawJson) {
		this.rawJson = rawJson;
	}

	public String getExternalName() {
		return externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

}
