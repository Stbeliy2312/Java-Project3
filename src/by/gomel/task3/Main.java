package by.gomel.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        Text.getNumberWords(text);
        Text.getListWords(text);
        scanner.close();
    }
}
