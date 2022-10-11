package com.microservice.secondmicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="clientDetails")
public class ClientDetails {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer clientId;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    @Embedded
    private Address address;

  /*  @Embedded
    private ArrayList<PhoneNumber> phoneNumbers;*/
}


