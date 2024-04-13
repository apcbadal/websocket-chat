package com.example.chat.service;

import com.example.chat.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    Message save(Message message);

}
