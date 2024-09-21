package org.example.creationaldesignpatterns.singletondesignpattern;

public class Main {
    public static void main(String[] args) {

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Abc obj = Abc.getInstance();
//            }
//        });
//
//        Thread t2 =  new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Abc obj = Abc.getInstance();
//            }
//        });
//        t1.start();
//        t2.start();
//    }

        Abc obj1 = Abc.INSTANCE;
        obj1.i = 5;
        obj1.show();

        Abc obj2 = Abc.INSTANCE;
        obj2.i = 6;

        obj1.show();

}

    /**
     * Enums thread safe and easy to implement so common usage can be this.
     */
    enum Abc {
        INSTANCE;

        int i;

        public void show() {
            System.out.println(i);
        }

    }
}
