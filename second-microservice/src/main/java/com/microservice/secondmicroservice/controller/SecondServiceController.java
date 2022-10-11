package com.microservice.secondmicroservice.controller;

import com.microservice.secondmicroservice.domain.ClientDetails;
import com.microservice.secondmicroservice.exception.ClientDetailsEmptyException;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping(value = "/clientdetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientDetails> createMessage(@RequestBody ClientDetails clientDetails) {

        log.info("Message Request body is {}", clientDetails);
        if (clientDetails == null)
            throw new ClientDetailsEmptyException("Message body is empty");

        else return ResponseEntity.ok().body(clientDetails);
    }

}
