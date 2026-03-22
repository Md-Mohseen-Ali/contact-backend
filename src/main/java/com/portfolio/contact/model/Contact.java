package com.portfolio.contact.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;

    private String name;
    private String email;
    private String message;
}