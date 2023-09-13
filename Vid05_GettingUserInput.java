package com.tushar;

import java.util.Scanner;

/*
 * Reading data from the keyboard.
 * In order to read data from the keyboard, java has a Scanner class.
 * Scanner class has a lot of methods to read the data from the keyboard.
 */
public class Vid05_GettingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is "+name);
        System.out.println(sc.hasNext());
        sc.close();
    }
}
