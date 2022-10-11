package com.microservice.secondmicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class Address {

    private String streetAddress;
    private String city;
    private String state;
}
