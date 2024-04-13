package com.example.chat.service;

import com.example.chat.model.Message;
import com.example.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepository messageRepository;
    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }
}
