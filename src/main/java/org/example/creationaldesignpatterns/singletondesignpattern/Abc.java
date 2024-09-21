package org.example.creationaldesignpatterns.singletondesignpattern;

public class Abc {

    public static Abc instance;


    // We should have private method for accessing it only in this class for singleton
    private Abc() {
        System.out.println("Instance Created.");
    }


    /**
     * Instead if synchronized and double-checked we can use Enum concept
     * See it in the Main class
     */



    /**
     * Instead of synchronized we can use double-checked locking concept
     */
//    public static Abc getInstance() {
//
//        if (instance == null) {
//            synchronized (Abc.class) {
//                instance = new Abc();
//            }
//        }
//        return instance;
//    }


    /**
     * One way is creating method with synchronized
     * @return
     */
//    public static synchronized Abc getInstance() {
//        if (instance == null) {
//            instance = new Abc();
//        }
//        return instance;
//    }


}
