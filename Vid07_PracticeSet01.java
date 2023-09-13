package com.tushar;

import java.util.Scanner;

public class Vid07_PracticeSet01 {
    public static void main(String[] args) {
        //Q01
        int num1 = 55, num2 = 30, num3 = 15;
        int sum = num1 + num2+ num3;
        System.out.println(sum);

        //Q02
        int sub1=90,sub2=45,sub3=67;
        float CGPA = (float) ((sub1+sub2+sub3)/300.0*100.0);
        System.out.println("CGPA = " + String.format("%.2f", CGPA));

        //Q03
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = sc.next();
        System.out.println("hello "+name+", have a good day!");
        sc.close();

        //Q04
        int km = 20;
        double miles;
        miles = (km * 0.621371);
        System.out.println(km+" km is equal to "+String.format("%.2f", miles)+ " miles.");

        //Q05
        System.out.println("Please enter a number : ");
        Scanner sc1 = new Scanner(System.in);
        if(sc1.hasNextInt()){
            System.out.println("It's an integer.");
        }else {
            System.out.println("It's not an integer.");
        }
        sc1.close();
    }
}
