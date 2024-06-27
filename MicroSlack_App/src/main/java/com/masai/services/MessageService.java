package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Message;
import com.masai.repository.MessageDAO;

@Service
public class MessageService {

    private final MessageDAO messageDAO;

    @Autowired
    public MessageService(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    public Optional<Message> getMessageById(Long id) {
        return messageDAO.getMessageById(id);
    }

    public Message saveMessage(Message message) {
        return messageDAO.saveMessage(message);
    }

    public void deleteMessage(Long id) {
        messageDAO.deleteMessage(id);
    }
}