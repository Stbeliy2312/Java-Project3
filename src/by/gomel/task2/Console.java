package by.gomel.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    protected static void getMenu() {
        System.out.println("You want:" + '\n' + "1) The largest common divisor of two numbers;" + '\n' + "2) The smallest common multiple of two numbers.");
        Scanner scan = new Scanner(System.in);
        try {
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Enter two numbers");
                    Number.getLCD(scan.nextInt(), scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    Number.getSCM(scan.nextInt(), scan.nextInt());
                    break;
                default:
                    System.out.println("Error! You need enter 1 or 2");
                    getMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! You need enter 1 or 2");
            getMenu();
        } finally {
            scan.close();
        }
    }

}
