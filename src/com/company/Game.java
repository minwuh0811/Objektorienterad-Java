package com.company;

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
        System.out.println("Player 1 set a number:");
        String string=sc.nextLine();
        int player1=Integer.parseInt(string);
        int i=1;
        while(i<=5) {
            if (i == 6) {
                System.out.println("Oops!! You lose the Game!!");
            } else {
                System.out.println("Player 2 guess a number:");
                int player2 = Integer.parseInt(sc.nextLine());
                if (player2 > player1) {
                    System.out.println("The number " + player2 + " is larger than it is supposed to be.\n Continue to guess: ");
                    i++;
                } else if (player2 < player1) {
                    System.out.println("The number " + player2 + " is smaller than it is supposed to be.\n Continue to guess: ");
                    i++;
                } else if (player2 == player1) {
                    System.out.println(" You win!!");
                    break;
                }

            }
        }



    }
}
