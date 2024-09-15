package org.example.behavouraldesingpatterns.chainofresponsibilitiy;

import org.example.behavouraldesingpatterns.chainofresponsibilitiy.handler.Handler;
import org.example.behavouraldesingpatterns.chainofresponsibilitiy.handler.RoleCheckHandler;
import org.example.behavouraldesingpatterns.chainofresponsibilitiy.handler.ValidPasswordHandler;

public class MainApp {

    public static void main(String[] args) {

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");

    }

}