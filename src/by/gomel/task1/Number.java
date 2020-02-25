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
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(" composite number");
            } else {
                System.out.print(" prime number");
            }
            break;
        }
    }

}
