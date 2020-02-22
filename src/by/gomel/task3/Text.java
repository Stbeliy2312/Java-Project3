package by.gomel.task3;
import java.util.ArrayList;
import java.util.Collections;

public class Text {

    protected static void getNumberWords(String text) {
        int numberWords = 0;
        if (text.length() != 0) { //check for write words
            numberWords++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    numberWords++;
                }
            }
        }
        System.out.println("You enter " + numberWords + " words");
    }


    protected static void getListWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        String[] whitespace = text.split(" ");
        for (String word : whitespace) {
            String s1 = word.substring(0, 1).toUpperCase() + word.substring(1);
            words.add(s1);}
            Collections.sort(words);
            System.out.println(words);
        }

    }


