package com.example.chat.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "chat_participants")
public class ChatParticipants {
    @EmbeddedId
    private ChatParticipantId id;

    @Column(name = "added_by")
    private Long addedBy;

    @Column(name = "added_at")
    private Timestamp addedAt;

    // Getters and setters
}
