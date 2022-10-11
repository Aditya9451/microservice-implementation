package com.microservice.firstmicroservice.controller;

import com.microservice.firstmicroservice.ClientDetailsService;
import com.microservice.firstmicroservice.domain.ClientDetails;
import com.microservice.firstmicroservice.exception.ClientDetailsEmptyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first")
@Slf4j
public class FirstServiceController {

    @Autowired
    private ClientDetailsService clientDetailsService;

    @GetMapping(value = "/retrieveClientDetails", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<ClientDetails> retrieveClientDetails(@RequestParam Integer clientId) {

        log.info("Client Id is {}", clientId);

        if (clientId == null)
            throw new ClientDetailsEmptyException(" client id is empty");
        else {
            ClientDetails clientDetailsResponse = clientDetailsService.findById(clientId);
            return ResponseEntity.ok().body(clientDetailsResponse);
        }
    }

    @PostMapping(value = "/clientdetails")
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
