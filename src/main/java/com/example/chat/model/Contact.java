package com.example.chat.model;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "contacts")
public class Contact {
    @EmbeddedId
    private ContactId contactId;

    @Column(name = "nickname")
    private String nickname;

    // Getters and setters
}
