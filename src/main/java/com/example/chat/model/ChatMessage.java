package com.example.chat.model;

import com.example.chat.constants.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
    private String recipient;


    public enum MessageType {
        CHAT, LEAVE, JOIN
    }
}
