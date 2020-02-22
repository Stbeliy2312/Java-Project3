package by.gomel.task2;

public class Number {

    protected static void getGCD(int num1, int num2) {
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                gcd = i;
            }
        }
        System.out.println(gcd);
    }


    protected static void getLCM(int num3, int num4) {
        int lcm;
        if (num3 < num4) lcm = num4;
        else lcm = num3;
        boolean t = true;
        while (t) {
            if ((lcm % num3 == 0) && (lcm % num4 == 0)) break;
            else lcm += 1;
        }
        System.out.println(lcm);
    }

}

