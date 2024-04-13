package com.example.chat.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
class ContactId implements Serializable {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "contact_id")
    private Long contactId;

    // Getters and setters
}
