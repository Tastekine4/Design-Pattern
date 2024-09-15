package org.example.creationaldesignpatterns.builderdesignpattern;

public class Shop {

    public static void main(String[] args) {

        // What if I don't want to give all value, and if my contructor is too complex(have too much to set)
        Phone p = new Phone("Android",4, "QualComm", 5.5, 3200);
        System.out.println(p);

        // Here as you can see more flexible.
        Phone p2 = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
        System.out.println(p2);
    }
}
