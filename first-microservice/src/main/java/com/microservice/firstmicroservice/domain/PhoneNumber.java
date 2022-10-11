package com.microservice.firstmicroservice.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor

public class PhoneNumber {

    @JacksonXmlProperty
    private String type;

    @JacksonXmlProperty
    private String number;
}
