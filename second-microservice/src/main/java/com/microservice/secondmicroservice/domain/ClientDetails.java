package com.microservice.secondmicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDetails {

    public String firstName;
    public String lastName;
    public String gender;
    public int age;
    public Address address;
    public ArrayList<PhoneNumber> phoneNumbers;
}

 class Address{
    public String streetAddress;
    public String city;
    public String state;
}

 class PhoneNumber{
    public String type;
    public String number;
}
