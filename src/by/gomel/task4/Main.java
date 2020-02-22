package by.gomel.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        System.out.println("Enter the searching word");
        String searchingWord = scanner.nextLine();
        Text.getNumberWords(text, searchingWord);
        scanner.close();
    }
}

