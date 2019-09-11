package com.company;

import java.util.Scanner;

public class printGuest {
    public static Scanner sc;

public printGuest(Scanner sc) {
    this.sc=sc;
}

    public static void main(String[] args) {
    while(true) {
        System.out.println("Send in a String or Type Exit");
        String string=getStringInput();
        if (string.equals("Exit")) {

            break;
        }
        printGuest.print(string);
        }
    }
private static void print(String string){
    System.out.println("Hi " + string);
}

public static String getStringInput(){
    Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
    return s;
}
public static int getIntInput(){
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    return i;
}
}