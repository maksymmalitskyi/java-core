package org.example.homework3;

public class Task2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        if (a > b) {

            System.out.println("a is max " + a);
            System.out.println("b is min " + b);


        } else if (b > a) {

            System.out.println("b is max " + b);
            System.out.println("a is min " + a);

        } else {
            System.out.println("both equal");
        }
    }
}