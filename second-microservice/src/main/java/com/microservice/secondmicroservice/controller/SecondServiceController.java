package com.microservice.secondmicroservice.controller;

import com.microservice.secondmicroservice.domain.ClientDetails;
import com.microservice.secondmicroservice.exception.ClientDetailsEmptyException;
import com.microservice.secondmicroservice.service.ClientDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@Slf4j
public class SecondServiceController {

    @Autowired
    private ClientDetailsService clientDetailsService;

    @PostMapping(value = "/clientdetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientDetails> registerClientDetails(@RequestBody ClientDetails clientDetails) {

        log.info("Client Details Request body is {}", clientDetails);
        if (clientDetails == null)
            throw new ClientDetailsEmptyException("Message body is empty");
        else {
            ClientDetails clientDetailsResponse = clientDetailsService.saveClientDetails(clientDetails).getBody();
            return ResponseEntity.ok().body(clientDetailsResponse);
        }
    }

}
