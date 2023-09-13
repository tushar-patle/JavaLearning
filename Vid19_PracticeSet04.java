package com.tushar;

import java.util.Scanner;

public class Vid19_PracticeSet04 {
    public static void main(String[] args) {
        //Q01
        /*int a = 10;
        if(a==11){
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }*/

        //Q02
        /*Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        float avg = (sub1+sub2+sub3)/300.0f*100.0f;
        if(sub1>=33 && sub2>=33 && sub3>=33) {
            if(avg>=40.0f){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
        sc.close();*/

        //Q03
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income : ");
        float income = sc.nextFloat();
        float taxAmount = 0.0f;
        if(income<250000.0) {
            System.out.println("Exception from tax :)");
        } else if(income<=500000.0) {
            taxAmount = 250000*0.0f + (income-250000)*0.05f;
            System.out.println("Tax Amount : "+taxAmount);
        } else if(income<=1000000.0) {
            taxAmount = 250000*0.0f + (income-250000)*0.05f + (income-500000)*0.2f;
            System.out.println("Tax Amount : "+taxAmount);
        } else {
            taxAmount = 250000*0.0f + (income-250000)*0.05f + (income-500000)*0.2f+ (income-1000000)*0.3f;
            System.out.println("Tax Amount : "+taxAmount);
        }

    }
}
