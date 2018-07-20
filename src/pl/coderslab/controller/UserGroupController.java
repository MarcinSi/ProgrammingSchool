package pl.coderslab.controller;

import java.util.Scanner;

public class UserGroupController {


    static void startManagingUsers(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to do with User:");
            System.out.println("1 - Add ");
            System.out.println("2 - Add user group");
            System.out.println("3 - Add question");
            System.out.println("4 - Add answers");
            System.out.println("5 Take exam");

            try {
                int option = scan.nextInt();
                if (option < 1 || option > 5) {
                    throw new Exception("Wrong value");
                }
                return option;
            } catch (Exception e) {
                System.out.println("Wrong value");
            }
        }
    }
}
