package com.company;

import java.util.Scanner;

public class Operationerna {
    private int a;
    private int b;
    private String results;
    private Scanner sc;
    public Operationerna(Scanner sc){
        this.sc=sc;
    }


    public static void main(String[] args) {
        Operationerna main=new Operationerna(new Scanner(System.in));
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
               System.out.println("Result " + d + " is a primtal");

            } else {
               System.out.println("Result " + d + " is not a primtal");}
        }
        else if (c.equals("-")) {
            int d = main.Substraction(a,b);
            if (main.primtal(d)) {
                System.out.println("Result " + d + " is a primtal");

            } else {
                System.out.println("Result " + d + " is not a primtal");}
        }
        else if (c.equals("*")) {
            int d =main.Muplikation(a,b);
            if (main.primtal(d)) {
                System.out.println("Result " + d + " is a primtal");

            } else {
                System.out.println("Result " + d + " is not a primtal");}
        }
        else if (c.equals("/")) {
            int d = main.Division(a,b);
            if (main.primtal(d)) {
                System.out.println("Result " + d + " is a primtal");

            } else {
                System.out.println("Result " + d + " is not a primtal");}
        }

        else if (c.equals("root ut")) {
            int d = main.SquareRoot(a,b);
            if (main.primtal(d)) {
                System.out.println("Result " + d + " is a primtal");

            } else {
                System.out.println("Result " + d + " is not a primtal");}
        }

            }


    public int Addition(int a, int b) {
        int c=a+b;
        System.out.println( a + " + " + b + " = " + c);
        return c;
    }

    public int Substraction(int a,int b){
        int c=a-b;
        System.out.println(a + " - " + b + " = " + c);
        return c;
    }

    public int Muplikation(int a, int b){
        int c=a*b;
        System.out.println(a + " * " + b + " = " + c);
        return c;

    }
    public int Division(int a, int b){
        try {
            float c= (float)a/b;
            Math.round(c);
            System.out.println(a + " / " + b + " = " + c);
            return (int)c;
        }  catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int SquareRoot(int a, int b) {
        int c=(int)Math.round(Math.sqrt(Muplikation(a,a)+Muplikation(b,b)));
        System.out.println("square root of " + a+ " and " + b + " = " + c);
        return c;
    }

    public static boolean primtal(int a) {
        boolean c;
        if (a==1||a<=0){
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        return true;}

    }

    public String getString() {
        return sc.nextLine();
    }
}
