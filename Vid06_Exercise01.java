package com.tushar;

import java.util.Scanner;

/*
 * Write a program to calculate percentagee of given student in CBSE exam.
 * marks for 5 subjects must be taken from user input (out of 100)
 */
public class Vid06_Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects : ");
        System.out.print("Subject 1 = ");
        int sub1 = input.nextInt();
        System.out.print("Subject 2 = ");
        int sub2 = input.nextInt();
        System.out.print("Subject 3 = ");
        int sub3 = input.nextInt();
        System.out.print("Subject 4 = ");
        int sub4 = input.nextInt();
        System.out.print("Subject 5 = ");
        int sub5 = input.nextInt();

        input.close();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total/500.0)*100.0;
        System.out.println("\nTotal percentage : "+percentage);
    }
}
