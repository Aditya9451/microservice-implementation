package com.microservice.secondmicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Embeddable
public class PhoneNumber {

        private String type;
        private String number;

}
