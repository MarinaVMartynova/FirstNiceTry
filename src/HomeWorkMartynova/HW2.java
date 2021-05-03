package HomeWorkMartynova;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(checkSum1020(10, 20));
        System.out.println("*************");
        System.out.println(checkPositive(-0));
        System.out.println("*************");
        System.out.println(checkIfTrue(7));
        System.out.println("*************");
        printStringNumber("Hello", 5);
        System.out.println("*************");
        System.out.println(checkYear(2020));
    }
           public static boolean checkSum1020(int a, int b) {
            if ((a + b) >= 10 && (a + b) <= 20) {
                return true;
            } else {
                return false;
            }
        }

        public static String checkPositive(int x) {
        if (x >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
        }

    public static boolean checkIfTrue(int A) {
        if (A >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printStringNumber(String efg, int abc) {
        for (int i = 1; i <=abc; i++) {
            System.out.println(efg);
        }
    }

    public static boolean checkYear(int Y) {
        if (Y%4 == 0 && Y%100 != 0 || Y%400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

