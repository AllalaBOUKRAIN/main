package com.sip.ams.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Provider;


@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
	
	@Query("SELECT p FROM Provider p WHERE p.address like %?1")
	Collection<Provider> findProvidersByAddress(String adress);
	

}
