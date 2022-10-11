package com.microservice.firstmicroservice.domain;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    @JacksonXmlProperty
    private String streetAddress;

    @JacksonXmlProperty
    private String city;

    @JacksonXmlProperty
    private String state;
}
