package com.microservice.firstmicroservice.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="clientDetails")
@JacksonXmlRootElement(localName = "clientDetails")
public class ClientDetails implements Serializable {

    private static final long serialVersionUID = 21L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @JacksonXmlProperty
    private Integer clientId;
    @JacksonXmlProperty
    private String firstName;

    @JacksonXmlProperty
    private String lastName;

    @JacksonXmlProperty
    private String gender;

    @JacksonXmlProperty
    private int age;
    @Embedded
    @JacksonXmlProperty
    private Address address;

    @JacksonXmlProperty
    private ArrayList<PhoneNumber> phoneNumbers;

    @Override
    public String toString() {
        return "ClientDetails{" +
                "clientId='" + clientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

