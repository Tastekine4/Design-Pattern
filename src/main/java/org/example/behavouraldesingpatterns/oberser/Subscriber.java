package org.example.behavouraldesingpatterns.oberser;

public class Subscriber implements Observer {
    String name;
    Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey : " + this.name + " Video Uploaded: " + channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
