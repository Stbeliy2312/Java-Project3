package by.gomel.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence length for finding numbers palindrome from 0 to 100");
        try {
            Number.getPalindrome(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error, not integer number");
        } finally {
            scanner.close();
        }
    }
}
