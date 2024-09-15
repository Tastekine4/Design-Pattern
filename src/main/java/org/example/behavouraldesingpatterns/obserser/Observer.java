package org.example.behavouraldesingpatterns.obserser;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
