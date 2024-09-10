package com.fullstackapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Persistent;

@Data
@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String firstName;
    String lastName;
    String email;
    String password;
}