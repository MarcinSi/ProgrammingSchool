package pl.coderslab.controller;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        int action = choseAction();
        switch (action) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
            case 4:
                System.out.println("Option 4");
                break;

        }
        public static String choseAction () {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("What do you want to do:");
                System.out.println("1 - Add user");
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


}
