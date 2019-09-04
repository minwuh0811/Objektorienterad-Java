package com.company;

import java.util.Scanner;

public class AddS {
    private String s;
    private int b;
    private Scanner sc;
    public AddS(Scanner sc){
        this.sc=sc;
    }
    public static void main(String[] args) {
        AddS main=new AddS(new Scanner(System.in));
        System.out.println("Enter a integer:");
        String string=main.getString();
        int a = Integer.parseInt(string);
        System.out.println("Enter a string:");
        string=main.getString();
        main.addS(a,string);
    }

    public String addS(int b, String s) {
        int i = 0;
        while (i<b) {
            s+="s";
            i++;
        }
        System.out.println(s);
        return s;
    }

    public String getString() {
        return sc.nextLine();
    }

}
