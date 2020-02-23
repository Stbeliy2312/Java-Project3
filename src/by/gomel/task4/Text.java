package by.gomel.task4;

public class Text {

    protected static void getNumberWords(String text, String searchingWord) {
        int numberWords = 0;
        char s;
        if (searchingWord.equalsIgnoreCase(" ")) {
            System.out.println("Error! You must enter the word!");
        } else {
            text = text.toLowerCase();
            searchingWord = searchingWord.toLowerCase();
            String[] whitespace = text.split(" ");
            for (String word : whitespace) {
                if (word.indexOf(searchingWord) != -1 && (word.length() == searchingWord.length() || word.length() - 1 == searchingWord.length())) { //I used "word.length() - 1" because the word can be with a symbol
                    numberWords++;
                }
            }
            if (numberWords == 1){
                s = ' ';
            } else {s = 's';}
            System.out.println(numberWords + " word" + s + " in the text");
        }
    }

}
