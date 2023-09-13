package com.tushar;

import java.util.Scanner;

public class Vid12_PracticeSet002 {
    public static void main(String[] args) {
        //Q01
        float b = 7/4*9/2; //(((7/4=1)*9=9)/2=4) = 4.0
        System.out.println(b);

        //Q02
        char grade= 'B';
        grade = (char) (grade + 8);//encrypting
        System.out.println(grade);
        grade = (char) (grade - 8);//decrypting
        System.out.println(grade);

        //Q03
        int giveNum = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int userNum = input.nextInt();
        input.close();

        if(userNum < giveNum) {
            System.out.println("Given number is greater than user number.");
        } else {
            System.out.println("Given number is not greater than user number.");
        }

        //Q04
        //-int v,u,a,s;
        //int result = ((v*v)-(u*u))/(2*a*s);

        //Q05
        //-int x = 7;
        int z = 7*49/7+35/7; //((7*49=343)/7=49)+(35/7=5)=54
        System.out.println(z);
    }
}
