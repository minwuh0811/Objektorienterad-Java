package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int player1;
    private int player2;
    private static Scanner sc;

    public Game(Scanner sc){
        this.sc=sc;
    }
    public static void main(String[] args) {
        Game main=new Game(new Scanner(System.in));
        Random random=new Random();
//        System.out.println("Player 1 set a number:");
//        String string=sc.nextLine();
//        int player1=Integer.parseInt(string);
        int player1=random.nextInt(100);
       // System.out.println(player1);
        int i=10;
        while(i>-1) {
            if (i == -1) {
                System.out.println("Oops!! You lose the Game!!");
            } else {
                System.out.println("Player 2 guess a number:");
                int player2 = Integer.parseInt(sc.nextLine());
                if (player1-5 <= player2   && player2 <= player1+5 && player2!=player1) {
                    System.out.println("Oops, you lose en extra life.");
                    if (player2>player1) {
                        System.out.println("The number " + player2 + " is larger than it is supposed to be.\n Continue to guess: ");
                    } else {
                        System.out.println("The number " + player2 + " is smaller than it is supposed to be.\n Continue to guess: ");
                    }
                    i-=2;
                    System.out.println("You have " + i + " life left.");
                } else if (player2 > player1+5) {
                    System.out.println("The number " + player2 + " is larger than it is supposed to be.\n Continue to guess: ");
                    i--;
                    System.out.println("You have " + i + " life left.");
                } else if (player2 < player1-5) {
                    System.out.println("The number " + player2 + " is smaller than it is supposed to be.\n Continue to guess: ");
                    i--;
                    System.out.println("You have " + i + " life left.");
                } else if (player2 == player1) {
                    System.out.println(" You win!!");
                    break;
                }

            }
        }



    }
}
