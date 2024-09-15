package org.example;

import org.example.creationaldesignpatterns.factorydesignpattern.OS;
import org.example.creationaldesignpatterns.factorydesignpattern.OperatingSystemFactory;

public class Main {
    public static void main(String[] args) {
//        OS obj= new Android();
//        obj.spec();

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OS osObj = operatingSystemFactory.getInstance("Open");
        osObj.spec();
    }
}