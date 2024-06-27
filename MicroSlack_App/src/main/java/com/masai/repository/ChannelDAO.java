package com.masai.repository;

import org.springframework.stereotype.Repository;
import com.masai.model.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ChannelDAO {
    private final List<Channel> channels = new ArrayList<>();

    public ChannelDAO() {
        channels.add(new Channel(1L, "General"));
        channels.add(new Channel(2L, "Development"));
    }

    public List<Channel> getAllChannels() {
        return channels;
    }

    public Optional<Channel> getChannelById(Long id) {
        return channels.stream().filter(channel -> channel.getId().equals(id)).findFirst();
    }

    public Channel saveChannel(Channel channel) {
        channels.add(channel);
        return channel;
    }

    public void deleteChannel(Long id) {
        channels.removeIf(channel -> channel.getId().equals(id));
    }
}
