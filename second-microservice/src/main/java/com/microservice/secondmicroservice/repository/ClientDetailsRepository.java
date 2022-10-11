package com.microservice.secondmicroservice.repository;

import com.microservice.secondmicroservice.domain.ClientDetails;
import org.springframework.data.repository.CrudRepository;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Integer> {
}
