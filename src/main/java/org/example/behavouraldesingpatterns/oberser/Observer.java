package org.example.behavouraldesingpatterns.oberser;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
