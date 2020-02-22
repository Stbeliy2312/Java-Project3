package by.gomel.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    protected static void getMenu() {
        System.out.println("You want:" + '\n' + "1) The greatest common divisor of two numbers;" + '\n' + "2) The least common multiple of two numbers.");
        Scanner scan = new Scanner(System.in);
        try {
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Enter two numbers");
                    Number.getGCD(scan.nextInt(), scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    Number.getLCM(scan.nextInt(), scan.nextInt());
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
