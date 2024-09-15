package org.example.behavouraldesingpatterns.obserser;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Subscriber> subList = new ArrayList<>();

    private String title;

    @Override
    public void subscribe(Subscriber sub) {
        subList.add(sub);
    }

    @Override
    public void unSubscribe(Observer sub) {
        subList.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        subList.forEach(Subscriber::update);
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();

    }

    public String getTitle() {
        return title;
    }
}
