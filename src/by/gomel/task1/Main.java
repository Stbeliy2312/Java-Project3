package by.gomel.task1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the integer number");
        Scanner scan = new Scanner(System.in);
        try {
            Number.checkNumber(scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error, not integer number");
        } finally {
            scan.close();
        }
    }
}

