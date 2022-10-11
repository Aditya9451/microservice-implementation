package com.microservice.secondmicroservice.service;

import com.microservice.secondmicroservice.domain.ClientDetails;
import com.microservice.secondmicroservice.repository.ClientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsService {

    @Autowired
    private ClientDetailsRepository clientDetailsRepository;

    public ResponseEntity<ClientDetails> saveClientDetails(ClientDetails clientDetails){

        ClientDetails clientDetailsResponse =  clientDetailsRepository.save(clientDetails);

        return ResponseEntity.ok(clientDetails);
    }


}
