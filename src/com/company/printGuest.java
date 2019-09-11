package com.company;

import java.util.Scanner;

public class printGuest {
    Scanner sc;

public printGuest(Scanner sc) {
    this.sc=sc;
}

    public static void main(String[] args) {
        printGuest main=new printGuest(new Scanner(System.in));
        System.out.println("Send in a String.");
        String string=main.sc.nextLine();
        main.print(string);
    }
private void print(String string){

    System.out.println("Hi" + string);


}

}