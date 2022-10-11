package com.microservice.firstmicroservice;

import com.microservice.firstmicroservice.domain.ClientDetails;
import com.microservice.firstmicroservice.repository.ClientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientDetailsService {

    @Autowired
    private ClientDetailsRepository clientDetailsRepository;

    public ResponseEntity<ClientDetails> saveClientDetails(ClientDetails clientDetails) {

        ClientDetails clientDetailsResponse = clientDetailsRepository.save(clientDetails);

        return ResponseEntity.ok(clientDetails);
    }

    public ClientDetails findById(Integer clientId) {

        Optional<ClientDetails> clientDetails = clientDetailsRepository.findById(clientId);
        if (clientDetails.isEmpty())
            return clientDetails.get();

        return null;
    }
}
