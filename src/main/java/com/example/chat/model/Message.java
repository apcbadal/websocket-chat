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
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "sender_id")
    private Long senderId;

    @Column(name = "message_type", nullable = false)
    private String messageType;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "status")
    private String status;

    // Getters and setters
}
