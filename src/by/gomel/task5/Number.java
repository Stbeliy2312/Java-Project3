package by.gomel.task5;

public class Number {

    public static void getPalindrome(int lenght) {
        if (lenght > 100) {
            System.out.println("Error! You must enter the sequence length from 0 to 100");
        } else {
            for (int i = 1; i <= lenght; i++) {
                int number = i;
                int original = number;
                int reverse = 0;
                for (int j = 0; j <= number; j++) {
                    int remain = number % 10;
                    number = number / 10;
                    reverse = reverse * 10 + remain;
                }
                System.out.println(original + "" + reverse);
            }
        }
    }

}
