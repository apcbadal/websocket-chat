package com.example.chat.controller;

import com.example.chat.service.MessageService;
import com.example.chat.service.UserService;
import com.example.chat.model.ChatMessage;
import com.example.chat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    UserService userService;

    @Autowired
    MessageService messageService;

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public ChatMessage register(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        // Register the user and save into the database
        // userService.registerUser(chatMessage.getSender());
        // Set the username in the session attributes
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }


    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        String recipient = chatMessage.getRecipient();
        template.convertAndSendToUser(recipient, "/queue/private", chatMessage);

return chatMessage;
       // messageService.save(message);
    }
}
