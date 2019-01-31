package com.ge.smallworld.alpaca.requeststore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ge.smallworld.alpaca.requeststore.domain.Job;

public interface JobRepository extends CrudRepository<Job, Long>{
	public List<Job> findByExternalNameStartingWith(String externalNamePrefix);

}
