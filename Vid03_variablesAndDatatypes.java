package com.tushar;

public class Vid03_variablesAndDatatypes {
    public static void main(String[] args) {
        /*
         * Primitive Data Type
         * Java is a Statically Types Language -> Variables must be declared before usee
         * 
         * *Primitive Data Type
         * 1) byte : Value ranges from -128 to 127
         *          takes 1 byte 
         *          default value is 0
         * 2) short : Value ranges from -(pow(2,16)/2) to (pow(2,16)/2)-1
         *          takes 2 byte 
         *          default value is 0
         * 3) int : Value ranges from -(pow(2,32)/2) to (pow(2,32)/2)-1
         *          takes 4 byte 
         *          default value is 0
         * 4) float : see docs for range
         *          takes 4 byte 
         *          default value is 0.0f
         * 5) long : Value ranges from -(pow(2,64)/2) to (pow(2,64)/2)-1
         *          takes 8 byte 
         *          default value is 0l
         * 6) double : see docs for range (this is default type)
         *          takes 8 byte 
         *          default value is 0.0d
         * 7) char : Value ranges from 0 to (pow(2,16))-1
         *          takes 2 byte -> because it supports unicode
         *          default value is '\u0000'
         * 8) boolean : Value can be true/false or 1/0
         *          size depends on jvm
         *          default value is 1 or true
         */

         int num1 = 100, num2 = 57, num3 = 987;
         int add = num1 + num2 + num3;
         System.out.println(add);
    }
}
