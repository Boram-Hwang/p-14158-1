package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Post {
    @Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private int id; // INT
    private String title; // varchar(255)
    @Column(columnDefinition = "TEXT")
    private String content;


    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
