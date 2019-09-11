package com.company;

import java.util.Scanner;

public class GameDataGuess {
    private static Scanner sc;
    public GameDataGuess(Scanner sc){
        this.sc=sc;
    }

    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 100;
        int guessNumber = 50;
        int i=1;
        GameDataGuess main = new GameDataGuess(new Scanner(System.in));
        System.out.println("Please choose a number in the range of 0-100 and keep it,and I will soon know what you are thinking!!!\n");
        while (true) {
            System.out.println("Is this number " + guessNumber + "? Press y to yes or Press n to no.\n");
            String string = sc.nextLine();
            if (string.equals("y")) {
                System.out.println("Hoho, I got it!!!\n");
                break;
            } else {
                System.out.println("Is this number larger than " + guessNumber + "? Press y to yes or Press n to no.\n");
                string = sc.nextLine();
                if (string.equals("y")) {
                    minNumber = guessNumber;
                    guessNumber = main.middleNumber(maxNumber, guessNumber);
                } else {
                    maxNumber = guessNumber;
                    guessNumber = main.middleNumber(minNumber, guessNumber);
                }
                i++;
            }
        }
        System.out.println("I guess the " + i + " times.\n");
        if (i<=5) {
            System.out.println("I am impossible good!!");
        } else if (i>5 && i<=10) {
            System.out.println("Not so bad!!");
        } else if (i>10) {
            System.out.println("I am not myself！！");
        }

    }

    public int middleNumber(int a, int b){
        return (a+b)/2;
    }

}
