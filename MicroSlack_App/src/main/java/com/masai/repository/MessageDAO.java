package com.masai.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.masai.model.Message;


@Repository
public class MessageDAO {
    private final List<Message> messages = new ArrayList<>();

    public MessageDAO() {
        messages.add(new Message(1L, "Hello, world!", 1L));
        messages.add(new Message(2L, "How's it going?", 1L));
    }

    public List<Message> getAllMessages() {
        return messages;
    }

    public Optional<Message> getMessageById(Long id) {
        return messages.stream().filter(message -> message.getId().equals(id)).findFirst();
    }

    public Message saveMessage(Message message) {
        messages.add(message);
        return message;
    }

    public void deleteMessage(Long id) {
        messages.removeIf(message -> message.getId().equals(id));
    }
}
