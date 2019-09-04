package com.company;

import java.util.Scanner;

public class Kalkylation {


    public static void main(String[] args) {
        Operationerna main=new Operationerna(new Scanner(System.in));
        while(true) {
            System.out.println("Enter a integer:");
            String string=main.getString();
            int a = Integer.parseInt(string);
            System.out.println("Enter another integer");
            string=main.getString();
            int b = Integer.parseInt(string);
            System.out.println("Enter an operation you want do:");
            String c=main.getString();
            if (c.equals("+")) {
                int d= main.Addition(a,b);
                if (main.primtal(d)) {
                    System.out.println("Result " + d + " is a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);

                } else {
                    System.out.println("Result " + d + " is not a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);}
            }
            else if (c.equals("-")) {
                int d = main.Substraction(a,b);
                if (main.primtal(d)) {
                    System.out.println("Result " + d + " is a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);

                } else {
                    System.out.println("Result " + d + " is not a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);
                }
            }
            else if (c.equals("*")) {
                int d =main.Muplikation(a,b);
                if (main.primtal(d)) {
                    System.out.println("Result " + d + " is a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);

                } else {
                    System.out.println("Result " + d + " is not a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);}
            }
            else if (c.equals("/")) {
                int d = main.Division(a,b);
                if (main.primtal(d)) {
                    System.out.println("Result " + d + " is a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);

                } else {
                    System.out.println("Result " + d + " is not a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);}
            }

            else if (c.equals("root ut")) {
                int d = main.SquareRoot(a,b);
                if (main.primtal(d)) {
                    System.out.println("Result " + d + " is a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);

                } else {
                    System.out.println("Result " + d + " is not a primtal\n");
                    System.out.println("Alla primtal smaller than " + d);
                    Kalkylation.mindrePrimtal(d);}
            }

            System.out.printf("press Q or q to Exist, otherwise continues.\n");
            string=main.getString();
            if (string.equals("Q")||string.equals("q")) {
                break;
            } else {
                continue;
            }

        }

    }

    public static void mindrePrimtal(int a) {
        a--;

        if (a <= 0 || a == 1) {
            System.out.println(++a + " has no mindre primtal");
        } else {
            while (a >= 2) {
                if (Operationerna.primtal(a)) {
                    System.out.println(a+ ",");
                    a--;
                } else {
                    a--;
                }

            }
        }
    }
}
