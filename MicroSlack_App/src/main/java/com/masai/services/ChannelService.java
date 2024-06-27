package com.masai.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.model.Channel;
import com.masai.repository.ChannelDAO;

@Service
public class ChannelService {

    private final ChannelDAO channelDAO;

    @Autowired
    public ChannelService(ChannelDAO channelDAO) {
        this.channelDAO = channelDAO;
    }

    public List<Channel> getAllChannels() {
        return channelDAO.getAllChannels();
    }

    public Optional<Channel> getChannelById(Long id) {
        return channelDAO.getChannelById(id);
    }

    public Channel saveChannel(Channel channel) {
        return channelDAO.saveChannel(channel);
    }

    public void deleteChannel(Long id) {
        channelDAO.deleteChannel(id);
    }
}