package by.gomel.task2;

public class Number {

    protected static void getLCD(int num1, int num2) {
        int lcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                lcd = i;
            }
        }
        System.out.println(lcd);
    }


    protected static void getSCM(int num3, int num4) {
        int scm;
        if (num3 < num4) scm = num4;
        else scm = num3;
        boolean t = true;
        while (t) {
            if ((scm % num3 == 0) && (scm % num4 == 0)) break;
            else scm += 1;
        }
        System.out.println(scm);
    }

}

