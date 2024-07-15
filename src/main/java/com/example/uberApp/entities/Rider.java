package com.example.uberApp.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private User user;

    private Double rating;
}
