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
@Table(name = "group_metadata")
public class GroupMetadata {
    @Id
    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "group_name", nullable = false)
    private String groupName;

    @Column(name = "group_picture")
    private String groupPicture;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Timestamp createdAt;

    // Getters and setters
}
