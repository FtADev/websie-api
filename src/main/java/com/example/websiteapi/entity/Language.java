package com.example.websiteapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lang")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;
}
