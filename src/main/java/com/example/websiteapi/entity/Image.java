package com.example.websiteapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "project_id")
    private int projectId;

    @Column(name = "url")
    private String url;
}
