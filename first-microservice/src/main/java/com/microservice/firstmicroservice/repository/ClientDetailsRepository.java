package com.microservice.firstmicroservice.repository;

import com.microservice.firstmicroservice.domain.ClientDetails;
import org.springframework.data.repository.CrudRepository;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Integer> {
}
