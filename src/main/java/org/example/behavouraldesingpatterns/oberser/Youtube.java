package org.example.behavouraldesingpatterns.oberser;

public class Youtube {

    public static void main(String[] args) {
        Channel tastekine = new Channel();

        Subscriber s1 = new Subscriber("Erhan");
        Subscriber s2 = new Subscriber("name2");
        Subscriber s3 = new Subscriber("name3");
        Subscriber s4 = new Subscriber("name4");
        Subscriber s5 = new Subscriber("name5");

        tastekine.subscribe(s1);
        tastekine.subscribe(s2);
        tastekine.subscribe(s3);
        tastekine.subscribe(s4);
        tastekine.subscribe(s5);

        s1.subscribeChannel(tastekine);
        s2.subscribeChannel(tastekine);
        s3.subscribeChannel(tastekine);
        s4.subscribeChannel(tastekine);
        s5.subscribeChannel(tastekine);

        tastekine.upload("Design Patterns with Java");
    }


}
