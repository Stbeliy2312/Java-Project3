package by.gomel.task1;

public class Number {

    protected static void checkNumber(int number) {
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
        }
        if (number > 2 && number % 2 == 0 || number > 3 && number % 3 == 0 || number > 5 && number % 5 == 0 || number > 7 && number % 7 == 0
                || number > 11 && number % 11 == 0) {
            System.out.print(" prime number");
        } else {
            System.out.print(" composite number");
        }
    }
}
